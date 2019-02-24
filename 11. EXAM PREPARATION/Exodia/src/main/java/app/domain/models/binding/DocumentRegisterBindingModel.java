package app.domain.models.binding;

public class DocumentRegisterBindingModel {

    private String title;
    private String content;

    public DocumentRegisterBindingModel() {
    }

    public String getTitle() {
        return this.title;
    }

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
