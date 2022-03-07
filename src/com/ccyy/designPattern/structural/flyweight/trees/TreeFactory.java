package com.ccyy.designPattern.structural.flyweight.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: lianghanmao
 * @create: 2022-03-07
 * @description: 树工厂
 **/
public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
