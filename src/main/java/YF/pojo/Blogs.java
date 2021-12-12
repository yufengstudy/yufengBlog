package YF.pojo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
@Repository
public class Blogs {
    private String blogID;
    private String id;
    private String title;
    private String synopsis;
    private byte[] article;
    private int lookNumber;
    private int praisNumber;
    private int commentNumber;

    public Blogs(String blogID, String id, String title, String synopsis, byte[] article, int lookNumber, int praisNumber, int commentNumber) {
        this.blogID = blogID;
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.article = article;
        this.lookNumber = lookNumber;
        this.praisNumber = praisNumber;
        this.commentNumber = commentNumber;
    }

    public String getBlogID() {
        return blogID;
    }

    public void setBlogID(String blogID) {
        this.blogID = blogID;
    }

    public Blogs() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public byte[] getArticle() {
        return article;
    }

    public void setArticle(byte[] article) {
        this.article = article;
    }

    public int getLookNumber() {
        return lookNumber;
    }

    public void setLookNumber(int lookNumber) {
        this.lookNumber = lookNumber;
    }

    public int getPraisNumber() {
        return praisNumber;
    }

    public void setPraisNumber(int praisNumber) {
        this.praisNumber = praisNumber;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "blogID='" + blogID + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", article=" + Arrays.toString(article) +
                ", lookNumber=" + lookNumber +
                ", praisNumber=" + praisNumber +
                ", commentNumber=" + commentNumber +
                '}';
    }
}
