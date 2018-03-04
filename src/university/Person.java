package university;


public class Person {
	
 private	String firstName;
 private	String lastName;
 private	String address;
 private	int age;
  float height;
	
 
 	public Person(){
 		firstName = "nothing";
 		lastName = "noting";
 		address = "nothing";
 		age  = 0;		
 	}
 	
 	
 	public Person(String newFirstName, String newLastName, String newAddress, int newAge ){
 		firstName =newFirstName;
 		lastName = newLastName;
 		address = newAddress;
 		age  = newAge;		
 	}
 	
	
	String getFullName(){
		return getFirstName() + " " + getLastName();
	}
	
	
	public void print(){
		float sum;
		int x, y;
		
		String info = "Name: " + firstName + "\n";
		info +=  "Address: " + lastName + "\n";
		info +=  "Age: " + age + "\n";
		
		System.out.println(info);
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

}
