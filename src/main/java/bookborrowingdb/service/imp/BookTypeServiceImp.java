package bookborrowingdb.service.imp;

import bookborrowingdb.dao.BookTypeDao;
import bookborrowingdb.pojo.BookTypeInfo;
import bookborrowingdb.service.IBookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class BookTypeServiceImp implements IBookTypeService {

    @Autowired
    private BookTypeDao bookTypeDao;


    @Override
    public List<BookTypeInfo> findAll() {
        return bookTypeDao.findAll();
    }

    @Override
    public BookTypeInfo findBookType(BookTypeInfo bookTypeInfo) {
        return bookTypeDao.findBookType(bookTypeInfo);
    }

    @Override
    public boolean addBookType(BookTypeInfo bookTypeInfo) {
        return bookTypeDao.addBookType(bookTypeInfo)>0;
    }

    @Override
    public boolean updateBookType(BookTypeInfo bookTypeInfo) {
        return bookTypeDao.updateBookType(bookTypeInfo)>0;
    }

    @Override
    public boolean deleteBookType(BookTypeInfo bookTypeInfo) {
        return bookTypeDao.deleteBookType(bookTypeInfo)>0;
    }
}

