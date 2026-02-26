
import java.util.*;

//       System.out.println("Hello");
//    }
// }

/* 

public class Main{
   public static void main(String[] args) 
   {
      int a,b;
      a=5;b=5;
       System.out.println("hello"+(a+b) +"world");
   }
}


import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {  

int a,b;
      System.out.println("enter the values of a");

    Scanner sc = new Scanner(System.in);
    a= sc.nextInt();
    b= sc.nextInt();

    System.out.print("the value of a is:"+(a+b));
   }
}


import java.util.Scanner;

public class Main{
   public static void main(String[] args){
 int a,b;
System.out.println("enter a");
System.out.println("enter b");
 Scanner ip = new Scanner(System.in);

 a = ip.nextInt();
 b= ip.nextInt();
 int sum =a+b;

System.out.println("The sum of two number is "+sum);
   }
}

public class Main{
   public static void main(String[] args){

Scanner ip = new Scanner(System.in);
System.out.print("enter your name");
String name =ip.nextLine();

System.out.print("Age");
int age=ip.nextInt();
System.out.println("height");
double height =ip.nextDouble();

System.out.println("hello "+name+" welcome");
System.out.println("Your age is "+age);
System.out.println("Your height is "+height);
   } 
}
//AREA OF CIRCLE

import java.util.Scanner;

public class Main{
   public static void main(String[] args){
      double pi=3.14;
      int r;   `
      System.out.println("enter r value");
      Scanner ac = new Scanner(System.in);
      r=ac.nextInt();
      double aoc=pi*r*r;
      System.out.println("the area of circle is "+aoc);
   }
}

//UNARY OPERATOR

public class Main{
   public static void main(String[] args){
      int a,b;
      a=10;
   
      System.out.println(a);
      System.out.println(++a);
     System.out.println(a++);
    b=a++;
    System.out.println(b);
   }
}


import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
    int a,b;
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter a");
    a=ip.nextInt();
    System.out.println("Enter b");
    b=ip.nextInt();
    if(a>b){
      System.out.println("a is big");
    }else{
      System.out.println("b is big");
    }
      
   }
}

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
    int score;
    Scanner sc = new Scanner(System.in);
    score = sc.nextInt();
    if(score>90)
     {
          System.out.println("A grade");
      }
    else if(score >= 75)
      {
          System.out.println("B grade");
      }
    else
    {
      System.out.println("fail");
    }  
  } 
}




public class Main{
   public static void main(String[] args) {
      int a,b,c,d;
       Scanner ip =new Scanner(System.in);
       System.out.println("enter a");
       a= ip.nextInt();
       System.out.println("enter b");
       b= ip.nextInt();
       System.out.println("enter c");
       c= ip.nextInt();
       System.out.println("enter d");
       d= ip.nextInt();
       
      if(a>b)
      {
           if(a>c)
           {
                if(a>d)
                {
                 System.out.println("a is big");
                }
                else
                {
                 System.out.println("d is big");
                } 
           }
           else
           {
             System.out.println(" c is big");
           }
      }  
      else{
          if(b>c)
          {
                 if(b>d){
                  System.out.println("b is big");
                 }
                 else{
                  System.out.println("d is big");
                 }  
          }
          else if(c>d)
          {
            System.out.println("c is big");
          }
          else{
            System.out.println("d is big");
          }
      }
      

   }
}

public class Main
{
   public static void main(String[] args)
   {
      int num = 1;
      
      while(num <= 10 )
      {
      System.out.println(num);
      num++;
   }
}
}


public class Main{
   public static void main(String[] args){
      System.out.println("before Swapping");
      int a=5;
      int b=3;
      int c;
   System.out.println(a+"  "+b);
   System.out.println("After Swapping");
      c=a;
      a=b;
      b=c;
   System.out.println(a+"  "+b);
   }
}


public class Main
{
   public static void main(String[] args) 
   {
       Scanner ip =new Scanner(System.in);
       System.out.println("enter a");
       int a=ip.nextInt();
       System.out.println("enter b");
       int b= ip.nextInt();
       System.out.println("enter c");
       int c=ip.nextInt();
       System.out.println("enter d");
       int d=ip.nextInt();
       System.out.println("enter e");
       int e=ip.nextInt();
       if(a>b)
       {
         if(a>c)
         {
            if(a>d)
            {
               if(a>e)
               {
                  System.out.println("A is big");
               }
               else
               {
                  System.out.println("E is big");
               }
            }
            else
            {
               System.out.println("D is big");
            }
         }
         else
         {
            System.out.println("C is big");
         }
       }
       else
      {
         if(b>c)
         {
            if(b>d)
            {
               if(b>e)
               {
                  System.out.println("B is big");
               }
               else
               {
                  System.out.println("e is big");
               }
            }
            else
            {
               System.out.println("d is big");
            }
         }
         else
         {
            if(c>d)
            {
               if(c>e)
               {  
                  System.out.println("c is big");
               }
               else
               {
                  System.out.println("E is big");
               }
            }
          
            else
            {
               if(d>e)
               {
                  System.out.println("D is big");
               }
               else
               {
                  System.out.println("E is big");
               }
            }       
         }
      }  
   }
}

public class Main
{
   public static void main(String[] args)
 {
       int fact=1;
       int i;
       int n=0;
       System.out.println("enter the number");
       Scanner ip = new Scanner(System.in);
       n = ip.nextInt();
   for(i=1;i<=n;i++)
   {
     fact = fact*i;
   System.out.println(fact);
 }

}


import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
   int i,j,n,count=0;
   System.out.println("enter the number");
   Scanner ip=new Scanner(System.in);
   n=ip.nextInt();
  for(i=2;i<=n;i++)
  {
   for(j=1;j<=i;j++)
   {
      if(i%j==0)
      count++;
   }
   if(count==2)
 System.out.println(i);
  }
}



public class Main{
   public static void main(String[] args) {
       {
         int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        int reverse=0;

        while (n!=0)
        {
         int last = n%10;
         reverse = reverse*10 +last;
         n /= 10;
        }
        System.out.println(reverse);
       }
   }
}

 */
