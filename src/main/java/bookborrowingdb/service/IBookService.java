package bookborrowingdb.service;

import bookborrowingdb.pojo.BookInfo;

import java.util.List;

public interface IBookService {

    List<BookInfo> findAllBook();
    BookInfo findBook(BookInfo bookInfo);
    boolean addBook(BookInfo bookInfo);
    boolean updateBook(BookInfo bookInfo);
    boolean deleteBook(BookInfo bookInfo);

}
