
//       System.out.println("Hello");
//    }
// }

/*
import java.util.Scanner;




public class Main
{
public static void main(String[] args)
{
 String a,b;
 a="sunil ";
 b="kumar";
 System.out.println(a+b);
}
} 




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

public class Main
{
   public static void main(String[] args) {
      
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




}
}  