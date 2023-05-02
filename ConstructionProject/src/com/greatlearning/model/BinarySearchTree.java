package com.greatlearning.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
	ArrayList<Integer> floors = new ArrayList<Integer>();
	Queue<Node> q = new LinkedList<Node>();
	Node root = null;
	Scanner sc = new Scanner(System.in);

	public void insert(int value) {
		Node newNode = new Node(value);
		if (root == null)
			root = newNode;
		else
			insertNode(root, newNode);
	}

	private void insertNode(Node root, Node newNode) {
		if (newNode.data < root.data) {
			if (root.left == null)
				root.left = newNode;
			else
				insertNode(root.left, newNode);

		} else if (newNode.data > root.data) {

			if (root.right == null) {
				root.right = newNode;
			}

			else
				insertNode(root.right, newNode);

		} else {
			System.out.println("Floor size already exist\n Enter another floor :");
			int floor = sc.nextInt();
			insert(floor);
		}

	}

	// in order traversal

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			floors.add(root.data);
			inOrder(root.right);

		}
	}

	public ArrayList<Integer> getList() {
		inOrder(root);
		return floors;
	}

}
