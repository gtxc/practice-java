package com.gtxc.practice.mylinkedlist;

/**
 * Created by gt at 4:19 PM on Wednesday, November 04, 2020.
 * Project: practice.
 */

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
