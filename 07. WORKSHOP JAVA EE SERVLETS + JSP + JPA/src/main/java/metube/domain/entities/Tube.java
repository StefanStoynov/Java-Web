package metube.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tubes")
public class Tube extends BaseEntity{

    private String title;
    private String author;
    private String description;
    private String youTubeId;
    private int views;
    private User uploader;

    public Tube() {
    }
    @Column(name = "title", nullable = false)
    public String getTitle() {
        return this.title;
    }
    @Column(name = "author", nullable = false)
    public String getAuthor() {
        return this.author;
    }
    @Column(name = "description", nullable = false)
    public String getDescription() {
        return this.description;
    }
    @Column(name = "you_tube_id", nullable = false)
    public String getYouTubeId() {
        return this.youTubeId;
    }

    @Column(name = "views")
    public int getViews() {
        return this.views;
    }
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "uploader", referencedColumnName = "id")
    public User getUploader() {
        return this.uploader;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYouTubeId(String youTubeId) {
        this.youTubeId = youTubeId;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setUploader(User uploader) {
        this.uploader = uploader;
    }
}
