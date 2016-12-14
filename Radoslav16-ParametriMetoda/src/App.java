class Frog {
	private String name;
	private int age;
	private String boja;
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setBoja(String boja){
		this.boja=boja;
	}
	public String getBoja(){
		return boja;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setInfo(String name, int age,String boja){
		setName(name);
		setAge(age);
		setBoja(boja);
	}
	public void makeSound(){
		System.out.println("Ja sam "+ this.name+". Kre, kre, sta ima novo?");
	}
}

public class App {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog();
		Frog frog2=new Frog();
		
		frog1.setName("Zabac");
		frog1.setAge(1);
		frog1.setBoja("Zelen");
		
		frog2.setName("Kermit");
		frog2.setAge(2);
		frog2.setBoja("Zut");
		
		System.out.println(frog1.getBoja()+" "+frog1.getName());
		
		frog1.setInfo(frog1.getName(), frog1.getAge(),frog1.getBoja());
		frog2.setInfo(frog2.getName(), frog2.getAge(),frog2.getBoja());
		frog1.makeSound();
		System.out.println(frog2.getBoja()+" "+frog2.getName());
		frog2.makeSound();

	}

	
}
