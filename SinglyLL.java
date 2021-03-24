import java.util.Scanner;

/**
 * Node
 */
class Node {
    Node nextNode;
    Object data;
    Node(Object data){
        this.data = data;
        this.nextNode = null;
    }
    
}

/**
 * LinkedList
 */
class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;
    }

    void addNode(Object data){
        if(this.head==null){
            this.head = new Node(data);
        }
        else{
            Node currentNode = head;
            while(currentNode.nextNode!=null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node(data);
            
        }
    }

    void display(){
        if(head==null) {
            System.out.println("The current list is empty");
        }
        else{
            Node currentNode = head;
            while(currentNode.nextNode!=null){
                System.out.println(currentNode.data);
                currentNode = currentNode.nextNode;
            } 
            System.out.println(currentNode.data);
        }
    }

    
}

/**
 * SinglyLL
 */
public class SinglyLL {

    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            myList.addNode(sc.nextInt());
        }
        System.out.println("Print the list");
        myList.display();

        sc.close();

    }
}