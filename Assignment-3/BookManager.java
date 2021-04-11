package Ass2;
import java.util.*;

public class BookManager {
	private Book[] books = new Book[3];
	
	private void createBooks() {
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.setTitle("Jurasic Park");
		book1.setPrice(1500.00);
		book1.setAuther("Author X");
		book1.setPublication("Magazine X");
		
		book2.setTitle("Tarzan of the Apes");
		book2.setPrice(700.00);
		book2.setAuther("Edgar Rice Burroughs");
		book2.setPublication("American Pubs");
		
		book3.setTitle("Robinson crusoe");
		book3.setPrice(650.00);
		book3.setAuther("Charles Dickens");
		book3.setPublication("American Pubs");
		
		
		books[0]=book1;
		books[1]=book2;
		books[2]=book3;
	}
	
	private void showBooks() {
		System.out.println("Title \t Price");
		for (int i = 0;i<books.length;i++) {
			System.out.println(books[i].getTitle()+"\t"+books[i].getPrice());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager bookManager = new BookManager();
		bookManager.createBooks();
		bookManager.showBooks();
	}

}
