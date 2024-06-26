 package assignment1;
abstract class LibraryResource{
	private String title;
	private String author;
	public LibraryResource(String title, String author) {
		this.title=title;
		this.author=author;		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public abstract void displayDetails();
}
class Book extends LibraryResource{
	int pageCount;
	public Book(String title, String author,int pageCount) {
		 super(title, author);
	     this.pageCount = pageCount;	
	}

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + getPageCount());
    }
}
class Magazine extends LibraryResource{
	String issueDate;
	public Magazine(String title, String author, String issueDate) {
		super(title, author);
		this.issueDate=issueDate;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	 public void displayDetails() {
	        System.out.println("Magazine Title: " + getTitle());
	        System.out.println("Author: " + getAuthor());
	        System.out.println("Issue date : " + getIssueDate());
	    }
}
class DVD extends LibraryResource{
	int duration;
	public DVD(String title, String author, int duration) {
		super(title, author);
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void displayDetails() {
        System.out.println("DVD Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration());
    }	
}

public class q6 {
	public static void main(String[] args) {
		Book book = new Book("JAVA DEVLOPMENT", "MAYUR RAMGIR", 680);
        Magazine magazine = new Magazine("VOGUE","VOGUE INC","January 2024");
        DVD dvd = new DVD("HARRY POTTER","J.K.ROWLING",150);       
        System.out.println("Book Details:");
        book.displayDetails();
        System.out.println("");
        System.out.println("Magazine Details:");
        magazine.displayDetails();
        System.out.println("");
       System.out.println("DVD Details:");
        dvd.displayDetails();
    }
}
