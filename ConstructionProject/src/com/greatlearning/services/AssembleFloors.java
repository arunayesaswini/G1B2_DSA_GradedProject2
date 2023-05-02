package com.greatlearning.services;

import java.util.ArrayList;

import java.util.Stack;

import com.greatlearning.model.BinarySearchTree;

public class AssembleFloors {
	BinarySearchTree bst = new BinarySearchTree();
	ArrayList<Integer> sortFloors = new ArrayList<Integer>();
	ArrayList<Integer> floors = new ArrayList<Integer>();
	Stack<Integer> stack = new Stack<Integer>();

	public void insert(int floor) {
		floors.add(floor);
		bst.insert(floor);

	}

	public void assembleFloors() {
		sortFloors = bst.getList();

		// pushing sorted elements into stack
		for (int floor : sortFloors) {
			stack.push(floor);
		}

		System.out.println("The Order of Construction is as follows ");

		int day = 0;
		for (int i = 0; i < floors.size(); i++) {
			day++;
			System.out.print("Day " + day + ":");

			if (floors.get(i) == stack.peek()) {

				for (int j = i; j >= 0; j--) {
					if (stack.isEmpty())
						break;
					else if (floors.get(j) == stack.peek())
						System.out.print(" " + stack.pop());
					if (j == 0 && i == (floors.size() - 1)) {
						while (!stack.isEmpty())
							System.out.print(" " + stack.pop());
					}
				}
			}
			System.out.println();
		}
	}
}
