package com.ccyy.designPattern.behavioral.chain.middleware;

/**
 * @author: lianghanmao
 * @create: 2022-03-23
 * @description: 检查失败的登录请求是否过多
 **/
public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    /**
     * 请不要在开头插入checkNext（）调用这种方法的最后。
     * 这比所有中间件上的简单循环提供了更大的灵活性物体。例如，链的一个元素可以更改通过在
     * 所有其他检查之后运行其检查来进行检查
     * @param email
     * @param password
     * @return
     */
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        return checkNext(email, password);
    }
}
