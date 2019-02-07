package metube.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "tubes")
public class Tube extends BaseEntity {

    private String name;
    private String description;
    private String youTubeLink;
    private String uploader;

    public Tube() {
    }

    @Column(name = "name")
    public String getName() {
        return this.name;
    }

    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }

    @Column(name = "you_tube_link")
    public String getYouTubeLink() {
        return this.youTubeLink;
    }

    @Column(name = "uploader")
    public String getUploader() {
        return this.uploader;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYouTubeLink(String youTubeLink) {
        this.youTubeLink = youTubeLink;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }
}
