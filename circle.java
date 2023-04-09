import java.util.Scanner;
public class circle
{
public static void main (String arg[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter the radius");
float r = sc.nextFloat();
double area = (22*r*r)/7;
System.out.println("Area of circle : " + area);
}
}