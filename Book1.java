package lab1;

public class Book1 {
    private String title;
    private String author;
    private int year;
    public  Book1(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setYear(int year){ this.year = year; }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        return ("Title : " + title +"\nAuthor : " +
                this.author + "\nYear : " + this.year);
    }
}
class TestBook {
    public static void main(String[] arg){
        Book1 b1 = new Book1("Manager","CHEL A", 2019);
        System.out.println(b1.toString());
    }
}