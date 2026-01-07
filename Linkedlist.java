

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
   int size=0;
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
    size++;
   }

   public void insertBeg(int data)
   {
   
      Node newnode = new Node(data);
      
      newnode.next = head;
      head = newnode;
    size++;

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
    size++;
      
   }
   
   public void deletebeg()
   {
      head = head.next;
      size--;

   }

   public void deletelast()
   {
      if(head.next == null)
      {
         deletebeg();
         return;
      }

      Node temp1 = head;
      Node temp2 = temp1;

      while(temp1.next != null)
      {
         temp2 = temp1;
         temp1 = temp1.next;
      }
      temp2.next = null;
      size--;

   }
   
   public void deleteRandom(int pos)
   {
      if(pos <= 1)
      {
         deletebeg();
         return;
      }
      if(pos >= size)
      {
         deletelast();
         return;
      }
      int count = 1;
      Node temp = head;

      while(temp != null && count < pos-1)
      {
         count++;
         temp = temp.next;
      }
      temp.next = temp.next.next;
      size--;

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
      // linkedlist.insertBeg(11);
      linkedlist.insert(11);
      linkedlist.insert(12);
      linkedlist.insert(13);
      linkedlist.insert(14);
      linkedlist.insert(15);
      linkedlist.insertRandom(122, 2); 
      linkedlist.insert(16);
      linkedlist.deletebeg();
      linkedlist.deleteRandom(400);
      linkedlist.deletelast();
      linkedlist.display();
   }
}
