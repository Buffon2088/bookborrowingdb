package bookborrowingdb.service;

import bookborrowingdb.pojo.BookTypeInfo;

import java.util.List;

public interface IBookTypeService {

     List<BookTypeInfo> findAll();
     BookTypeInfo findBookType(BookTypeInfo bookTypeInfo);
     boolean addBookType(BookTypeInfo bookTypeInfo);
     boolean updateBookType(BookTypeInfo bookTypeInfo);
     boolean deleteBookType(BookTypeInfo bookTypeInfo);
}
