public class Car extends Machine {
     
	private String name;
     
    @Override
    public void start() {
        System.out.println("Auto ukljuceno.");
    }
 
    public void wipeWindShield() {
        System.out.println("Brisaci ukljuceni.");
    }
     
    public void showInfo() {
        System.out.println("Naziv auta: " + super.name);
    }
    
    @Override
    public void stop(){
    	 System.out.println("Auto iskljuceno.");
    }
}