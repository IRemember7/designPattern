package com.ccyy.designPattern.behavioral.chain.middleware;

/**
 * @author: lianghanmao
 * @create: 2022-03-23
 * @description: 检查角色
 **/
public class RoleCheckMiddleware extends Middleware{
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
