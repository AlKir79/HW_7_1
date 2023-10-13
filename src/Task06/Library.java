package Task06;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book>  books;
    private Journal journal;
    private ArrayList<Bilet> bilets;

    public Library() {
        this.books = new ArrayList<>();
        this.bilets = new ArrayList<>();
        this.journal = new Journal();
    }

    public void addBilet(int number, Student student){
        Bilet bilet = new Bilet(number,student);
        this.bilets.add(bilet);
    }

    public void delBilet(int index){
        if (index<=this.bilets.size()){
            this.bilets.remove(index);
        }
        else{
            System.out.println("Не существует такого индекса");
        }
    }

    public Bilet getBilet(int index){
        return this.bilets.get(index);
    }

    public void addBook(String name,String author,boolean isOut){
        Book book = new Book(name,author,isOut);
        this.books.add(book);
    }

    public void delBook(int index){
        if (index<=this.books.size()){
            this.books.remove(index);
        }
        else System.out.println("Не существует книги с таким индексом");
    }

    public Book getBook(int index){
        return this.books.get(index);
    }

public void outBook(Bilet bilet, Book book, int day){
        this.journal.addOutJournalRecord(bilet,book,day);
}

public void retBook(Bilet bilet,Book book){
        this.journal.addRetJournalRecord(bilet,book);
}
    @Override
    public String toString() {
        String str = new String();
                str+="Библиотека: "+"\n";
                str+="Книги"+"\n";
                str+=books.toString()+"\n";
                str+="Студенты (читатели)"+"\n";
                str += bilets.toString()+"\n";
                str+="Журнал"+"\n";
                str+= journal.toString()+"\n";
                str+= "Журнал просроченных книг"+"\n";
                str+=journal.getLateRecords();
        return str;
    }
}
