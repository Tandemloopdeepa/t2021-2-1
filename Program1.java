import java.util.*;
class Program1
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the 'a' value");
double a=scan.nextDouble();
System.out.println("Enter the 'b' value");
double b=scan.nextDouble();
double c=a+b;
System.out.println("Addition is"+c);
c=a-b;
System.out.println("Subtraction is"+c);
c=a*b;
System.out.println("Multiplication is"+c);
c=a/b;
System.out.println("Division is"+c);
}
}
