import java.util.*;

public class BinaryTrees {
   static class Node {
      int data;
      Node left;
      Node right;

      Node(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
      }
   }

   public static Node root;

   public static void populate(Scanner sc) {
      System.out.println("Enter the Root Node : ");
      int val = sc.nextInt();
      root = new Node(val);
      populate(sc, root);
   }

   public static void populate(Scanner sc, Node root) {
      System.out.println("Do u want to enter the left of : " + root.data);
      boolean left = sc.nextBoolean();
      if (left) {
         System.out.println("Enter the value of the left of : " + root.data);
         int val = sc.nextInt();
         root.left = new Node(val);
         populate(sc, root.left);
      }

      System.out.println("Do u want to enter the right of : " + root.data);
      boolean right = sc.nextBoolean();
      if (right) {
         System.out.println("Enter the value of the right of : " + root.data);
         int val = sc.nextInt();
         root.right = new Node(val);
         populate(sc, root.right);
      }
   }

   public static void preorder(Node root) {
      if (root != null) {
         System.out.print(root.data + " ");
         preorder(root.left);
         preorder(root.right);
      }
   }

   public static class BinaryTree {

      static int idx = -1;

      public static Node BuildTree(int[] nodes) {
         idx++;
         if (nodes[idx] == -1) {
            return null;
         }
         Node newNode = new Node(nodes[idx]);
         newNode.left = BuildTree(nodes);
         newNode.right = BuildTree(nodes);

         return newNode;
      }
   }

   public static void main(String[] args) {
      // int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

      BinaryTree tree = new BinaryTree();
      // Node root = tree.BuildTree(nodes);
      // System.out.println(root.data);

      Scanner sc = new Scanner(System.in);
      populate(sc);
      preorder(root);

   }

}