package com.shakir;

import java.util.Scanner;

public class Tree {

    static class node {
        int data;
        node left;
        node right;

        public node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    public static node buildTree(node root) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = scn.nextInt();

        root = new node(data);

        if(data == -1) return null;

        System.out.println("Enter left data: "+data);
        root.left = buildTree(root.left);

        System.out.println("Enter right data: "+ data);
        root.right = buildTree(root.right);

        return  root;
    }

    public static void main(String[] args) {
        node root = null;
        root = buildTree(root);
        return;
    }


}
