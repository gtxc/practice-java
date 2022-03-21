package com.gtxc.practice.hackerrank;

/*
    Created by gt at 3:06 PM on Wednesday, February 16, 2022.
    Project: practice, Package: com.gtxc.practice.hackerrank.
*/

import java.util.*;
import java.util.stream.Collectors;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {

    private int leafSum = 0;

    @Override
    public int getResult() {
        return leafSum;
    }

    @Override
    public void visitNode(TreeNode node) {
        //implement this
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        leafSum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    private long redProduct = 1L;

    public int getResult() {
        //implement this
        return (int) (redProduct);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getColor().equals(Color.RED)) {
            redProduct = (redProduct * node.getValue()) % ((int) 1e9 + 7);
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor().equals(Color.RED)) {
            redProduct = (redProduct * leaf.getValue())  % ((int) 1e9 + 7);
        }
    }
}

class FancyVisitor extends TreeVis {

    private int nodeSum = 0;
    private int greenSum = 0;

    public int getResult() {
        //implement this
        return Math.abs(nodeSum - greenSum);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if (node.getDepth() % 2 == 0) {
            nodeSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if (leaf.getColor().equals(Color.GREEN)) {
            greenSum += leaf.getValue();
        }
    }
}

public class VisitorPattern {

    public static Tree solve() {
//        read the tree from STDIN and return its root as a return value of this function

        Scanner scanner = new Scanner(System.in);
        int nodeCount = scanner.nextInt();
        scanner.nextLine();

        List<Integer> values = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> colors = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        values.add(0, 0);
        colors.add(0, 0);

        Map<Integer, TreeNode> treeNodes = new HashMap<>();
        Map<Integer, TreeLeaf> treeLeaves = new HashMap<>();

        treeNodes.put(1, new TreeNode(
                values.get(1),
                Color.values()[colors.get(1)],
                0
        ));

        List<Integer> parent = new ArrayList<>();
        List<Integer> child = new ArrayList<>();

        parent.add(0);
        child.add(0);

        Set<Integer> nodeCheck = new HashSet<>();

        for (int i = 1; i < nodeCount; ++i) {
            parent.add(scanner.nextInt());
            child.add(scanner.nextInt());
//            if (!nodeCheck.add(child.get(i))) {
//                int tmp = child.get(i);
//                child.set(i, parent.get(i));
//                parent.set(i, tmp);
//            }
        }

        System.out.println("parent.size(): " + parent.size());

        for (int i = 1; i < nodeCount; ++i) {
            if (!treeNodes.containsKey(parent.get(i))) {
                int index = child.indexOf(parent.get(i));
                System.out.println(index);
                System.out.println(parent.get(i));
                System.out.println(child.get(i));
                int tmpChild = child.get(i);
                int tmpParent = parent.get(i);
                child.set(i, child.get(index));
                parent.set(i, parent.get(index));
                child.set(index, tmpChild);
                parent.set(index, tmpParent);
            }
            if (parent.contains(child.get(i))) {
                treeNodes.put(child.get(i), new TreeNode(
                        values.get(child.get(i)),
                        Color.values()[colors.get(child.get(i))],
                        treeNodes.get(parent.get(i)).getDepth() + 1
                ));
                treeNodes.get(parent.get(i)).addChild(treeNodes.get(child.get(i)));
            } else {
                treeLeaves.put(child.get(i), new TreeLeaf(
                        values.get(child.get(i)),
                        Color.values()[colors.get(child.get(i))],
                        treeNodes.get(parent.get(i)).getDepth() + 1
                ));
                treeNodes.get(parent.get(i)).addChild(treeLeaves.get(child.get(i)));
            }
        }

        scanner.close();
        return treeNodes.get(1);
    }

        // NOT MINE
//        private static int [] values;
//        private static Color [] colors;
//        private static HashMap<Integer, HashSet<Integer>> map;
//
//        public static Tree solve() {
//            Scanner scan = new Scanner(System.in);
//            int numNodes = scan.nextInt();
//
//            /* Save nodes and colors */
//            values = new int[numNodes];
//            colors = new Color[numNodes];
//            map = new HashMap(numNodes);
//            for (int i = 0; i < numNodes; i++) {
//                values[i] = scan.nextInt();
//            }
//            for (int i = 0; i < numNodes; i++) {
//                colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
//            }
//
//            /* Save edges */
//            for (int i = 0; i < numNodes - 1; i++) {
//                int u = scan.nextInt();
//                int v = scan.nextInt();
//
//                /* Edges are undirected: Add 1st direction */
//                HashSet<Integer> uNeighbors = map.get(u);
//                if (uNeighbors == null) {
//                    uNeighbors = new HashSet();
//                    map.put(u, uNeighbors);
//                }
//                uNeighbors.add(v);
//
//                /* Edges are undirected: Add 2nd direction */
//                HashSet<Integer> vNeighbors = map.get(v);
//                if (vNeighbors == null) {
//                    vNeighbors = new HashSet();
//                    map.put(v, vNeighbors);
//                }
//                vNeighbors.add(u);
//            }
//            scan.close();
//
//            /* Handle 1-node tree */
//            if (numNodes == 1) {
//                return new TreeLeaf(values[0], colors[0], 0);
//            }
//
//            /* Create Tree */
//            TreeNode root = new TreeNode(values[0], colors[0], 0);
//            addChildren(root, 1);
//            return root;
//        }
//
//        /* Recursively adds children of a TreeNode */
//        private static void addChildren(TreeNode parent, Integer parentNum) {
//            /* Get HashSet of children and loop through them */
//            for (Integer treeNum : map.get(parentNum)) {
//                map.get(treeNum).remove(parentNum); // removes the opposite arrow direction
//
//                /* Add child */
//                HashSet<Integer> grandChildren = map.get(treeNum);
//                boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
//                Tree tree;
//                if (childHasChild) {
//                    tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
//                } else {
//                    tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
//                }
//                parent.addChild(tree);
//
//                /* Recurse if necessary */
//                if (tree instanceof TreeNode) {
//                    addChildren((TreeNode) tree, treeNum);
//                }
//            }
//        }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}

