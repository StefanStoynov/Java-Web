package metube.domain.models.view;

public class TubeDetailsViewModel {
    private String name;
    private String description;
    private String youTubeLink;
    private String uploader;

    public TubeDetailsViewModel() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getYouTubeLink() {
        return this.youTubeLink;
    }

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
