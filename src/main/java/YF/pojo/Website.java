package YF.pojo;


import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class Website {
    private int articleNumber;
    private Date life;
    private int accessNumber;

    public Website() {
    }

    public Website(int articleNumber, Date life, int accessNumber) {
        this.articleNumber = articleNumber;
        this.life = life;
        this.accessNumber = accessNumber;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Date getLife() {
        return life;
    }

    public void setLife(Date life) {
        this.life = life;
    }

    public int getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(int accessNumber) {
        this.accessNumber = accessNumber;
    }

    @Override
    public String toString() {
        return "Website{" +
                "articleNumber=" + articleNumber +
                ", life=" + life +
                ", accessNumber=" + accessNumber +
                '}';
    }
}
