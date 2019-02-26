package app.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;
    private String password;
    private String email;

    public User() {
    }

    @Column(name = "username")
    public String getUsername() {
        return this.username;
    }

    @Column(name = "password")
    public String getPassword() {
        return this.password;
    }

    @Column(name = "email")
    public String getEmail() {
        return this.email;
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
}
