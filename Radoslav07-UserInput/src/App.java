import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
String ime =new String();
String prezime =new String();
String pol =new String();

System.out.println("Unesite svoje ime:");
ime=input.nextLine();
System.out.println("Unesite svoje prezime:");
prezime=input.nextLine();
System.out.println("Unesite pol:");
pol=input.nextLine();
System.out.println("Zdravo "+ime+" "+prezime+"."+"Vi ste "+pol+".");
input.close();
	}

}
