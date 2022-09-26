import java.util.Scanner;
public class Program3 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter 'a' value");
int a=scan.nextInt();
int x=-1;
for(int i=1; i<=a; i++)
{
if(a%2!=0){
x=x+2;
System.out.print(x);
if(i<=a-1){
System.out.print(", ");
}
else{
System.out.print(" ");
}	
}
else{
System.out.print(x+2);
System.exit(0);
}
}
}
}