import java.util.ArrayList;

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
      // String str = "racecar";
      // ReverseStr(str, str.length() - 1);

      // int[] arr = {1, 5, 3, 4, 6};
      // largest(arr);
      // int r = seclargest(arr);
      // boolean r = Sorted(arr);

      // int r = numberOfSteps(14);
      // ArrayList r = Triangle(arr);

      // int tar = 13;
      // int r = bis(arr, tar, 0, arr.length-1);
      // boolean r = sort(arr,1);
      // ArrayList<Integer> r = lis(arr,0, 1,new ArrayList<>());
      // int r = Rbs(arr, 6, 0, arr.length-1);

      // Pattern1(4,0);
      // Pattern2(1,1,4);
      // Pattern3(1,1,4);

      // Pattern4(4, 1,4);

      // int[] arr = {11,1,2,3,4,6};
      // // bubbleSort(arr);
      // bs(arr, 0, arr.length-1);

      // StringBuilder r = skipa("bbbbbbaaaaaa");
      // String r = skipA("baabbaccab",new StringBuilder(),0);
      // String r = skipWord("sunilApplesunncc", "Apple",new StringBuilder(),0);
      // String r = mergeAlternately("abc", "pqr");
      // System.out.println(r);

      trail("the sky is blue");

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

   static int largest(int[] arr) {

      // int lar = Integer.MIN_VALUE;
      int lar = arr[0];

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > lar) {
            lar = arr[i];
         }
      }
      // System.out.println(lar);
      return lar;
   }

   static int seclargest(int[] arr) {
      int lar = arr[0];
      int seclar = arr[0];
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] > lar) {
            seclar = lar;
            lar = arr[i];
         } else if (arr[i] < lar && seclar < arr[i]) {
            seclar = arr[i];
         }

      }
      return seclar;
   }

   static boolean Sorted(int[] arr) {
      int i = 0;
      int n = arr.length - 1;
      int j = n;

      while (i <= j) {
         if (arr[i] <= arr[j]) {
            i++;
            j--;
         } else {
            return false;
         }
      }
      return true;
   }

   public static int numberOfSteps(int n) {
      if (n == 0) {
         return 0;
      }

      if (n % 2 == 0) {
         return 1 + numberOfSteps(n / 2);
      } else {

         return 1 + numberOfSteps(n - 1);
      }
   }

   public static ArrayList<Integer> Triangle(int[] arr) {
      int n = arr.length;
      ArrayList<Integer> list = new ArrayList<>();
      if (n == 1) {
         list.add(arr[0]);
         return list;
      }
      int[] res = new int[n - 1];

      for (int i = 0; i < n - 1; i++) {
         res[i] = arr[i] + arr[i + 1];
      }
      // System.out.println(list);
      return Triangle(res);

   }

   public static int biSearch(int[] arr, int tar) {
      int n = arr.length;
      int low = 0;
      int high = n - 1;
      while (low <= high) {
         int mid = (low + high) / 2;
         if (arr[mid] == tar) {
            return mid + 1;
         }

         if (arr[mid] < tar) {
            low = mid;
         } else {
            high = mid;
         }

      }
      return -1;
   }

   public static int bis(int[] arr, int t, int low, int high) {

      if (low > high) {
         return -1;
      }

      int mid = (low + high) / 2;
      if (arr[mid] == t) {
         System.out.println(arr[mid]);
         return mid + 1;
      }

      if (arr[mid] < t) {
         return bis(arr, t, mid + 1, high);
      } else {
         return bis(arr, t, low, mid - 1);
      }

   }

   public static boolean sorted(int[] arr) {

      for (int i = 1; i < arr.length; i++) {
         if (arr[i - 1] > arr[i]) {
            return false;
         }
      }

      return true;

   }

   public static boolean sort(int[] arr, int i) {
      if (i >= arr.length - 1) {
         return true;
      }

      if (arr[i - 1] <= arr[i]) {
         return sort(arr, i + 1);
      } else {
         return false;
      }
   }

   public static int liSec(int[] arr, int t) {
      int n = arr.length;
      for (int i = 0; i < n; i++) {
         if (arr[i] == t) {
            return i + 1;
         }
      }

      return -1;
   }

   public static int lis(int[] arr, int i, int t) {
      if (i == arr.length) {
         return -1;
      }

      if (arr[i] == t) {
         return i + 1;
      }

      return lis(arr, i + 1, t);
   }

   public static ArrayList<Integer> lis(int[] arr, int i, int t, ArrayList<Integer> list) {
      if (i == arr.length) {
         // list.add(-1);
         return list;
      }

      if (arr[i] == t) {
         list.add(i + 1);
      }

      return lis(arr, i + 1, t, list);
   }

   public static int Rbs(int[] arr, int t, int s, int e) {
      if (s > e) {
         return -1;
      }
      int mid = (s + e) / 2;

      if (arr[mid] == t) {
         return mid + 1;
      }

      if (arr[s] <= arr[mid]) {
         if (t >= arr[s] && t <= arr[mid]) {
            return Rbs(arr, t, s, mid - 1);
         } else {
            return Rbs(arr, t, mid + 1, e);
         }
      }
      if (t >= arr[mid] && t <= arr[e]) {
         return Rbs(arr, t, mid + 1, e);
      } else {
         return Rbs(arr, t, s, mid - 1);
      }
   }

   public static void Pattern1(int r, int c) {
      if (r == 0) {
         return;
      }

      if (r > c) {
         System.out.print("*");
         Pattern1(r, c + 1);
      } else {
         System.out.println();
         Pattern1(r - 1, 0);
      }

   }

   public static void Pattern2(int r, int c, int n) {
      if (r == n + 1) {
         return;
      }

      if (r >= c) {
         System.out.print("*");
         Pattern2(r, c + 1, n);
      } else {
         System.out.println();
         Pattern2(r + 1, 1, n);
      }
   }

   public static void Pattern3(int r, int c, int n) {
      if (r > n) {
         return;
      }

      if (n - r >= c) {
         System.out.print(" ");
         Pattern3(r, c + 1, n);
      } else if (n >= c) {
         System.out.print("*");
         Pattern3(r, c + 1, n);
      } else {
         System.out.println();
         Pattern3(r + 1, 1, n);
      }

   }

   public static void Pattern4(int r, int c, int n) {
      if (n == 0)
         return;

      if (c <= 4 - r) {
         System.out.print(" ");
         Pattern4(r, c + 1, n);
      }

      else if (c <= 4) {
         System.out.print("*");
         Pattern4(r, c + 1, n);
      }

      else {
         System.out.println();
         Pattern4(r - 1, 1, n - 1);
      }
   }

   public static void bubbleSort(int[] arr) {
      int n = arr.length;

      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
               arr[j] = arr[j + 1];
               arr[j + 1] = temp;
            }
         }
      }

      for (int num : arr) {
         System.out.print(num + " ");
      }
   }

   public static void bs(int[] arr, int i, int n) {
      if (n == 0) {
         return;
      }

      if (i < n) {
         if (arr[i] > arr[i + 1]) {
            int t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
         }
         bs(arr, i + 1, n);
      } else {
         bs(arr, 0, n - 1);
      }

   }

   public static StringBuilder skipa(String word) {

      StringBuilder ans = new StringBuilder();

      for (int i = 0; i < word.length(); i++) {
         if (word.charAt(i) != 'a') {
            ans.append(word.charAt(i));
         }
      }

      return ans;
   }

   public static String skipA(String str, StringBuilder ans, int i) {
      if (i == str.length()) {
         String an = ans.toString();
         return an;
      }

      if (str.charAt(i) != 'a') {
         ans.append(str.charAt(i));
      }

      return skipA(str, ans, i + 1);
   }

   public static String skipWord(String str, String word, StringBuilder ans, int i) {
      if (i == str.length() - 1) {
         String an = ans.toString();
         return an;
      }

      int j = 0;
      while (str.charAt(i) == word.charAt(j) && j < word.length()) {
         i++;
         j++;
      }
      j = 0;
      if (str.charAt(i) != word.charAt(j)) {
         ans.append(str.charAt(i));
      }
      return skipWord(str, word, ans, i + 1);
   }

   public static String mergeAlternately(String word1, String word2) {

      // int i = 0;
      // int j = 0;
      // int n = word1.length();
      // int m = word2.length();
      // StringBuilder ans = new StringBuilder();

      // while (i < n && j < m) {
      // ans.append(word1.charAt(i));
      // ans.append(word2.charAt(j));
      // i++;
      // j++;
      // }

      // while (i < n) {
      // ans.append(word1.charAt(i));
      // i++;
      // }

      // while (j < m) {
      // ans.append(word2.charAt(j));
      // j++;
      // }

      // String a = ans.toString();
      // return a;

      StringBuilder ans = new StringBuilder();
      int i = 0;

      while (i < word1.length() || i < word2.length()) {
         if (i < word1.length())
            ans.append(word1.charAt(i));
         if (i < word2.length())
            ans.append(word2.charAt(i));
         i++;
      }

      return ans.toString();
   }

   public static void trail(String s) {
      // s = s.trim();
      // StringBuilder a = new StringBuilder();
      // int n = s.length();
      // int i = n-1,j = n-1;

      // while(j >= 0)
      // {
      // if(s.charAt(j) == ' ' || j == 0)
      // {
      // int start = (j == 0) ? j : j + 1;

      // if (a.length() != 0)
      // {
      // a.append(" ");
      // }

      // a.append(s.substring(start, i + 1));
      // i = j - 1;
      // }
      // j--;

      // }
      // String r = a.toString();
      // System.out.println(r.trim());

      String[] words = s.trim().split("\\s+");
      StringBuilder ans = new StringBuilder();

      int n = words.length;
      for(int i = n-1;i>=0;i--)
      {
         ans.append(words[i]).append(" ");
      }

      String r = ans.toString().trim();
      System.out.println(r);

   }

}
