package ASS4;

public class PeopleStack {
	Contact[] people;
	private int pointer;
	
	public PeopleStack(int size) {
		people = new Contact[size];
		pointer = 0;
	}
	
	public void push(Contact contact) throws Exception {
		if(pointer == people.length) {
			throw new Exception("Stack is full. Canonot push more!");
		}
		contact.validate();
		System.out.println("contact added!");
		people[pointer++] = contact;
	}
	
	public Contact pop() throws Exception {
		if (pointer==0) {
			throw new Exception("Stack is empty. Cannot pop!");
		}
		System.out.println("contact poped!");
		return people[--pointer];
	}
}
