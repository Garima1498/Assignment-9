import java.util.Scanner;
class Stringa
{
public static void main(String[] args)
{
String x;
Scanner s=new Scanner(System.in);
System.out.println("Enter String");
x=s.nextLine();
int a=x.length();
for(int i=0;i<a;i++)
{

System.out.println("Substring ("+i+") "+x.substring(i));

}
}


}
