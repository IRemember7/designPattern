package com.ccyy.designPattern.behavioral.template.networks;

/**
 * @author: lianghanmao
 * @create: 2022-03-28
 * @description: 基础社交网络类
 **/
public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * 模板方法
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    /**
     * 登录接口
     * @param userName
     * @param password
     * @return
     */
    abstract boolean logIn(String userName, String password);

    /**
     * 发送信息接口
     * @param data
     * @return
     */
    abstract boolean sendData(byte[] data);

    /**
     * 退出接口
     */
    abstract void logOut();
}
