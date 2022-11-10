package bookborrowingdb.service;

import bookborrowingdb.pojo.UserTypeInfo;

import java.util.List;

public interface IUserTypeService {

    List<UserTypeInfo> findAll();
    UserTypeInfo findUserType(UserTypeInfo userTypeInfo);
    boolean addUserType(UserTypeInfo userTypeInfo);
    boolean updateUserType(UserTypeInfo userTypeInfo);
    boolean deleteUserType(UserTypeInfo userTypeInfo);
}
