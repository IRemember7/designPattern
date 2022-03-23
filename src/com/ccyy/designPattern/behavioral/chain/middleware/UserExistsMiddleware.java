package com.ccyy.designPattern.behavioral.chain.middleware;

import com.ccyy.designPattern.behavioral.chain.server.Server;

/**
 * @author: lianghanmao
 * @create: 2022-03-23
 * @description: 检查用户信息
 **/
public class UserExistsMiddleware extends Middleware{
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }

}
