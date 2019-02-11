package metube.domain.models.binding;

public class TubeUploadBindingModel {
    private String title;
    private String author;
    private String youtubeLink;
    private String description;
    private String uploader;

    public TubeUploadBindingModel() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYoutubeLink() {
        return this.youtubeLink;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUploader() {
        return this.uploader;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }
}
