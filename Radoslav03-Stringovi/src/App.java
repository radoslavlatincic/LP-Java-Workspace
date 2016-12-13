
public class App {

	public static void main(String[] args) {
		//Deklarisanje niza (niz stringova)
		
		/*String[] words=new String[3];
		
		//Upisi vrijednosti u za string
		
		words[0]="Pozdrav,  ";
		words[1]="Kako si ";
		words[2]="ti  ?";
		//Deklarisanje i definisanje stringa istovremeno
		String[] fruits={"jabuka","banana","jagoda","kivi","jagoda"};
		
		//Kratka forma  FOR petlje
		
		for(String fruit: fruits){
		System.out.println(fruit);	
		}
		
		//Konkatenacija stringova
		
		String ime="Marko";
		String prezime="Markovic";
		System.out.println(ime+" "+prezime);
		*/
		/*
		 * 
		 * Zadatak
		 * Napisati imena i prezimena u nizu stringova i ispisati kroz petlju
		 */
		String[] polaznici={"Darko Gajic","Miroslav Jagodic","Ranko Vujicic","Dragana Pupac","Tanja Stankovic","Mladen Tosic","Blanka Preradovic","Radoslav Latincic","Sanja Kg","Srki 972","Lupi Ga"};
		for (String polaznik: polaznici){
			System.out.println(polaznik);
		}
	}

}
