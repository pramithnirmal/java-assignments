package ASS4;

public class TestContact {

	public static void main(String[] args) {

     PeopleStack stack = new PeopleStack(3); 
		
		Contact c1 = new Contact();
		c1.firstName = "John ";
		c1.lastName = "Doe";
		c1.dob = "1987-05-04";
		c1.email = "JohnDoe@gmail.com";
		c1.mobileNumber = "0773350088";
		
		Contact c2 = new Contact();
		c2.firstName = "Melissa";
		c2.lastName = "Mayer";
		c2.dob ="1990-09-09";
		c2.email = "Melissa@gm.com";//invalid
		c2.mobileNumber = "0773350088";
		
		Contact c3 = new Contact();
		c3.firstName = "Sheryl";
		c3.lastName = "Sanderberg";
		c3.dob = "1978-09-04";
		c3.email = "sherylS@gmail.com";
		//no contact number given
		
		try {
			stack.push(c1);
			stack.pop();
			
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		try { 
			stack.push(c2);
		    }
		catch(Exception ex) {System.out.println(ex.getMessage());}
		
		try { 
		    stack.push(c3);
		    }
		catch(Exception ex) {System.out.println(ex.getMessage());}
	}

}
