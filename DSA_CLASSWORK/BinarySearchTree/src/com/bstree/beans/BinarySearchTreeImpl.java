package com.bstree.beans;

public class BinarySearchTreeImpl {
	Node root=null;
	public BinarySearchTreeImpl() {
		root = null;
	}
	
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node() {
			
		}
		public Node(int val) {
			data = val;
			left= null;
			right= null;
		}
	}
	
	public void  inserKey(int val) {
		root = insertVal(root, val);
	}

	public Node insertVal(Node root , int val) {
		Node newNode = new Node(val);
		if(root == null) {// if no root node is present then add there 
			root = newNode;
		}else {
			if(val < root.data ) {
				root.left = insertVal(root.left, val);
			}else {
				root.right = insertVal(root.right, val);
			}
		}
		return root;
	}
	
	public void inOrder() {
		inOrderTraversal(root);
	}
	
	public void inOrderTraversal(Node root) {
		if(root != null) {
			inOrderTraversal(root.left);
			System.out.println(root.data+"\t");
			inOrderTraversal(root.right);
		}
	}
	
	public void preOder() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root!= null) {
			System.out.print(root.data+"\n");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public void postOder() {
		preOrderTraversal(root);
	}

	private void postOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root!= null) {
			System.out.print(root.data+"\n");
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
		}
	}

	public boolean searchValue(int val) {
		boolean status = searchTraversel(root,val);
		return status;
	}

	private boolean searchTraversel(Node root,int val) {
		if(root == null) {
			System.out.println("not found");
			return false;
			
		}else {
			if(val == root.data) {
				return true;
			}else {
				searchTraversel(root.left,val);
				searchTraversel(root.right,val);
			}
		}
		return false;
	}
	
}
