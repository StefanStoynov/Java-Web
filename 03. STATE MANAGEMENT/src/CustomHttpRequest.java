import java.util.ArrayList;
import java.util.List;

public class CustomHttpRequest {
    private String request;
    private String path;
    private String date;
    private String host;
    private String contentType;
    private List<Cookie> cookie;
    private List<Body> body;

    public CustomHttpRequest() {
        this.body = new ArrayList<>();
        this.cookie = new ArrayList<>();
    }

    public String getRequest() {
        return this.request;
    }

    public String getPath() {
        return this.path;
    }

    public String getDate() {
        return this.date;
    }

    public String getHost() {
        return this.host;
    }

    public String getContentType() {
        return this.contentType;
    }

    public List<Cookie> getCookie() {
        return this.cookie;
    }

    public List<Body> getBody() {
        return this.body;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setCookie(List<Cookie> cookie) {
        this.cookie = cookie;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }
}
