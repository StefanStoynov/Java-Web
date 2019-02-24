package app.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity()
@Table(name ="documents")
public class Document extends BaseEntity{

    private String title;
    private String content;

    public Document() {
    }

    @Column(name = "title")
    public String getTitle() {
        return this.title;
    }

    @Column(name = "content" , columnDefinition = "text")
    public String getContent() {
        return this.content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
