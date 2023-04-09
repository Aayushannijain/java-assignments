import java.util.*;
public class average
{
public static void main(String arg[])
{
int n,nu, count=1, sum=0;
float ave;
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of n:");
n=sc.nextInt();
while(count <= n)
{
System.out.println("enter the"+count+"number:");
nu=sc.nextInt();
sum=sum+nu;
++count;
}
ave=sum/n;
System.out.println("the average of"+n+"numbers is ="+ave);
}

}