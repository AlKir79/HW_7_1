package Task06;

import java.time.LocalDate;

public class RetJournalRecord extends Record {
    public RetJournalRecord(Bilet bilet,Book book) {
        this.numberBilet = bilet.getNumber();
        this.book = book;
        this.retDate = LocalDate.now();
        book.setIsOut(false);
    }
}
