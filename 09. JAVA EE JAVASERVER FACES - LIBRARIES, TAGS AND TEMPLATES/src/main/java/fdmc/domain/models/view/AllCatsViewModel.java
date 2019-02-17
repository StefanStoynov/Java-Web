package fdmc.domain.models.view;

import java.math.BigDecimal;
import java.util.Date;

public class AllCatsViewModel {

    private String name;
    private String breed;
    private String color;
    private String gender;
    private BigDecimal price;
    private Date addedOn;

    public AllCatsViewModel() {
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getColor() {
        return this.color;
    }

    public String getGender() {
        return this.gender;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Date getAddedOn() {
        return this.addedOn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }
}