// Reverse  a string in java
// public class Main {
//     public static void main(String[] args) {
//   String name = "123";
//   StringBuilder reverse = new StringBuilder();
//   for (int i = name.length() - 1; i >= 0; i--) {
//       reverse.append(name.charAt(i));
//   }
//   System.out.println(reverse);
//   System.out.println(name);
// int a =10;
// int b=5;
// b=b+a;
// a=b-a;
// b=b-a;
// System.out.println(a);   
// System.out.println(b);   
// Fibonacci
//  int n=4;
//  if(n==0)
//    {
//       System.out.println("0");
//       return;
//    }
//  int first = 0,sec = 1;
// //  System.out.print(first+" "+sec+" ");
//    int third = first + sec;
// for(int i=2;i<n;i++)
//    {
//    third = first + sec;
//    // System.out.print(third+" ");
//    first = sec;
//    sec = third;
//    }
//    System.out.print(third+" ");
//   Palindrome (String)
// String name = "sus";
// String reverse = new  StringBuilder(name).reverse().toString();
// System.out.println(reverse);
// System.out.println(name.equals(reverse));
// Leap Year ---
//   int n = 2024;
//   if ((n % 4 == 0) && (n % 100 != 0) || (n % 400 == 0)) {
//       System.out.println("leap");
//   } else
//   {
//       System.out.println("normal");
//   }
//     }
// }
// public class Main
// {
//    public static void main(String[] args) {
//    int num;
//    System.out.println("Enter a number");
//    Scanner sc = new Scanner(System.in);
//    num = sc.nextInt();
//    boolean result = evenOdd(num);
//    if(result == true)
//    {
//       System.out.println("It ia an Even");
//    }
//    else
//    {
//       System.out.println("it is an Odd");
//    }
// }
//    static boolean evenOdd(int x)
//    {
//      if(x%2 == 0)
//      {
//       return true;
//      }
//       return false;
// int n = 5;
//    if(n<2)
//       {
//          System.out.println("Not  a Prime");
//          return;
//       }
//       boolean isPrime = true;
//    for(int i= 2 ; i*i<= n ;i++)
//    {
//       if(n%i == 0)
//       {
//          isPrime = false;
//          break;
//       }
//    }
//   if(isPrime)
//   {
//    System.out.println("It is prime");
//   }
//   else
//   {
//    System.out.println("Not a prime");
//   }
// int[] arr1 ={15,10,12};
// int n = arr1.length;
// int[] arr2 = new int[n];
// for(int i=0;i<n;i++)
// {
//    arr2[i] = arr1[i];
// }
// for(int i :arr2)
// {
//    System.out.println(Arrays.toString(arr2));
// }
// reverse 
// int[] arr1 = {1,2,3,4,5};
// int s = 0;
// int e = arr1.length-1;
// int[] arr2 = new int[arr1.length];
// for(int i=0;i<arr1.length;i++)
// {
//   arr2[s] = arr1[e];
//   s++;
//   e--;
// }
//    System.out.print(Arrays.toString(arr2));
// even-odd 
// int[] arr = {12,14,15,21};
// int n = arr.length;
// int[] even = new int[n];
// int[] odd = new int[n];
// int eindex = 0,oindex = 0;
// for(int i = 0;i<n;i++)
// {
// if(arr[i] % 2== 0)
// {
//    even[eindex] = arr[i];
//    eindex++;
// }
// else
// {
//    odd[oindex] = arr[i];
//    oindex++;
// }
// }
// System.out.println(Arrays.toString(arr)+" ");
// System.out.println(Arrays.toString(even)+" ");
// System.out.println(Arrays.toString(odd)+" ");
//1.1 Merge two Arrays
// int[] a = {1,2,3,4,5};
// int[] b = {6,7,8,9,0};
// int n = a.length,m = b.length;
// int merge[] = new int[m+n];
// int index = 0;
// for(int i =0;i<n;i++)
// {
//    merge[index] = a[i];
//    index++;
// }
// for(int j=0;j<m;j++)
// {
//    merge[index] = b[j];
//    index++;
// }
// System.out.println(Arrays.toString(merge));
// //1.2 Merge Two Arrays
// int[] a = {1,2,3,4,5};
// int[] b = {6,7,8,9,0};
// int n = a.length,m = b.length;
// int merge[] = new int[m+n];
// int index = n;
// for(int i =0;i<n;i++)
// {
//    merge[i] = a[i];
//    merge[index] = b[i];
//    index++;
// }
// System.out.println(Arrays.toString(merge));
// Largest and Smallest
// int[] arr = {10,-90,220};
// int n = arr.length;
// int largest = arr[0];
// int smallest = arr[0];
// for(int i =1;i<n;i++)
// {
//    if(arr[i] > largest)
//    {
//       largest = arr[i];
//    }
// }
// for(int j = 0;j<n;j++)
// {
//    if(arr[j] < smallest)
//    {
//       smallest = arr[j];
//    }
// }
//  System.out.println(largest);
//  System.out.println(smallest);
// Delete an Element 
// int[] arr = {31,24,55,10,20,30,40,5};
// int pos = 2;
// for(int i=pos+1;i<arr.length;i++)
// {
//   arr[i-1] = arr[i];
// }
// for(int i =0;i<arr.length - 1;i++)
// {
//    System.out.print(arr[i]+" ");
// }
// Concatinate the Array
// int[] nums = {1,2,1};
// int n = nums.length;
// int ans[] = new int[n+n];
//    for(int i=0;i<n;i++)
//    {
//       ans[i] = nums[i];
//       ans[i+n] = nums[i];
//    }
//   System.out.println(Arrays.toString(ans));
// 2 largest number
// int [] arr = {-1,-1,-19,-1,-8};
// int n = arr.length;
// int max = Integer.MIN_VALUE;
// int secmax = Integer.MIN_VALUE;
// for(int i = 0;i<n;i++)
// {
//    if(arr[i] > max )
//    {
//       secmax = max;
//       max = arr[i];
//    }
//    else if(arr[i] > secmax && arr[i] != max)
//    {
//       secmax = arr[i];
//    }
// }
// System.out.println(max);
// System.out.println(secmax);
// Search the Element
// int[] arr = {5,4,3,4,1,3,15};
// int n= arr.length;
// int target = 15;
// boolean flag = false;
// int index = arr[0];
// for(int i =0;i<n;i++)
// {
//    if(arr[i] == target)
//    {
//       index = i+1;
//       flag = true;
//       break;
//    }
// }   
// if(flag == true)
// {
//    System.out.println("Target found at "+index);
// }
// else{
//    System.out.println("Not  found");
// }
// int[] arr = {1,1,1,0};
// int n = arr.length;
// int decVal = 0;
// for(int i = 0;i< arr.length;i++)
// {
//   int val = arr[i];
//   decVal  +=  val * Math.pow(2,n-1);
//   n--;
// }
//  System.out.println(decVal);
// int result = BinaryToDec(arr);
// System.out.println(result);
// }
// public static int BinaryToDec(int[] arr)
// {
//    int decVal = 0;
//    int n = arr.length;
//    for(int i=0;i<arr.length;i++)
//    {
//       int val = arr[i];
//       decVal += val * Math.pow(2,n-1);
//       n--;
//    }
//    return decVal;
// }
// }  
//-----------------------------------------24/01/26 ------------------------------------------------------------------------------------------
// import java.util.Arrays;
// class Main
// {
//    public static void main(String[] args) 
//    {
//       int n = 100;
//       boolean result = prime(n);
//       int c = 0;
//        for(int i = 2;i<=n;i++)
//        {
//          if(prime(i))
//          {
//             System.out.print(i+" ");
//             c++;
//          }
//       }
//       // System.out.println(result ? "Prime" : "Not prime");
//       // System.out.println("\n count = "+c);
//       // boolean isPrime = true;
//       // if(n<2)
//       // {
//       //    System.out.println("Not a Prime");
//       //    return;
//       // }
//       // for(int i = 2;i*i<=n;i++)
//       // {
//       //    if(n%i == 0)
//       //    {
//       //       isPrime = false;
//       //       break;
//       //    }
//       // }
//    }
//      public static boolean prime(int n)
//      {
//       boolean isPrime = true;
//       if(n < 2)
//       {
//          return false;
//       }
//       for(int i =2;i*i <= n;i++)
//       {
//          if(n%i ==0 )
//          {
//             isPrime = false;
//             break;
//          }
//       }
//       return isPrime;
//      }
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// import java.util.*;

