package metube.domain.models.binding;

public class TubeCreateBindingModel {
    private String name;
    private String description;
    private String youTubeLink;
    private String uploader;

    public TubeCreateBindingModel() {
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
