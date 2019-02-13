package metube.domain.models.view;

public class TubeDetailsViewModel {

    private String title;
    private String author;
    private String description;
    private String youtubeId;
    private int views;

    public TubeDetailsViewModel() {
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
        return this.youtubeId;
    }

    public int getViews() {
        return this.views;
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
        this.youtubeId = youTubeId;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