// class Main {

//    public static void main(String[] args) {

//       // int[] arr = { 1, 1, 2, 2, 3 };
//       // int key = 5;

//       // int[] res = rotateArr(arr, d);
//       // System.out.println(Arrays.toString(res));
//       // int[] res = occurance(arr, key);

//       // permutation(arr);
//       // System.out.println(Arrays.toString(res));
//       // duplicates(arr);
//       // int r = sum(5);
//       // System.out.println(r);

//       // int[] nums = {0,1,2,2,2,2,0,1,1,1,0,1,1};
//       // Sort(nums);

//       // int[] numss = {5,1,24,15,12,41,1};
//       // int t = 5;

//       // ArrayList<Integer> val = subsum(numss, t);
//       // System.out.println(val);

//       // int[] arr = {1,0,0,0,1};
//       // int k = 2;
//       // int r = maxOnes(arr, k);
//       // System.out.println(r);

//       // boolean r = isPower(1);
//       // System.out.println(r);
//       int[] nums = {2,1,2,3};
//       int r = longestBalanced(nums);
//       System.out.println(r);
//    }
//  public static boolean isPower(int m)
// {
//    //  for(int i = 0; i <= m; i++)
//    //  {
//    //      int r = pow2(i);
//    //      if(r == m)
//    //          return true;
//    //      if(r > m)
//    //          return false;
//    //  }
//    //  return false;

