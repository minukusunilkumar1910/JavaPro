public class Recursion {
   public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // System.out.println("Enter Start");
      // int st = sc.nextInt();
      // System.out.println("Enter Last");
      // int end = sc.nextInt();

      // PrintSt_to_End(st, end);
      // SumOfN(10,0);
      // fact(5, 1);
      // SumOfDigits(99, 0);
      // Count(7396345264l, 0);
      // fibonacci(7, 0,1);

      // Power(10, 10, 1);
      String str = "racecar";
      ReverseStr(str, str.length() - 1);

   }

   public static void PrintSt_to_End(int n, int m) {
      if (m == n - 1) {
         return;
      }
      PrintSt_to_End(n, m - 1);
      System.out.print(m + " ");
   }

   public static void SumOfN(int n, int sum) {
      if (n == 0) {
         System.out.println(sum);
         return;
      }

      SumOfN(n - 1, sum + n);

   }

   public static void fact(int n, int val) {
      if (n == 0 || n == 1) {
         System.out.println(val);
         return;
      }

      fact(n - 1, n * val);

   }

   public static void SumOfDigits(int num, int sum) {
      if (num == 0) {
         System.out.println(sum);
         return;
      }
      int last = num % 10;
      SumOfDigits(num / 10, sum + last);
   }

   public static void Count(long n, int c) {
      if (n == 0) {
         System.out.println(c);
         if (c <= 9) {
            System.out.println("Check the number,It is less than 10 digits");
         }
         return;
      }
      c++;

      Count(n / 10, c);

   }

   public static void fibonacci(int num, int a, int b) {
      if (num == 1) {
         System.out.println("Fibo Number " + a);
         return;
      }

      // System.out.print(a+" ");
      fibonacci(num - 1, b, a + b);

   }

   public static void Power(int n, int m, double val) {
      if (m == 0) {
         // System.out.println(val);
         return;
      }
      val = Math.pow(n, m);
      Power(n, m - 1, val);
      System.out.print(n + " ^ " + m + " = " + (int) val + "   ");

   }

   public static void ReverseStr(String str, int i) {
      if (i < 0) {
         return;
      }
      System.out.print(str.charAt(i));
      ReverseStr(str, i - 1);
   } 
   
   
   
}
