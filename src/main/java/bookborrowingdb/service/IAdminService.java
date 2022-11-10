package bookborrowingdb.service;

import bookborrowingdb.pojo.AdminInfo;

import java.util.List;

public interface IAdminService {

    boolean adminLogin(AdminInfo adminInfo);
    List<AdminInfo> findAll();
    AdminInfo findAdminByLoginName(AdminInfo adminInfo);
    AdminInfo findAdminById(AdminInfo adminInfo);
    boolean addAdmin(AdminInfo adminInfo);
    boolean updateAdmin(AdminInfo adminInfo);
    boolean deleteAdmin(AdminInfo adminInfo);
}