//    return m >0 && (m & (m-1)) == 0;

// }
//    public static int pow2(int n)
//    {
//        if(n==0)
//        {
//          return 1;
//        }

//        int r =2* pow2(n-1);
//        return r;
//    }
//    public static int maxOnes(int[] arr,int k)
//    {
//       int i = 0;
//       int j = 0;
//       int maxlen = 0;
//       int zeros = 0;
//       int n = arr.length;

//       while(j < n)
//       {
//          if(arr[j] == 0)
//          {
//             zeros++;
//          }
//          while(zeros > k)
//          {
//             if(arr[i] == 0)
//               {
//                zeros--;
//               }
//               i++;
//          }
//          maxlen = Math.max(maxlen ,j-i+1);

//          j++;
//       }
//       return maxlen;
//    }

//    public static ArrayList<Integer> subsum(int[] arr, int tar) {
//       ArrayList<Integer> List = new ArrayList<>();
//       int n = arr.length;
//       int i = 0;
//       int j = 1;
//       int sum = arr[0];

//       if (sum == tar) {
//          List.add(i + 1);
//          List.add(j);
//          return List;
//       }

//       while (j < n) {
//          sum += arr[j];

//          while (sum > tar) {
//             sum -= arr[i];
//             i++;
//          }
//          if (sum == tar) {
//             // System.out.println((i+1)+" "+(j+1));
//             List.add(i + 1);
//             List.add(j + 1);
//             return List;

