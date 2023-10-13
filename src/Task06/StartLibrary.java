package Task06;

public class StartLibrary {
public void startLibrary(){
// объявляем библиотеку
    Library library = new Library();
// заполняем библиотеку
    library.addBook("Всадник без головы","Майн Рид",false);
    library.addBook("Малыш", "Аркадий и Борис Стругацкие",false);
    library.addBook("Трудно быть богом", "Аркадий и Борис Стругацкие",false);
    library.addBook("Стальная крыса", "Гарри Гаррисон",false);
    library.addBook("Поселок", "Кир Булычев",false);
    library.addBook("Петр 1", "Алексей Толстой",false);
    // добавляем читателей
    library.addBilet(001,(new Student("Алексей","Сотников",18,615,true)));
    library.addBilet(002,(new Student("Маргарита","Орлова",19,545,true)));
    library.addBilet(003,(new Student("Михаил","Махов",20,425,true)));
    library.addBilet(004,(new Student("Кристина","Ганина",18,615,true)));
    //пытаемся поработать...
    //заполняем журнал
    //выдаем книги
    library.outBook(library.getBilet(1),library.getBook(4),14);
    library.outBook(library.getBilet(3),library.getBook(2),0);
    library.outBook(library.getBilet(0),library.getBook(3),14);
    //возвращаем книги
    library.retBook(library.getBilet(1),library.getBook(4));
    // выводим библиотеку
    System.out.println(library.toString());

}
}