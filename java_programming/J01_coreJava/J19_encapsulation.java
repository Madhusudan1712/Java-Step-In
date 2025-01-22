package java_programming.J01_coreJava;

public class J19_encapsulation {
    //providing data security (read-only,write-only or read-write)
    public static void main(String[] args){
        //object creation
        Book newBook = new Book();

        //read book
        var bookData=newBook.readBook();
        System.out.println(bookData);

        System.out.println("----------------------------------------");

        //edit book details
        newBook.editBookDetails("Atomic Habits",120);
        var editedBookData=newBook.readBook();
        System.out.println(editedBookData);
    }
}

class Book{
    private String bookName="The Subconscious Mind 2024";
    private int price=100;
    String readBook(){
        return "Book : "+bookName+"\nPrice : "+price+"Rs";
    }
    void editBookDetails(String bookName,int price){
        this.bookName = bookName;
        this.price = price;
    }
}