//          }
//          j++;
//       }
//       // System.out.println(sum);

//       List.add(-1);
//       return List;

//    }

//    public static void Sort(int[] arr) {
//       int n = arr.length;
//       int t = 0;
//       int i = 0;
//       int j = 0;
//       int e = n - 1;
//       while (i <= e) {
//          if (arr[i] == 0) {
//             t = arr[j];
//             arr[j] = arr[i];
//             arr[i] = t;
//             i++;
//             j++;
//          } else if (arr[i] == 2) {
//             t = arr[e];
//             arr[e] = arr[i];
//             arr[i] = t;
//             e--;
//          } else {
//             i++;
//          }

//       }

//       System.out.println(Arrays.toString(arr));
//    }

//    public static void sumNum(String str) {
//       int sum = 0;
//       int len = str.length();

//       int val = Integer.valueOf(str);

//       while (val > 0) {
//          int last = val % 10;
//          sum += last;
//          val /= 10;
//       }

//       System.out.println("Val " + sum);

//    }

//    public static int[] rotateArr(int[] arr, int d) {

//       int n = arr.length;
//       if (d == 0 || d > n) {
//          return arr;
//       }

//       while (d > 0) {
//          int extra = arr[0];
//          for (int j = 1; j < n; j++) {
//             arr[j - 1] = arr[j];
//          }
//          arr[n - 1] = extra;
//          d--;
//       }

//       return arr;
//    }

//    public static int[] occurance(int[] arr, int key) {
//       int n = arr.length;
//       int[] nums = new int[n];

//       int i = 1;
//       while (i < n) {
//          if (key == arr[i - 1]) {
//             nums[i] = arr[i - 1];
//             arr[i - 1] = arr[i];
//          }

//          i++;
//       }
//       return nums;
//    }

//    public static void permutation(int[] arr) {
//       int n = arr.length;
//       for (int i = 0; i < n; i++) {
//          for (int j = i; j < n; j++) {
//             ArrayList<Integer> list = new ArrayList<>();
//             for (int k = i; k <= j; k++) {
//                list.add(arr[k]);
//             }
//             System.out.print(list + " ");

//          }
//       }

//    }

//    public static void duplicates(int[] arr) {
//       int n = arr.length;
//       int idx = 0;
//       for (int i = 0; i < n; i++) {
//          for (int j = i + 1; j < n; j++) {
//             if (arr[i] == arr[j]) {
//                arr[idx++] = arr[j];
//             }
//          }
//       }

//       Arrays.copyOf(arr, idx);
//       System.out.print(Arrays.toString(arr));
//    }

//    public static int sum(int n) {
//       if (n == 0) {
//          return 0;
//       }
//       int ans = 0;
//       ans = n + sum(n - 1);
//       return ans;
//    }

//     public static int longestBalanced(int[] nums) 
//     {
//         int n  = nums.length;
//         int ans = 0;

