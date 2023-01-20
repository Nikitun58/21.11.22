public class Main {
    public static void main(String[] args) {
        //Задание №1 (1-7 пункт)
        System.out.println("Задание №1 (1-7 пункт)");
        Author author = new Author("Александр", "Пушкин");
        Author author2 = new Author("Уильям", "Шекспира");
        Book book = new Book("Маленький Принц", 1836, author);
        Book book2 = new Book("Ромео и Джульетта", 1597, author2);
        System.out.println(author.getfirstName() + " " + author.getsecondName() + " - ''" + book.getName() + "'' "  + book.getpublicationYear() + " год.");
        System.out.println(author2.getfirstName() + " " + author2.getsecondName() + " - ''" + book2.getName() + "'' "  + book2.getpublicationYear() + " год.");
    }

}