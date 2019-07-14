package com.jeramtough.component.tree;

import java.util.List;

/**
 * Created on 2019/7/11 15:25
 * by @author WeiBoWen
 */
public interface TreeStructure {

    boolean isRoot();

    List<TreeStructure> getSubs();

    TreeStructureAdapter getAdapter();

    void setAdapter(TreeStructureAdapter adapter);

    TreeStructure getParent();

    void setParent(TreeStructure parentTreeStructure);

    void addSub(TreeStructure treeStructure);

    Object getValue();

    void setValue(Object value);

    int getLevel();

    void setLevel(int level);

}
