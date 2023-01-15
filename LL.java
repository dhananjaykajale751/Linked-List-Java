
public class LL {
	static Node head;
       static class Node{
    	   public int data;
    	   Node next;
    	   Node(int d){
    		   data=d;
    		   next=null;
    	   }
       }
       //Inserting new node at head position
       public static void insertAtHead(int data) {
		
    	   Node newnode = new Node(data);
    	   if(head == null) {
    		   head=newnode;
    		   return;
    	   }
    	   newnode.next=head;
    	   head=newnode;
       }
       //Inserting new node at tail position
       public static void insertAtTail(int data) {
           Node newNode = new Node(data);
     
           if(head == null) {
               head = newNode;
               return;
           }
     
           Node lastNode = head;
           while(lastNode.next != null) {
               lastNode = lastNode.next;
           }
     
           lastNode.next = newNode;
       }

       //Printing Linked List
       public static void printlist() {
    	   Node currNode = head;
    	   
           while(currNode != null) {
               System.out.print(currNode.data+"->");
               currNode = currNode.next;
           }

    	   System.out.println("NULL");
       }
       //Deleting node at head
       public static void deleteFromHead() {
    	   if(head==null) {
    		   return;
    	   }
    	   head=head.next;
       }
       //Deleting Node at tail 
       public static void deleteFromTail() {
    	   if(head==null) {
    		   return;
    	   }
    	   if(head.next==null) {
    		   head=null;
    	   }
    	   Node secondLast=head.next;
    	   Node lastnode = secondLast.next;
    	  while(lastnode.next!=null) {
    		  lastnode=lastnode.next;
    		  secondLast=secondLast.next;
    	  }
    	  secondLast.next=null;
       }
       //Deleting entire Linked List
       public static void empty(){
    	   if(head==null) {
    		   return;
    	   }
    	   if(head.next==null) {
    		   head=null;
    	   }
    	   while(head.next!=null) {
    		   
    		   head = head.next;
    		   
    	   }
    	   head = null;
    	   
    	  
       }
	public static void main(String[] args) {
		LL l1 = new LL();
		LL.insertAtHead(0);
		LL.insertAtHead(1);
		l1.insertAtHead(2);
		l1.insertAtTail(3);
		l1.insertAtTail(4);
		

		
		//l1.empty();
		l1.printlist();
		 
	}
}
