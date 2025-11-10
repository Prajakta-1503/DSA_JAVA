package com.demo.test;
import com.demo.service.*;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insertNode(53);
		bst.insertNode(2);
		bst.insertNode(3);
		bst.insertNode(5);
		bst.insertNode(87);
		bst.insertNode(75);
		bst.insertNode(54);
		System.out.println("Inorder");
		bst.inorder();
		System.out.println("--------------------------");
		System.out.println("preorder");
		bst.preorder();
		System.out.println("--------------------------");
		System.out.println("postorder");
		bst.postorder();
		System.out.println("--------------------------");
		
		bst.search(2);
		bst.searchNonRecussive(31);
		bst.search(75);
		
		bst.deleteNode(53);
		bst.inorder();
		bst.deleteNode(54);
		bst.inorder();
		bst.deleteNode(87);
		bst.inorder();

	}

}
