import java.util.Scanner;
public class Program4 {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int arr[]=new int[11];
System.out.println("Enter array contents");
for(int i=0; i<=arr.length-1; i++)
{
arr[i]=scan.nextInt();
}
for(int j=1; j<=9; j++)
{
int count=0;
for(int i=0; i<=arr.length-1; i++)
{
if(arr[i]%j==0)
{
count++;
}
}
System.out.print(j+":"+count++);
if(j<=8){
System.out.print(",");
}
else{
System.out.print(" ");
}
}
}
}