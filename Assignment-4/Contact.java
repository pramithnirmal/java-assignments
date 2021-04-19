package ASS4;

public class Contact {
	String firstName;
	String middleName;
	String lastName ;
	String dob;
	String Gender;
	String anniversary;
	String address;
	String area;
	String city ;
	int pincode;
	String state;
	String country;
	String telephoneNumber;
	String mobileNumber;
	String email;
	String website;
	
	public void validate() throws Exception{
		if (firstName == null || lastName == null || 
				dob == null || email == null) {
			throw new Exception("FirstName, LastName, DOB and Email are compulsory!");
		}
		else if (!isValidEmail(email)) {
			throw new Exception("Invalid Email given. correct format is somename@gmail.com");
		}
		else if (telephoneNumber == null && mobileNumber == null) {
			throw new Exception("Mobile number or telephone number must be given");
		}
		else {
			System.out.println("Contact is validated!");
		}
	}
	
	private static boolean isValidEmail(String email) {
		if (email!=null) {
			String[] parts = email.split("@");
			if(parts.length>1 && parts[1].equals("gmail.com")) {
				return true;
			}
		}
		return false;
	}
}
class Date{
	int year, month, day;
}