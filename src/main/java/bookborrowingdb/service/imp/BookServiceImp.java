package bookborrowingdb.service.imp;

import bookborrowingdb.dao.BookDao;
import bookborrowingdb.pojo.BookInfo;
import bookborrowingdb.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImp implements IBookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public List<BookInfo> findAllBook() {
        return bookDao.findAll();
    }

    @Override
    public BookInfo findBook(BookInfo bookInfo) {
        return bookDao.findBook(bookInfo);
    }

    @Override
    public boolean addBook(BookInfo bookInfo) {
        return bookDao.addBook(bookInfo)>0;
    }

    @Override
    public boolean updateBook(BookInfo bookInfo) {
        return bookDao.updateBook(bookInfo)>0;
    }

    @Override
    public boolean deleteBook(BookInfo bookInfo) {
        return bookDao.deleteBook(bookInfo)>0;
    }
}
