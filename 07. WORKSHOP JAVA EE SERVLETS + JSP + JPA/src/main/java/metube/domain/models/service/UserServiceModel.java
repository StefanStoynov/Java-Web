package metube.domain.models.service;

import java.util.List;

public class UserServiceModel {

    private String id;
    private String username;
    private String password;
    private String email;
    private List<TubeServiceModel> tubes;

    public UserServiceModel() {
    }

    public String getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public List<TubeServiceModel> getTubes() {
        return this.tubes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTubes(List<TubeServiceModel> tubes) {
        this.tubes = tubes;
    }
}
