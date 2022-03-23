package com.ccyy.designPattern.behavioral.chain.middleware;

/**
 * @author: lianghanmao
 * @create: 2022-03-23
 * @description: 基础验证接口
 **/
public abstract class Middleware {
    /**
     * 下一个验证接口
     */
    private Middleware next;

    /**
     * 构建中间件对象链
     * @param next
     * @return
     */
    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }

    /**
     * 定义抽象方法，子类实现
     * @param email
     * @param password
     * @return
     */
    public abstract boolean check(String email,String password);

    /**
     * 在链中的下一个对象上运行检查，或在链中的最后一个对象中结束遍历。
     * @param email
     * @param password
     * @return
     */
    protected boolean checkNext(String email,String password){
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }

}
