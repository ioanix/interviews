package com.ioana;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    TreeNode root;

    public BinaryTree(TreeNode root) {

        this.root = root;
    }

    public BinaryTree() {
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {

            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for(int i = 0; i < size; i++) {

                TreeNode current = queue.remove();
                currentLevel.add(current.value);

                if(current.left != null) {

                    queue.add(current.left);
                }

                if(current.right != null) {

                    queue.add(current.right);
                }
            }

            result.add(currentLevel);
        }



        return result;
    }

    public void addNode(int value) {

        TreeNode newNode = new TreeNode(value);

        if(root == null) {

            root = newNode;

        } else {

            TreeNode current = root;

            TreeNode parent;

            while(true) {

                parent = current;

                if (newNode.value < current.value) {

                    current = current.left;

                    if(current == null) {

                        parent.left = newNode;
                        return;
                    }

                } else {

                    current = current.right;

                    if(current == null) {

                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void printInOrder(TreeNode current) {

        if(current != null) {

            printInOrder(current.left);

            System.out.println(current);

            printInOrder(current.right);

        }
    }

    public void printPreOrder(TreeNode current) {

        if(current != null) {

            System.out.println(current);

            printPreOrder(current.left);

            printPreOrder(current.right);

        }
    }

    public void printPostOrder(TreeNode current) {

        if(current != null) {


            printPreOrder(current.left);

            printPreOrder(current.right);

            System.out.println(current);

        }
    }

    public TreeNode findNode(int value) {

        TreeNode current = root;

        while(current.value != value) {

            if(value < current.value) {

                current = current.left;

            } else {

                current = current.right;

            }

            if(current == null) {

                return null;
            }
        }

        return current;
    }
}
