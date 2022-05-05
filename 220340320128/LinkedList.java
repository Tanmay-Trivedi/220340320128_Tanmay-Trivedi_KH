import java.util.Scanner;
class LinkedList{
	
	Node head ;
	static class Node{
		int data ;
		Node next;
		Node(int d){
		data=d;
		next=null;
		}
	}
	
	void insert(int d){
		Node new_node = new Node(d);
		if(head == null){
		head=new_node;
		return;
		}
	   Node temp = head; 
	   while(temp.next != null )
		   temp=temp.next;
		temp.next=new_node;
		return;
    }
	void print(Node head){
	Node n = head;
		 while(n!=null){
		 System.out.println(" "+n.data);
		 n=n.next;
		 }
	
	}
	
	static Node linkedListReverse(Node head){
			Node prev = null, next=null;
			
			Node  n = head ;
			while(n!=null){
			next=n.next;
			n.next=prev;
			prev = n ;
			n=next;
			}
			head = prev;
			return head;
	}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		LinkedList obj = new LinkedList();
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=0; i<y; i++){
			obj.insert(sc.nextInt());
		}
		
		obj.head = obj.linkedListReverse(obj.head);
		obj.print(obj.head);
}
}