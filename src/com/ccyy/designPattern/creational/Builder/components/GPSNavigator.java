package com.ccyy.designPattern.creational.Builder.components;

/**
 * @author: lianghanmao
 * @create: 2021-10-25
 * @description: 产品特征 GPS导航仪
 **/
public class GPSNavigator {
    /**
     * 路线
     */
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
