import java.util.*; 
import java.io.File; //imports java file class

public class Createfile{
public static void main (String arg[])
{
try{
File obj = new File ("newfile.txt");
if(obj.creatNewFile())
{ System.out.println("File created: " + obj.getName());
}
else{
System.out.println("File already exists.");
}
}
catch(IOExcepttion p)
{System.out.println("An error has occurred");
p.printStackTrace();
}
}
}