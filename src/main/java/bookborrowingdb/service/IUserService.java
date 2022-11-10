package bookborrowingdb.service;

import bookborrowingdb.pojo.UserInfo;

import java.util.List;

public interface IUserService {

    boolean userLogin(UserInfo userInfo);
    List<UserInfo> findAll();
    UserInfo findUser(UserInfo userInfo);
    boolean addUser(UserInfo userInfo);
    boolean updateUser(UserInfo userInfo);
    boolean deleteUser(UserInfo userInfo);

}
