package bookborrowingdb.pojo;

public class BookTypeInfo {
      private int bookTypeId;
      private String bookTypeName;
      private String bookTypeState;

    public BookTypeInfo(int bookTypeId, String bookTypeName, String bookTypeState) {
        this.bookTypeId = bookTypeId;
        this.bookTypeName = bookTypeName;
        this.bookTypeState = bookTypeState;
    }

    public BookTypeInfo() {
    }

    public int getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(int bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public String getBookTypeState() {
        return bookTypeState;
    }

    public void setBookTypeState(String bookTypeState) {
        this.bookTypeState = bookTypeState;
    }
}
