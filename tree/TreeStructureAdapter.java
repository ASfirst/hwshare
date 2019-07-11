package com.jeramtough.component.tree;

import java.util.List;

/**
 * Created on 2019/7/11 15:23
 * by @author WeiBoWen
 */
public interface TreeStructureAdapter {

    TreeStructure[] getSubs();

    boolean hasSubs();

    void addSub(TreeStructure treeStructure);
}
