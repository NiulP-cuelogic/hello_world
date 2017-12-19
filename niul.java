import java.util.Scanner;

public class niul
{

public static int fac(int n)
{
 if(n==0)
  {
    return 1;
  }
 else
  {
    return n*fac(n-1);
  }
}

public static int add(int a,int b)
{
return (a+b);
}

public static int sub(int a,int b)
{
return (a-b);
}

public static void main(String[] args)
 { 
     Scanner sc = new Scanner(System.in);
     System.out.println("Hello world!!");
     System.out.println("enter the number:");
     int n = sc.nextInt();
     System.out.println(fac(n));
     System.out.println("enter the two numbers:");
     int a = sc.nextInt();
     int b = sc.nextInt();
     System.out.println(add(a,b));
     System.out.println(sub(a,b));
 }
}
