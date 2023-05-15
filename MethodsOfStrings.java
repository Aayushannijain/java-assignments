public class MethodsOfStrings{
public static void main(String arg[]){
String name = "Harry";
System.out .println(name);
int value = name.length();
System.out .println(value);
String lstring = name.toLowerCase();
System.out .println(lstring);
String ustring = toUpperCase();
System.out .println(ustring);

//use of trim method in string
String nontrimmeds = "    Harry    ";
String trimmedS = nontrimmeds.Trim();
System.out.println(trimmeds);

System.out .println(name.substring(1,3));

//return a value at particular index
System.out .println(name.charAt(2));
System.out .println(name.charAt(4));
System.out .println(name.charAt(6));
 
String modifiedName = "Harryrryrry";
System.out .println(modifiedName.indexOf("rry"));
System.out .println(modifiedName.lastIndexOf("rry",7));
System.out .println(name.equalsIgnoreCase("HaRRy"));
}
}