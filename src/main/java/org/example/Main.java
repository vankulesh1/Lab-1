package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lib library = new Lib();
        library.addBook(new Book("1984", "Джордж Орвелл", "978-617-7585-71-7", 2022));
        library.addBook(new Book("451 градус за Фаренгейтом", "Рей Бредбері", "978-966-10-3874-4", 2021));
        library.addBook(new Book("Війна світів", "Герберт Веллс", "978-617-1215-13-9", 2016));


        int menuItem;
        do {
            System.out.println("1. Додайте нову книжку: Приклад: Дюна - Герберт Френк - 978-966-917-613-4 - 2021 ");
            System.out.println("2. Виведіть всі книги на екран: ");
            System.out.println("3. Знайдіть книгу по назві: ");
            System.out.println("4. Видаліть книгу за ISBN");
            System.out.println("0. ЗАкрити бібліотеку");
            System.out.print("Оберіть потрібний пункт меню: ");
            menuItem = scanner.nextInt();

            switch (menuItem) {
                case 1:
                    // Додавання нової книги до бібліотеки
                    System.out.println("Введіть відомості про книгу:");
                    System.out.print("Назва: ");
                    scanner.nextLine();
                    String titleBook = scanner.nextLine();
                    System.out.print("Автор: ");
                    String authorBook = scanner.nextLine();

                    System.out.print("ISBN: ");
                    String isbnBook = scanner.nextLine();

                    System.out.print("Рік видання: ");
                    int yearBook = scanner.nextInt();

                    Book newBook = new Book(titleBook, authorBook, isbnBook, yearBook);
                    library.addBook(newBook);
                    System.out.println("/------------------------------------------------------------------------------------------/");
                    System.out.println("Книга додана.");
                    System.out.println("/------------------------------------------------------------------------------------------/");
                    break;

                case 2:
                    // Виведення всіх книг на екран
                    library.displayBooks();
                    break;

                case 3:
                    // Пошук книги за назвою
                    System.out.print("Введіть назву книги: ");
                    scanner.nextLine();
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBookTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("/------------------------------------------------------------------------------------------/");
                        System.out.println("Знайдена книга: " + foundBook.getTitleBook() +"    "+ foundBook.getAuthorBook()+"    "+foundBook.getIsbnBook()+"    "+ foundBook.getYearBook());
                        System.out.println("/------------------------------------------------------------------------------------------/");
                    } else {
                        System.out.println("/------------------------------------------------------------------------------------------/");
                        System.out.println("Книга не знайдена.");
                        System.out.println("/------------------------------------------------------------------------------------------/");
                    }
                    break;

                case 4:
                    // Видалення книги за ISBN
                    System.out.print("Введіть номер ISBN: ");
                    scanner.nextLine();
                    String removeISBN = scanner.nextLine();
                    library.removeBookISBN(removeISBN);
                    System.out.println("/------------------------------------------------------------------------------------------/");
                    System.out.println("Книгу видалено.");
                    System.out.println("/------------------------------------------------------------------------------------------/");
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Спробуйте ввести інший номер пункту.");
                    break;
            }
        } while (menuItem != 0);

        scanner.close();


    }
}