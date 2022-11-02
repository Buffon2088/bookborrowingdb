package bookborrowingdb.dao;

import bookborrowingdb.pojo.BookTypeInfo;

import java.util.List;

public interface BookTypeDao {

    List<BookTypeInfo> findAll();
    BookTypeInfo findBookType(BookTypeInfo bookTypeInfo);
    int addBookType(BookTypeInfo bookTypeInfo);
    int updateBookType(BookTypeInfo bookTypeInfo);
    int deleteBookType(BookTypeInfo bookTypeInfo);
}
