import java.util.Scanner;

public class Program2{
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int x=-1;
for(int i=1; i<=a; i++)
{
  x=x+2;
  System.out.print(x);
   if(i<=a-1){
    System.out.print(", ");
}
else{
  System.out.print(" ");
    }
  }
 }
}