//         for(int i = 0;i<n;i++)
//         {
//             Set<Integer> even = new HashSet<>();
//             Set<Integer> odd = new HashSet<>();
//             for(int j = i;j<n;j++)
//             {
//                 if(nums[j] % 2 == 0)
//                 {
//                     even.add(nums[j]);

//                 }
//                 else
//                 {
//                     odd.add(nums[j]);
//                 }
//                 if(even.size() == odd.size())
//                 {
//                     ans = Math.max(ans, j-i+1);
//                 }
//             }
//         }

//         return ans;
//     }
// }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////  
/// 
/// 
///  Placement Prep 

class Main {
   public static void main(String[] args) {
      // CountAllDigits(1234567890,0);
      // int r = count(123, 0);
      // System.out.println(r);
      // Reverse(123, 0);
      // int r = reverse(1234, 0);
      // Palindrome(10, false);
      // ArmStrong(11);
      // boolean r = armstrong(123);
      // ArrayList<Integer> r = divisors(36);
      // for(int i = 1;i<=53;i++)
      // {
      // if(Prime(i) == true)
      // System.out.print(i+" ");
      // }
      // boolean r = Prime(2);

      // int[] arr = {1, 5, 3, 4, 6};
      // largest(arr);
      // int r = seclargest(arr);
      // boolean r = Sorted(arr);

      // int r = numberOfSteps(14);
      // ArrayList r = Triangle(arr);

      // int[] arr = { 11, 1, 1, 1, 1, 1 };
      // int tar = 13;
      // int r = bis(arr, tar, 0, arr.length-1);
      // boolean r = sort(arr,1);
      // ArrayList<Integer> r = lis(arr,0, 1,new ArrayList<>());

      // String r = BinSum(10, 13);
      // String r = addBinary(11,1);

      // int r = ReverseBits(43261596);

      // boolean r = ispower3(27);
      // System.out.println(r);

      // boolean r = bin(110);

      // int r = inversionCount(new int[] { 1, 2, 3 });

      // ArrayList<Integer> r = missingRange(new int[]{1, 4, 11, 51, 15},50,55);
      // boolean r = prime(10);
      // int r = countPrimeSetBits(6, 10);

      // String r="";
      // for(int i =1;i<15;i++)
      // {
      // r = binaryGap(i);
      // System.out.println(r);
      // }
      // int r = binaryGap(15);
      // ArrayList<Integer> r = findUnion(new int[]{1,2,3,2,1}, new
      // int[]{3,2,2,3,3,2});
      // sortofBits(arr);
      // int[] arr = { 11, 60, 26, 7, 44, 30, 18, 29, 10, 72, 3, 4, 49, 77, 23, 21,
      // 20, 34, 20, 99, 21, 70, 9, 74, 41,
      // 35 };
      // int r = longestSubarray(arr, 2);
      // System.out.println(r);
      // noSteps("1101");

      // word("HelloWolrd", "Amazing", 5);
      // String s = "racecar";
      // int r = help(s, 0, s.length()-1);

      boolean r = iso("aab", "xxy");
      System.out.println(r);
   }

   static void CountAllDigits(int n, int c) {
      if (n == 0) {
         System.err.println(c);
         return;
      }
      c++;

      CountAllDigits(n / 10, c);
   }

   static int count(int n, int c) {
      if (n == 0) {
         return c;
      }
      c++;
      return count(n / 10, c);
   }

   static void Reverse(int n, int r) {
      if (n == 0) {
         System.out.println(r);
         return;
      }

      int last = n % 10;

      Reverse(n / 10, (r * 10) + last);
   }

   static int reverse(int n, int c) {
      if (n == 0) {
         return c;
      }
      int last = n % 10;
      return reverse(n / 10, (c * 10) + last);
   }

   static void Palindrome(int n, boolean ans) {
      if (n == reverse(n, 0)) {
         System.out.println("True " + n + " is a Palindrome");
      } else {
         System.out.println("False " + n + " is not a Palindrome");
      }
   }

   static int ArmStrong(int n) {

      int sum = 0;
      while (n > 0) {
         int last = n % 10;
         int q = (int) Math.pow(last, 3);
         sum = sum + q;
         n = n / 10;
      }
      // System.out.println(sum);
      return sum;

   }

