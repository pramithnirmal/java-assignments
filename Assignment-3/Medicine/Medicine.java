package Ass3;

public class Medicine {
	private String name = "ABC";
	private String address ="50/3, ABC, Main Road.";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void displayLabel() {
		System.out.println("Name : "+getName()+", Address : "+getAddress());
	}

}
