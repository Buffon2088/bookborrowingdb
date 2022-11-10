package bookborrowingdb.dao;

import bookborrowingdb.pojo.BookInfo;

import java.util.List;

public interface BookDao {

    List<BookInfo> findAll();
    BookInfo findBook(BookInfo bookInfo);
    int addBook(BookInfo bookInfo);
    int updateBook(BookInfo bookInfo);
    int deleteBook(BookInfo bookInfo);

    BookInfo findBookByType(BookInfo bookInfo);

}
