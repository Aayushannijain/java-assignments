import java.util.*;
class Rect
{
int length, breadth;
}
class AreaOfRect
{
public static void main(String args[])
{
int area;
Rect rect = new Rect();
Scanner sc = new Scanner(System.in);
System.out.println("enter the length of rectangle");
rect.length = sc.nextInt();
System.out.println("enter the breath of rectangle");
rect.breadth = sc.nextInt();
area = rect.length*rect.breadth;
System.out.println("The area of rectangle is "+ area);
}
} 

