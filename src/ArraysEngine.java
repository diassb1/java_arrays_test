public class ArraysEngine {

    // TODO: метод должен вывести все книги массива, проигнорировать пустые места
    // Книги
    // - <название_книги>: <автор> <кол-во страниц> стр
    public void printAllBooks(Book[] books) {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            System.out.println(book);
        }

    }


    // TODO: метод должен посчитать фактическое кол-во книг, не учитывать null
    public int getActualSize(Book[] books) {
        int sum = 0;
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            sum++;
        }
        return sum;
    }


    // TODO: метод должен посчитать общее количество страниц всех книг массива
    public int countTotalPages(Book[] books) {
        int allPage = 0;
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            allPage += book.pages;
        }
        return allPage;
    }


    // TODO: метод должен возвращать объект книги из массива по переданному название
    public Book findBookByTitle(Book[] books, String title) {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }


    // TODO: метод должен возвращать массив строк, которая состоит только из названия книг
    public String[] getBookTitles(Book[] books) {
        String[] allBookTiTle = new String[6];
        int a = 0;
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            allBookTiTle[a++] = book.title;

        }
        return allBookTiTle;
    }


  //  TODO:  метод должен    находить книгу    с самой    наибольшей страницей

    public Book findLargestBook(Book[] books) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null){
                continue;
            }
            if (a < books[i].pages){
                a = books[i].pages;
                b = i;
            }

        }
        return books[b];
    }
}