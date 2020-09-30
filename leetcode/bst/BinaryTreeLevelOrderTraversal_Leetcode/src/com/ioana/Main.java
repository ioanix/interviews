package com.ioana;




public class Main {

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50);
        theTree.addNode(75);
        theTree.addNode(15);
        theTree.addNode(43);
        theTree.addNode(8);
        theTree.addNode(65);
        theTree.addNode(55);
        theTree.addNode(88);


        theTree.printInOrder(theTree.root);
        System.out.println("**********");
        theTree.printPreOrder(theTree.root);
        System.out.println("**********");
        theTree.printPostOrder(theTree.root);
        System.out.println("**********");
        System.out.println(theTree.levelOrder(theTree.root));
    }



}
