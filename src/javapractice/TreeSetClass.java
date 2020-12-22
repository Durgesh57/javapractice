package javapractice;
import java.util.*;
public class TreeSetClass {
	
	public static void main (String[] args) {
		TreeSetClass tt=new TreeSetClass();
		tt.go();
	}
	public void go() {
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your Body");
		Book b3 = new Book("Finding Emo");

		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}
}
class Book {
	String title;
	public Book(String t) {
		title = t;
	}
}

