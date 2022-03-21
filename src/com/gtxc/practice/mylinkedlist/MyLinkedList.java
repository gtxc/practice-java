package com.gtxc.practice.mylinkedlist;

/**
 * Created by gt at 4:21 PM on Wednesday, November 04, 2020.
 * Project: practice.
 */

public class MyLinkedList implements NodeList {

    private ListItem root;

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        /*
         * Since setNext() and setPrevious() methods return the ListItem, the methods in the if and else
         * statements can be simplified.
         */
        while (true) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // New item is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // There is no next, so insert at the end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
//                    Simplified version of above
//                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // New item is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
//                    Simplified versions of above
//                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
//                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // The node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
//                    Simplified version of above
//                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // comparison > 0
                // We are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }

        // We have reached the end of the list
        // without finding item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        }
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
//        if (root != null) {
//            System.out.println(root.getValue());
//            traverse(root.next());
//        }
    }
}
