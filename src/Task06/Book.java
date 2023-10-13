package Task06;

public class Book {
    private String name;
    private String author;
    private boolean isOut;

    public Book(String name, String author, boolean isOut) {
        this.name = name;
        this.author = author;
        this.isOut = isOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getIsOut() {
        return isOut;
    }

    public void setIsOut(boolean out) {
        isOut = out;
    }

    @Override
    public String toString() {
        String str = "\n"+
        "Название - " + name + " " +
                ", Автор - " + author+" ";

                if  (isOut==true) {str+=" Выдана";}
                else {str+=" В наличии";}
                return str;
    }
}
