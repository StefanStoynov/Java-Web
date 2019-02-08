package metube.domain.models.service;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class TubeServiceModel {
    private String id;
    private String name;
    private String description;
    private String youTubeLink;
    private String uploader;

    public TubeServiceModel() {
    }

    public String getId() {
        return this.id;
    }
    @NotNull
    public String getName() {
        return this.name;
    }
    @NotNull
    public String getDescription() {
        return this.description;
    }
    @Pattern(regexp = "https:\\/\\/www\\.youtube\\.com\\/watch\\?v=[A-Za-z0-9]{11}")
    public String getYouTubeLink() {
        return this.youTubeLink;
    }
    @NotNull
    @Size(min = 2)
    public String getUploader() {
        return this.uploader;
    }

    public void setId(String id) {
        this.id = id;
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
