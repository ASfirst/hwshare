package com.jeramtough.component.tree;

import java.util.*;

/**
 * Created on 2019/6/18 10:28
 * by @author WeiBoWen
 */
public class TreeStructures {

    public static List<TreeStructure> getSubsAndSort(TreeStructure rootTreeStructure,
                                                     SortType sortType) {
        if (!rootTreeStructure.isRoot()) {
            throw new IllegalArgumentException("The TreeStructure must be root");
        }

        List<TreeStructure> sortedTreeStructures = new ArrayList<>();
        LinkedList<TreeStructure> tempTreeStructures = new LinkedList<>();

        if (rootTreeStructure.hasSubs()) {
            List<TreeStructure> TreeStructures = rootTreeStructure.getSubs();
            for (TreeStructure TreeStructure : TreeStructures) {
                if (TreeStructure.hasSubs()) {
                    tempTreeStructures.add(TreeStructure);
//                    System.out.println("添加有子结构:" + TreeStructure.getValue());
                }
                else {
//                    System.out.println("添加没有子结构:" + TreeStructure.getValue());
                }
                sortedTreeStructures.add(TreeStructure);
            }

            TreeStructure tempTreeStructure;
            while (!tempTreeStructures.isEmpty()) {
                tempTreeStructure = tempTreeStructures.removeFirst();
                TreeStructures = tempTreeStructure.getSubs();
                for (TreeStructure TreeStructure2 : TreeStructures) {
                    if (TreeStructure2.hasSubs()) {
                        tempTreeStructures.add(TreeStructure2);
//                        System.out.println("添加有子结构:" + TreeStructure2.getValue());
                    }
                    else {
//                        System.out.println("添加没有子结构:" + TreeStructure2.getValue());
                    }
                    sortedTreeStructures.add(TreeStructure2);
                }
            }

            if (sortType == SortType.ASCENDING) {
                Collections.reverse(sortedTreeStructures);
            }
        }

        return sortedTreeStructures;
    }

    public static List<List<TreeStructure>> getAll(TreeStructure rootTreeStructure,
                                                   SortType sortType) {
        List<TreeStructure> sortTreeStructures = getSubsAndSort(rootTreeStructure, sortType);
        Map<Integer, List<TreeStructure>> integerListMap = new HashMap<>();

        for (TreeStructure TreeStructure : sortTreeStructures) {
            List<TreeStructure> TreeStructures1 = integerListMap.get(TreeStructure.getLevel());
            if (TreeStructures1 == null) {
                TreeStructures1 = new ArrayList<>();
            }
            TreeStructures1.add(TreeStructure);
            integerListMap.put(TreeStructure.getLevel(), TreeStructures1);
        }

        integerListMap.put(0,
                Collections.singletonList(rootTreeStructure));

        List<List<TreeStructure>> allTreeStructures = new ArrayList<>();
        for (int i = 0; i < integerListMap.size(); i++) {
            allTreeStructures.add(integerListMap.get(i));
        }

        if (sortType == SortType.ASCENDING) {
            Collections.reverse(allTreeStructures);
        }
        return allTreeStructures;
    }

}
