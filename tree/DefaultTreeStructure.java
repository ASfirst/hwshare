package com.jeramtough.component.tree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2019/7/11 15:44
 * by @author WeiBoWen
 */
public class DefaultTreeStructure implements TreeStructure {


    private Object value;
    //    private Set<TreeStructure> subStructures;
    private TreeStructure parentStructure;
    private int level = 0;
    private TreeStructureAdapter adapter;

    public DefaultTreeStructure(TreeStructureAdapter adapter) {
        this.adapter = adapter;
    }


    @Override
    public boolean isRoot() {
        return parentStructure == null;
    }

    @Override
    public boolean hasSubs() {
        return getSubs().size() > 0;
    }

    @Override
    public List<TreeStructure> getSubs() {
        return adapter.getSubs();
    }


    @Override
    public TreeStructureAdapter getAdapter() {
        return adapter;
    }

    @Override
    public void setAdapter(TreeStructureAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public TreeStructure getParent() {
        return parentStructure;
    }

    @Override
    public void setParent(TreeStructure parentTreeStructure) {
        this.parentStructure = parentTreeStructure;
    }

    @Override
    public void addSub(TreeStructure treeStructure) {
        getSubs().add(treeStructure);
        treeStructure.setParent(this);
        treeStructure.setLevel(this.level + 1);
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
}
