import university.*;

public class Program {
	
	public static void main(String args[]){
		
		
		Person babul = new Person();
		babul.print();
		
		babul.setFirstName("Babul") ;
		babul.setLastName ( "Mirdha");
		babul.setAddress( "Dhaka");
		babul.height = 5;
		babul.print();
		
		Person sabuj = new Person();
		
		sabuj.setFirstName( "Sabuj");
		sabuj.setLastName ( "Talukder");
		sabuj.setAddress ( "Rajshahi");
		sabuj.setAge(30)  ;
		
		sabuj.print();

		Person mamun = new Person("Montasir","Manun","BAF shahin",14);
		mamun.print();
		
	}

}
