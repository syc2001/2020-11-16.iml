package test9;

import test6.Person;

public class Class2 {
    public static void main(String[] args) {
        Class1 per=new Class1("zhangsan",60);
        Book book=new Book("java",50);
        per.setBook(book);
        book.setPerson(per);
        System.out.println("" +per.getName()+"" +per.getAge()+"" +per.getBook().getTitle()+per.getBook().getPrice()
                );
    }
}
