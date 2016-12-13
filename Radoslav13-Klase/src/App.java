class Student
{
String ime;
String prezime;
int godinaStudija;
boolean aktivan;

}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student1=new Student();
Student student2=new Student();

student1.ime="Marko";
student1.prezime="Markovic";
student1.godinaStudija=3;
student1.aktivan=true;


student2.ime="Janko";
student2.prezime="Jankovic";
student2.godinaStudija=1;
student2.aktivan=true;

System.out.println("Studenti su: "+ student1.ime+","+student2.ime+".");
	}

}
