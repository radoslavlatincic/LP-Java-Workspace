/*
 * Primjer klase Robot koja unutar sebe sadrzi unutrasnje klase (Inner Class) Brain i Battery
 */
public class Robot {
	
	private int id;
	
	// U slucajevima kada zelimo grupisati funkcionalnost
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " trenutno razmislja.");
		}
	}
	
	// Staticke unutrasnje klase, kada zelimo napraviti aktivnost koja nije vezana za instance
	static class Battery {
		public void charge() {
			System.out.println("Baterija se puni...");
		}
	}

	private class Eye{
		
		public void watch(boolean left,boolean right) {
			if (left && right)
			{
		System.out.println("Posmatranje....");
			}else if(left)
			{
				System.out.println("Vidi samo na lijevo oko....");	
			}else if(right)
			{
				System.out.println("Vidi samo na desno oko....");	
			}
			
	}
	}
	public Robot(int id) {
		this.id = id;
	}
	
		
	public void start(boolean left,boolean right) {
		System.out.println("Pokretanje robota " + id);
		Brain brain = new Brain();
		brain.think();
		Eye lefteye=new Eye();
		Eye righteye=new Eye();
		if (left && right){
			lefteye.watch(left,right);
			}else if(left){
				lefteye.watch(left,right);
			}else if(right){
				lefteye.watch(left,right);
			}
		
		
	}
	
}
