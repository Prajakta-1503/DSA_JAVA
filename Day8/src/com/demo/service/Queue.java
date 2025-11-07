package com.demo.service; // Declares the package where this class belongs.

public class Queue { // Defines a public class named MyQueueList. This class implements the Queue data structure.
    
    Node front; // Declares a reference to a Node named 'front'. This pointer marks the element at the beginning of the queue (where elements are removed - Dequeue).
    Node rear; // Declares a reference to a Node named 'rear'. This pointer marks the element at the end of the queue (where elements are added - Enqueue).
    
    // Defines a nested class representing a single element (node) in the linked list.
    class Node { 
        int data; // The data field to hold the integer value of the node.
        Node next; // The 'next' reference (pointer) that links this node to the next node in the sequence.
        
        // Constructor for the Node class.
        public Node(int data) { 
            this.data = data; // Initializes the node's data field with the provided value.
            this.next = null; // Initializes the 'next' pointer to null, as it's the last node when initially created.
        }
        
    }
    
    // Default constructor for the MyQueueList class.
    public Queue() { 
        front = null; // Initializes 'front' to null, signifying an empty queue.
        rear = null; // Initializes 'rear' to null, also signifying an empty queue.
    }
    
    /**
     * Checks if the queue is empty.
     * @return true if both front and rear are null, false otherwise.
     */
    public boolean isEmpty() { // Defines the public 'isEmpty' method.
        // The queue is empty only if both the front and rear pointers are null.
        return front == null && rear == null; 
    }
    
    /**
     * Adds an element to the rear of the queue (Enqueue operation).
     * @param val The integer element to be added.
     */
    public void enQueue(int val) { // Defines the public 'enQueue' method to add an element.
        Node newNode = new Node(val); // Creates a new Node object with the given 'val'.
        
        if (isEmpty()) { // Checks if the queue is currently empty.
            front = newNode; // If empty, the new node is both the front and the rear of the queue.
        } else { // If the queue is NOT empty.
            rear.next = newNode; // Links the current rear node's 'next' pointer to the new node.
        }
        
        // In either case (empty or not), the new node becomes the new rear.
        rear = newNode; 
        System.out.println("added num : " + val); // Prints a confirmation message.
        
    }
    
    /**
     * Removes and returns the element from the front of the queue (Dequeue operation).
     * @return The element at the front, or -1 if the queue is empty.
     */
    public int deQueue() { // Defines the public 'deQueue' method to remove the front element.
        if (!isEmpty()) { // Checks if the queue is NOT empty before attempting to dequeue.
            Node temp = front; // Stores the current front node in a temporary variable 'temp' (to hold the data and for cleanup).
            front = front.next; // Moves the 'front' pointer to the next node in the list.
            
            if (front == null) { // Checks if the queue became empty after removing the element (i.e., it was the last element).
                rear = null; // If so, the 'rear' pointer must also be set to null.
            }
            
            temp.next = null; // Detaches the removed node from the list (optional step for garbage collection).
            return temp.data; // Returns the data from the removed (old front) node.
        } else { // If the 'isEmpty()' check returns true.
            System.out.println("Queue is empty"); // Prints an error message indicating an underflow condition.
            return -1; // Returns a default value (-1) to indicate failure due to an empty queue.
        }
    }
    
} // Closes the MyQueueList class definition.