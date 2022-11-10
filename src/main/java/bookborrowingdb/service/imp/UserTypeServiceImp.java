package bookborrowingdb.service.imp;

import bookborrowingdb.dao.UserTypeDao;
import bookborrowingdb.pojo.UserTypeInfo;
import bookborrowingdb.service.IUserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserTypeServiceImp implements IUserTypeService {

    @Autowired
    private UserTypeDao userTypeDao;


    @Override
    public List<UserTypeInfo> findAll() {
        return userTypeDao.findAll();
    }

    @Override
    public UserTypeInfo findUserType(UserTypeInfo userTypeInfo) {
        return userTypeDao.findUserType(userTypeInfo);
    }

    @Override
    public boolean addUserType(UserTypeInfo userTypeInfo) {
        return userTypeDao.addUserType(userTypeInfo)>0;
    }

    @Override
    public boolean updateUserType(UserTypeInfo userTypeInfo) {
        return userTypeDao.updateUserType(userTypeInfo)>0;
    }

    @Override
    public boolean deleteUserType(UserTypeInfo userTypeInfo) {
        return userTypeDao.deleteUserType(userTypeInfo)>0;
    }
}
