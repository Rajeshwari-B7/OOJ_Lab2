import java.util.Scanner;
class Book{
int bookid,no_of_pages,year_of_pub;
String booktitle,author,publisher;
double price;
Scanner ss=new Scanner(System.in);
void getdata(){
System.out.println("Enter the book name:");
booktitle=ss.next();
System.out.println("Enter the book ID and the number of pages:");
bookid=ss.nextInt();
no_of_pages=ss.nextInt();
System.out.println("Enter the year of publication and publisher of the book:");
year_of_pub=ss.nextInt();
publisher=ss.next();
System.out.println("Enter the name of the author and price of the book:");
author=ss.next();
price=ss.nextDouble();
}
void display(){
System.out.println("Book name:"+booktitle);
System.out.println("Book ID:"+bookid);
System.out.println("Number of pages:"+no_of_pages);
System.out.println("Author:"+author);
System.out.println("Publisher:"+publisher);
System.out.println("Year of publication:"+year_of_pub);
System.out.println("Price:"+price);
}
void authorname(String authorn){
if(authorn.equals(author))
display();
}
static String bookn_display(Book b1,Book b2,Book b3){
if(b1.price>b2.price&&b1.price>b3.price)
return b1.booktitle;
else if(b2.price>b1.price&&b2.price>b3.price)
return b2.booktitle;
else
return b3.booktitle;
}
int count(){
if(year_of_pub==2020)
return 1;
else
return 0;
}
static void leastpages(Book b1,Book b2,Book b3){
if(b1.no_of_pages<b2.no_of_pages&&b1.no_of_pages<b3.no_of_pages){
System.out.println("The book with least number of pages is:");
b1.display();
}
else if(b2.no_of_pages<b1.no_of_pages&&b2.no_of_pages<b3.no_of_pages){
System.out.println("The book with least number of pages is:");
b2.display();
}
else
b3.display();
}
}
class Bookmain{
public static void main(String args[]){
String auth,most_expensive;
Book b1=new Book();
Book b2=new Book();
Book b3=new Book();
Scanner ss=new Scanner(System.in);
System.out.println("Enter the details of book1");
b1.getdata();
System.out.println();
System.out.println("Enter the details of book2");
b2.getdata();
System.out.println();
System.out.println("Enter the details of book1");
b3.getdata();
System.out.println();
System.out.println("Details of book1");
b1.display();
System.out.println();
System.out.println("Details of book2");
b2.display();
System.out.println();
System.out.println("Details of book3");
b3.display();
System.out.println();
System.out.println("Enter the name of the author whose book details is to be printed");
auth=ss.next();
b1.authorname(auth);
b2.authorname(auth);
b3.authorname(auth);
System.out.println();
most_expensive=Book.bookn_display(b1,b2,b3);
System.out.println("The most expensive book is:"+most_expensive);
System.out.println("The count of the books published in the year 2020 is:"+(b1.count()+b2.count()+b3.count()));
b1.leastpages(b1,b2,b3);
}
}
