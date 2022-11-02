package bookborrowingdb.pojo;

public class UserTypeInfo {
    private int userTypeId;
    private String userTypeName;
    private int userMaxTime;
    private int userMaxNum;
    private String userState;

    public UserTypeInfo(int userTypeId, String userTypeName, int userMaxTime, int userMaxNum, String userState) {
        this.userTypeId = userTypeId;
        this.userTypeName = userTypeName;
        this.userMaxTime = userMaxTime;
        this.userMaxNum = userMaxNum;
        this.userState = userState;
    }

    public UserTypeInfo() {
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public int getUserMaxTime() {
        return userMaxTime;
    }

    public void setUserMaxTime(int userMaxTime) {
        this.userMaxTime = userMaxTime;
    }

    public int getUserMaxNum() {
        return userMaxNum;
    }

    public void setUserMaxNum(int userMaxNum) {
        this.userMaxNum = userMaxNum;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
