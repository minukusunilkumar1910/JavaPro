class Node
{
   int data;
   Node next;

   Node(int data)
   {
      this.data = data;
   }
}
class SingleLinkedlist
{
   Node head;

   public void insert(int data)
   {
      Node newnode = new Node(data);
      if(head == null)
      {
        head = newnode;
        return;
      }
     Node temp = head;
     while(temp.next != null )
     {
      temp = temp.next;
     }
     temp.next = newnode;
    
   }

   public void insertBeg(int data)
   {
   
      Node newnode = new Node(data);
      
      newnode.next = head;
      head = newnode;

   }

   public void insertRandom(int data,int pos)
   {
      
      if(pos <= 1)
         {
            insertBeg(data);
            return;
         }
         
      Node newnode = new Node(data);
      Node temp = head;
      int count = 1;
      while( temp.next != null  && count < pos-1)
      {
         count++;
         temp = temp.next;
      }

      newnode.next = temp.next;
      temp.next = newnode;
      
   }
  
   public void display()
   {
      Node temp = head;
      while(temp != null)
      {
         System.out.print(temp.data+"-->");
         temp = temp.next;
      }
      System.out.print("null");

   }

}
public class Linkedlist {
   public static void main(String[] args) {
      
      SingleLinkedlist linkedlist = new SingleLinkedlist();
      linkedlist.insertBeg(11);
      linkedlist.insert(12);
      linkedlist.insert(13);
      linkedlist.insertRandom(122, 2); 
      linkedlist.insert(14);
      linkedlist.display();
   }
}
