import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class App 
{
    public static void main(String[] args)
     
    {
        q18();
    
    }
    public static int getinteger(String message)
    {
        System.out.println(message);
    Scanner s =new Scanner(System.in);
    int value =s.nextInt();
    return value;
    }
    public static double getdouble(String message)
    {
        System.out.println(message);
    Scanner S =new Scanner(System.in);
    double value =S.nextDouble();
    return value;
    }
    public static void q1()
    {
        int firstnum= getinteger("enter the first number");
        int secnum= getinteger("enter the second number");
        System.out.println(add( firstnum,secnum));
        System.out.println(diff(firstnum, secnum));
        System.out.println(pro(firstnum, secnum));

     }
     public static int add (int a, int b)
     {
        return(a+b);
     }
     public static int diff(int a,int b)
     {
        return (Math.abs(a-b));
     }
     public static int pro(int a,int b)
     {
        return(a*b);
     }
     public static void q2()
     {
        int firstnum= getinteger("enter the first number");
        int secnum= getinteger("enter the second number");
        System.out.println(Math.pow(firstnum, secnum));

     }
     public static void q3()
     {
        double  height  = getdouble("enter the height");
         double width = getdouble("enter the width");
         double length =getdouble("enter the length");
        System.out.println(volrectangle(length, height, width));
     }
    public static  double volrectangle( double l,double h ,double w)
    {
        return l*h*w;
    }

    public static void q4()
    {
        int radius=getinteger("enter the radidus ");
        double Pie=Math.PI;
        double perimeterofcircle=2*Pie*radius;
        System.out.println("the perimeter of circle is "+perimeterofcircle);

    }

    public static void q5()
    {
         int numerator=getinteger("enter the numerator");
         int denominator=getinteger(" enter the denominator ");
         System.out.println("quoient"+quoient(numerator, denominator));
         System.out.println("remainder"+remainder(numerator, denominator));


    }
    public static double quoient (int a, int b)
    {
        return a/b;
    }
    public static int  remainder (int a ,int b)
    {
        return a%b;

    }

    public static void q6()
    {
        int square=getinteger("enter the numbeer ");
        System.out.println("enter the number" + square(square));


    }
    public static  int square (int a )
    {
        return a* a;
    }
     public static void q7()
     {
        double square=getdouble("enter the number ");
        System.out.println("enter the number "+root(square));

     }
     public static double root(double a)
     {
        return Math.sqrt(a);
     }
 
     public static void q8()
     {
        double  breadth=getdouble("enter the area of breadth");
        double  height=getdouble("enter the area of height");
        System.out.println("enter the traingle"+ traingle(breadth, height));

     }
      public static double traingle(double b, double h)
      {
        return(1/2.0*(b*h));
      }

      public static void q9()
      {
         int kilometer = getinteger("enter the kilometer to  find the miles ");
         double  result= kilotomile(kilometer);
         System.out.println("the mile calculation given number is "+ result);

      }
      public static double kilotomile(int num)
      {
        double onemile =1.60934;
        return(num*onemile);
      }

      public static void q10()
      {
        double celsuis= getdouble("enter the celsuis");
        System.out.println(" the farhenhiet value  "+ farhenhit(celsuis));



      }
      public static double farhenhit(double c)
      {
        return (c*9/5)+32;
      }

      public static void q11()
      {
        int value1=getinteger("enter the  value a ");
        int value2=getinteger("enter the value b ");
        swap(value1, value2);


      }
      public static void swap (int a, int b)
      {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("enter the value after swap ");
        System.out.println("enter the value for is:"+a);
        System.out.println("enter the value for;" + b);
        
      }
      public static void q12()
      {
        System.out.println(" enter the after value swap");
        
        int value1= getinteger("enter the value a");
        int value2 =getinteger( " enter the value b");
        Swapwithouttemp(value1, value2);
    

        
      }

      public static void Swapwithouttemp(int a, int b)
      {
        a=a*b;
        b=a/b;
        a= a/b;
        System.out.println("the values after swap");
        System.out.println("the value for is "+a);
        System.out.println("the value for is"+b);
      }

      public static void q13()
      {
        System.out.println(" enter the after value swap");
        
        int value1= getinteger("enter the value a");
        int value2 =getinteger( " enter the value b");
        swapwithoutoverflow(value1, value2);

      }


      public static void swapwithoutoverflow(int a, int b)
      {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("the values after swap");
        System.out.println("the value for is "+a);
        System.out.println("the value  for is "+b);
      }
      public static void q14()
      {
        System.out.println("the random number "+ Randomnum());


      }
      public static  int  Randomnum()
      {
        Random r= new Random();
         int num=r.nextInt(1,100);
         return num;

      }

      public  static void q15()
      {
        double length = getdouble("enter the value of length in feet ");
        double width = getdouble(" enter the  value of width in feet ");
        System.out.println("area of field in the  acre"+areaoffield(length, width));
      }
      public static double   areaoffield( double l,double w)
      {
        int oneacre=43560;
        return(l*w)/oneacre;

      }
  

//loops


public static void f1()
{
  int number=getinteger("enter the number");
  for (int i=1;i<=number;i++)
  {
    System.out.println(i);
  }
}
public static void w1()
{
  int number=getinteger("enter the number");
  int i=1;
  while (i<=number) {
    System.out.println(i);
    
    i++;
  }
}
  public static void d1()
  {
    int number =getinteger("enter the number ");
    int i=1;
    do
    {
      System.out.println(i);
      i++;
    }
    while(i<= number);

  }

  public static void f2()
  {
    int number1=getinteger("enter the number1");
    int  number2=getinteger("enter the number2");
    for(int i=number1; i<number2;i++)
    {
      System.out.println(i);

    }
  }

  public static void w2()
  {
    int number1=getinteger("enter the number1");
    int  number2=getinteger("enter the number2");
    int i=number1;
    while (i<number2) {
      System.out.println(i);
      i++;
    }
  }
  public static void d2()
  {
    int number1=getinteger("enter the number1");
    int  number2=getinteger("enter the number2");
    int i=number1;
    do{
      System.out.println(i);
      i++;
      
    }
    while(i<number2);
  }
  public static void w3()
  {
    int num=getinteger("enter the num1");
    for (int i=1;i<=num;i++)
    {
      if (i%2==0) {
        System.out.println(i);
      }
    }
  }
  public static void d4()
  {
    int num=getinteger("enter the num1");
    int i=1;
    do{
      if (i%2!=0) {
        System.out.println(i);
      
      }
      i++;
    }
    while(i<=num);
  }
  public static void w5()
  {
    
    int number1=getinteger("enter the number1");
    int  number2=getinteger("enter the number2");
    int i=number1;
    while (i<number2) {
      if (i%2==0) {
        System.out.println(i);

      }
      i++;
      
    }
  }

  public static void d6()
  {
    int number1=getinteger("enter the number1");
    int  number2=getinteger("enter the number2");
    int i=number1;
    do{
      if (i%2!=0) {
        System.out.println(i);

        
      }
      i++;
    }
    while(i<number2);

  }

  public static void f7()
  {
    int num=getinteger("enter the num1");
    for(int i=1;i<=100;i++)
    {
      if (i%num==0) {
        System.out.println(i);
      }

    }
  }
    public static void d8()
    {
      int num=getinteger("enter the num1");
      int i=1;
      do
    {
      System.out.println(i*num);
    
      i++;
    }
    while(i<=20);
      
    }
    public static void w9()
    {
      int i=1;
      int j=1;
      while (i<=3) {
        while (j<=20) 
        {
          System.out.println(j+"X"+i+"="+i*j);
          j++;
        }
        i++;
      }
    }
 
   public static void f10()
   {
    int num=getinteger("enter the number ");
    int sum=0;
    for(int i=1; i<=num;i++)
    {
      sum=sum+i;

    }
    System.out.println(" the number is "+sum);

   }
   


   //basicss

   public static void q16()
   {  

    int N=getinteger("find sum of natural numbers");
    System.out.println("the naturalnumber"+ naturalnumber(N));

   }
   public static double naturalnumber(int N)
   {
    return (N*(N+1/2));

   }

   public static void q17()
   {

    int mark1= getinteger("enter the mark1");
    int mark2= getinteger("enter the mark2");
    int mark3= getinteger("enter the mark3");
    System.out.println("enter the marks"+average(mark1, mark2, mark3));
   }
   public static double average (int m1,int m2,int m3)
   {
    int result=m1+m2+m3;
    return result /3;
    
   }

   public static void q18()
   {
    double billamount=getdouble("tipsto be provided the waiter ");
    System.out.println("tipsof calculate "+tipofpercentage(billamount));
   }

   public static double tipofpercentage(double ba)
   {
    return(ba*(5/100.0));
   }

}



    


