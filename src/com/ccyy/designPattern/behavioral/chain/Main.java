package com.ccyy.designPattern.behavioral.chain;

import com.ccyy.designPattern.behavioral.chain.middleware.Middleware;
import com.ccyy.designPattern.behavioral.chain.middleware.RoleCheckMiddleware;
import com.ccyy.designPattern.behavioral.chain.middleware.ThrottlingMiddleware;
import com.ccyy.designPattern.behavioral.chain.middleware.UserExistsMiddleware;
import com.ccyy.designPattern.behavioral.chain.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: lianghanmao
 * @create: 2022-03-23
 * @description: 测试
 **/
public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
