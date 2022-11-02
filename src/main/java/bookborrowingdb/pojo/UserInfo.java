package bookborrowingdb.pojo;


public class UserInfo {
    private int userId;
    private String userName;
    private String userLoginName;
    private String userLoginPwd;
    private String userImg;
    private int userGold;
    private int userTime;
    private String userEmail;
    private String userTel;
    private String userKey;
    private String userState;
    private UserTypeInfo userTypeInfo;

    public UserInfo(int userId, String userName, String userLoginName, String userLoginPwd, String userImg, int userGold, int userTime, String userEmail, String userTel, String userKey, String userState, UserTypeInfo userTypeInfo) {
        this.userId = userId;
        this.userName = userName;
        this.userLoginName = userLoginName;
        this.userLoginPwd = userLoginPwd;
        this.userImg = userImg;
        this.userGold = userGold;
        this.userTime = userTime;
        this.userEmail = userEmail;
        this.userTel = userTel;
        this.userKey = userKey;
        this.userState = userState;
        this.userTypeInfo = userTypeInfo;
    }

    public UserInfo() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserLoginPwd() {
        return userLoginPwd;
    }

    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public int getUserGold() {
        return userGold;
    }

    public void setUserGold(int userGold) {
        this.userGold = userGold;
    }

    public int getUserTime() {
        return userTime;
    }

    public void setUserTime(int userTime) {
        this.userTime = userTime;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public UserTypeInfo getUserTypeInfo() {
        return userTypeInfo;
    }

    public void setUserTypeInfo(UserTypeInfo userTypeInfo) {
        this.userTypeInfo = userTypeInfo;
    }
}
