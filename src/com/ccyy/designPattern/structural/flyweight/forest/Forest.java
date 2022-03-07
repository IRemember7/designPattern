package com.ccyy.designPattern.structural.flyweight.forest;

import com.ccyy.designPattern.structural.flyweight.trees.Tree;
import com.ccyy.designPattern.structural.flyweight.trees.TreeFactory;
import com.ccyy.designPattern.structural.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lianghanmao
 * @create: 2022-03-07
 * @description: 森林
 **/
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
}