   static boolean armstrong(int n) {
      if (n == ArmStrong(n)) {
         return true;
      }
      return false;
   }

   static ArrayList<Integer> divisors(int n) {
      ArrayList<Integer> list = new ArrayList<>();

      for (int i = 0; i <= n; i++) {
         try {
            if (n % i == 0) {
               list.add(i);
            }

         } catch (Exception e) {
            System.out.println(e);
         }

      }

      return list;
   }

   static boolean Prime(int n) {
      boolean isPrime = true;
      if (n < 2) {
         return false;
      }

      for (int i = 2; i * i <= n; i++) {
         if (n % i == 0) {
            isPrime = false;
            break;
         }
      }
      return isPrime;

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

   public static String BinSum(int a, int b) {
      int sum = a + b;

      String ans = Integer.toBinaryString(sum);

      return ans;
   }

   public static String addBinary(String a, String b) {
      StringBuilder res = new StringBuilder();
      int i = a.length() - 1;
      int j = b.length() - 1;
      int carry = 0;
      while (i >= 0 || j >= 0 || carry == 1) {
         int sum = carry;
         if (i >= 0) {

         }
      }

      return res.reverse().toString();

   }

   public static int ReverseBits(int n) {

      int res = 0;

      for (int i = 0; i < 32; i++) {
         res <<= 1;
         res |= (n & 1);
         n >>= 1;
      }

      return res;
   }

   public static boolean ispower3(int n) {
      if (n == 1)
         return true;

      if (n <= 0 || n % 3 != 0)
         return false;

      return ispower3(n / 3);

   }

   public static boolean ispower4(int n) {
      if (n == 1)
         return true;

      if (n <= 0 || n % 4 != 0)
         return false;

      return ispower4(n / 4);
   }

   public static boolean bin(int n) {
      // int b = 0;
      // while(n > 0)
      // {
      // int last = n%2;

      // b= b*10+last;
      // n = n/2;
      // }
      // System.out.println(b);

      // if (n == 0) {
      // System.out.println(b);
      // return;
      // }

      // int l = n % 2;
      // b = b * 10 + l;
      // bin(n/2,b);

      String a = Integer.toBinaryString(n);
      System.out.println(a);

      for (int i = 1; i < a.length(); i++) {
         if (a.charAt(i - 1) == a.charAt(i)) {
            return false;
         }
      }

      return true;

   }

   public static int inversionCount(int arr[]) {

      // int c =0;
      // int i =0;
      // int n = arr.length;

      // while(i < n-1)
      // {
      // int j = i+1;
      // while(j < n)
      // {
      // if( arr[i] > arr[j])
      // {
      // c++;
      // }

      // j++;
      // }

      // i++;
      // }

      // return c;

      int r = ic(arr, 0, 1, 0);

      return r;

   }

   public static int ic(int[] arr, int i, int j, int c) {
      if (i >= arr.length - 1) {
         return c;
      }
      if (j >= arr.length) {
         return ic(arr, i + 1, i + 2, c);
      }
      if (arr[i] > arr[j]) {
         return ic(arr, i, j + 1, c + 1);
      }

      return ic(arr, i, j + 1, c);
   }

   public static ArrayList<Integer> missingRange(int[] arr, int low, int high) {

      HashMap<Integer, Integer> hm = new HashMap<>();
      ArrayList<Integer> list = new ArrayList<>();

      for (int i = 0; i < arr.length; i++) {
         hm.put(arr[i], 0);
      }

      for (int j = low; j <= high; j++) {
         if (!hm.containsKey(j)) {
            list.add(j);
         }
      }

      return list;
   }

   public static int countPrimeSetBits(int left, int right) {
      int count = 0;
      String bin = "";
      for (int i = left; i <= right; i++) {
         int ones = 0;
         bin = Integer.toBinaryString(i);
         for (int j = 0; j < bin.length(); j++) {
            if (bin.charAt(j) == '1') {
               ones++;
            }

         }
         if (prime(ones)) {
            count++;
         }
      }

      return count;
   }

   public static boolean prime(int n) {
      if (n < 2) {
         return false;
      }

      for (int i = 2; i * i <= n; i++) {
         if (n % i == 0) {
            return false;
         }
      }

      return true;
   }

   public static int binaryGap(int n) {
      int Maxcount = 0;

      String bin = Integer.toBinaryString(n);
      int i = -1;
      int j = 0;

      while (j < bin.length()) {

         if (bin.charAt(j) == '1') {
            if (i != -1) {
               int count = j - i;
               Maxcount = Math.max(count, Maxcount);

            }
            i = j;
         }
         j++;

      }

      return Maxcount;
   }

   public boolean hasAllCodes(String s, int k) {

      int n = s.length();
      Set<String> set = new HashSet<>();

      for (int i = 0; i <= n - k; i++) {
         set.add(s.substring(i, i + k));
      }

      return set.size() == (1 << k);
   }

   public static ArrayList<Integer> findUnion(int[] a, int[] b) {

      ArrayList<Integer> list = new ArrayList<>();

      HashSet<Integer> hs = new HashSet<>();

      for (int i = 0; i < a.length; i++) {
         if (!hs.contains(a[i])) {
            hs.add(a[i]);
            list.add(a[i]);
         }
      }

      for (int j = 0; j < b.length; j++) {
         if (!hs.contains(b[j])) {
            hs.add(b[j]);
            list.add(b[j]);
         }
      }
      return list;

   }

   public static void sortofBits(int[] arr) {

      for (int i = 0; i < arr.length - 1; i++) {
         for (int j = i + 1; j < arr.length; j++) {

            int bitI = Integer.bitCount(arr[i]);
            int bitJ = Integer.bitCount(arr[j]);

            if (bitI > bitJ ||
                  (bitI == bitJ && arr[i] > arr[j])) {

               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      System.out.println(Arrays.toString(arr));
   }

   public static int longestSubarray(int[] arr, int k) {
      // Code Here
      int max1 = 0;
      int c = 0;

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] <= k) {
            c++;
            max1 = Math.max(c, max1);
         } else {
            c = 0;
         }

      }

      return max1;
   }

   public static void noSteps(String str) {
      int c = 0;
      int i = str.length() - 1;
      while (i > 0) {
         char l = str.charAt(str.length() - 1);
         if (l == '1') {
            c += 2;
         } else {
            c++;
         }
         i--;
      }
      System.out.println(c);
   }

   public static void word(String s1, String s2, int pos) {
      StringBuilder str = new StringBuilder();
      for (int i = 0; i < s1.length(); i++) {

         if (i == pos) {
            int j = 0;
            if (j < s2.length()) {
               str.append(s2);
               str.append(s1.charAt(i));

               j = s2.length();
            }
         }

         else {
            str.append(s1.charAt(i));

         }

      }

      System.out.println(str.toString());
   }

   public static boolean pal(String s, int start, int end) {
      while (start < end) {
         if (s.charAt(start) != s.charAt(end))
            return false;
         start++;
         end--;
      }
      return true;
   }

   public static int help(String s, int start, int end) {
      if (start >= end || pal(s, start, end))
         return 0;

      int cut = Integer.MAX_VALUE;

      for (int k = start; k < end; k++) {
         int left = help(s, start, k);
         int right = help(s, k + 1, end);

         cut = Math.min(cut, left + right + 1);
      }

      return cut;
   }

   public static boolean iso(String s1, String s2) {
      HashMap<Character, Character> hm1 = new HashMap<>();
      HashMap<Character, Character> hm2 = new HashMap<>();
      for (int i = 0; i < s1.length(); i++) {
         char c1 = s1.charAt(i);
         char c2 = s2.charAt(i);

         if (hm1.containsKey(c1)) {
            if (hm1.get(c1) != c2) {
               return false;
            }
         } else {
            hm1.put(c1, c2);
         }

         if (hm2.containsKey(c2)) {
            if (hm2.get(c2) != c1) {
               return false;
            }
         } else {
            hm1.put(c2, c1);
         }
      }

      return true;

   }

}