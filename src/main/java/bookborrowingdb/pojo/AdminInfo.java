package bookborrowingdb.pojo;

public class AdminInfo {
    private int adminId;
    private String adminName;
    private String adminLoginName;
    private String adminLoginPwd;
    private String adminState;
    private String adminImg;
    private String adminKey;
    private String adminEmail;

    public AdminInfo() {
    }

    public AdminInfo(int adminId, String adminName, String adminLoginName, String adminLoginPwd, String adminState, String adminImg, String adminKey, String adminEmail) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminLoginName = adminLoginName;
        this.adminLoginPwd = adminLoginPwd;
        this.adminState = adminState;
        this.adminImg = adminImg;
        this.adminKey = adminKey;
        this.adminEmail = adminEmail;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminLoginName() {
        return adminLoginName;
    }

    public void setAdminLoginName(String adminLoginName) {
        this.adminLoginName = adminLoginName;
    }

    public String getAdminLoginPwd() {
        return adminLoginPwd;
    }

    public void setAdminLoginPwd(String adminLoginPwd) {
        this.adminLoginPwd = adminLoginPwd;
    }

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }

    public String getAdminImg() {
        return adminImg;
    }

    public void setAdminImg(String adminImg) {
        this.adminImg = adminImg;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }
}
