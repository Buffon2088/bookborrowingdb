package bookborrowingdb.dao;

import bookborrowingdb.pojo.UserTypeInfo;

import java.util.List;

public interface UserTypeDao {

    List<UserTypeInfo> findAll();
    UserTypeInfo findUserType(UserTypeInfo userTypeInfo);
    int addUserType(UserTypeInfo userTypeInfo);
    int updateUserType(UserTypeInfo userTypeInfo);
    int deleteUserType(UserTypeInfo userTypeInfo);
}
