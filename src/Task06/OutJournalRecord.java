package Task06;
import java.time.LocalDate;

public class OutJournalRecord extends Record{

    public OutJournalRecord(Bilet bilet, Book book, int day) {
        this.numberBilet = bilet.getNumber();
        this.book = book;
        this.dateOut = LocalDate.now();
        this.retDate = LocalDate.now().plusDays(day);
        book.setIsOut(true);
    }

    public LocalDate getRetDate() {
        return retDate;
    }
}
