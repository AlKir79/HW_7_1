package Task06;

import java.time.LocalDate;

public abstract class Record {
    protected Book book;
    protected int numberBilet;
    protected LocalDate dateOut;
    protected LocalDate retDate;

    @Override
    public String toString() {
        String str = "Книга - "+ this.book.getName();
        if (dateOut!=null){
            str+=" выдана билету - "+numberBilet+" дата выдачи - " + dateOut;
        }
        else str+=" сдано билетом - "+numberBilet;
                str+=
                " дата возврата - " + retDate;
        return str;
    }
}
