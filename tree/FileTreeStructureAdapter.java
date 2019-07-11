package com.jeramtough.component.tree;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created on 2019/7/11 16:54
 * by @author WeiBoWen
 */
public class FileTreeStructureAdapter implements TreeStructureAdapter {

    private File file;
    private Set<TreeStructure> subStructures;


    public FileTreeStructureAdapter(File file) {
        this.file = file;
        subStructures = new HashSet<>();
    }

    @Override
    public TreeStructure[] getSubs() {
        TreeStructure[] subTreeStructures = null;
        if (file.listFiles() != null && file.isDirectory()) {
            File[] subFiles = Objects.requireNonNull(file.listFiles());
            subTreeStructures = new TreeStructure[subFiles.length];
            for (int i = 0; i < subFiles.length; i++) {
                File file = subFiles[i];
                subTreeStructures[i] =
                        new DefaultTreeStructure(new FileTreeStructureAdapter(file));
            }
        }
        return subTreeStructures;
    }

    @Override
    public boolean hasSubs() {
        return getSubs() != null;
    }

    @Override
    public void addSub(TreeStructure treeStructure) {

    }
}
