package metube.domain.models.service;

public class TubeServiceModel {
    private String id;
    private String title;
    private String author;
    private String description;
    private String youTubeId;
    private int views;
    private UserServiceModel uploader;

    public TubeServiceModel() {
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getDescription() {
        return this.description;
    }

    public String getYouTubeId() {
        return this.youTubeId;
    }

    public int getViews() {
        return this.views;
    }

    public UserServiceModel getUploader() {
        return this.uploader;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setUploader(UserServiceModel uploader) {
        this.uploader = uploader;
    }
}
