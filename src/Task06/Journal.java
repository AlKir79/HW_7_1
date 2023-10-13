package Task06;

import java.util.ArrayList;
import java.time.LocalDate;

public class Journal {
    private ArrayList<Record> records;

    public Journal() {
        this.records = new ArrayList<>();
    }

    public void addOutJournalRecord(Bilet bilet, Book book, int day){
        if (book.getIsOut()==false){
        OutJournalRecord outRecord = new OutJournalRecord(bilet,book,day);
        this.records.add(outRecord);}
        else System.out.println("Книга уже выдана");
    }
    public void addRetJournalRecord(Bilet bilet, Book book){
        RetJournalRecord retRecord = new RetJournalRecord(bilet,book);
        this.records.add(retRecord);
    }

    public void delRecord(int index){
        if(index<=records.size()){
            this.records.remove(index);
        }
        else System.out.println("Индекс за пределами библиотеки");

    }
    public Record getRecord(int index) {
        if (index <= records.size()) {
            return records.get(index);
        } else
        { System.out.println("Индекс за пределами библиотеки");
            return null;}
    }
    public String getLateRecords(){
        String str= new String();
        for (int i=0;i<this.records.size();i++){
           if ((records.get(i).book.getIsOut()==true)&&(records.get(i).retDate.compareTo(LocalDate.now())==0)){
               str+=(records.get(i)+"\n");
           }
        }
        return str;
    }

    @Override
    public String toString() {
        String str = "Журнал библиотеки \n";
        for (int i=0;i<this.records.size();i++){
            str+=(records.get(i)+"\n");
        }
        return str;
    }
}
