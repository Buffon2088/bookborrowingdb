package bookborrowingdb.pojo;

public class BookInfo {
    private int bookId;
    private String bookName;
    private String bookImg;
    private int bookNum;
    private String bookPress;
    private int bookTime;
    private String bookState;
    private BookTypeInfo bookTypeInfo;

    public BookInfo(int bookId, String bookName, String bookImg, int bookNum, String bookPress, int bookTime, String bookState, BookTypeInfo bookTypeInfo) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookImg = bookImg;
        this.bookNum = bookNum;
        this.bookPress = bookPress;
        this.bookTime = bookTime;
        this.bookState = bookState;
        this.bookTypeInfo = bookTypeInfo;
    }

    public BookInfo() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }

    public int getBookTime() {
        return bookTime;
    }

    public void setBookTime(int bookTime) {
        this.bookTime = bookTime;
    }

    public String getBookState() {
        return bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState;
    }

    public BookTypeInfo getBookTypeInfo() {
        return bookTypeInfo;
    }

    public void setBookTypeInfo(BookTypeInfo bookTypeInfo) {
        this.bookTypeInfo = bookTypeInfo;
    }
}
