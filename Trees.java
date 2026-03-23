class Trees {
   public static class Node {
      int val;
      Node left;
      Node right;

      public Node(int val) {
         this.val = val;
      }

   }

   // static int size = 0;
   public static void display(Node root) {

      if (root == null) {
         return;
      }
      System.out.print(root.val + "->");
      if (root.left != null)
         System.out.print(root.left.val + ",");
      if (root.right != null)
         System.out.print(root.right.val);
      System.out.println();
      display(root.left);
      display(root.right);

   }

   public static void inorder(Node node) {
      if (node != null) {
         inorder(node.left);
         System.out.print(node.val + " ");
         inorder(node.right);
      }
   }

   public static int size(Node node) {

      if (node == null) {
         return 0;
      }

      return 1 + size(node.left) + size(node.right);

   }

   public static int sum(Node node) {
      if (node == null) {
         return 0;
      }

      return node.val + sum(node.left) + sum(node.right);
   }

   public static int maxVal(Node node) {
      if (node == null) {
         return 0;
      }
      int a = node.val;
      int b = maxVal(node.left);
      int c = maxVal(node.right);
      return Math.max(a, Math.max(b, c));

   }
   public static int height(Node root)
   {
      if(root == null)
      {
         return 0;
      }

      int lh = height(root.left);
      int rh = height(root.right);

      return Math.max(lh,rh)+1;
   }

   public static void main(String[] args) {
      Node root = new Node(1);

      root.left = new Node(2);
      root.right = new Node(3);

      root.left.left = new Node(4);
      root.left.right = new Node(5);
      
      root.right.right = new Node(6);
      // display(root);
      // System.out.println("Inorder Traversal");

      int r = size(root);
      int s = sum(root);
      int m = maxVal(root);
      int h = height(root);
      System.out.println("Height (Node) = " + h);
   }

}