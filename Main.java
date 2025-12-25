
// {
//    public static void main(String[] args) {
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
public class Main {

    public static void main(String[] args) {
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
    int n=4;
    if(n==0)
      {
         System.out.println("0");
         return;
      }
    int first = 0,sec = 1;
   //  System.out.print(first+" "+sec+" ");
      int third = first + sec;

   for(int i=2;i<n;i++)
      {
      third = first + sec;
      // System.out.print(third+" ");
      first = sec;
      sec = third;
      
      }
      System.out.print(third+" ");

 
    }
}


