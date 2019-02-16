package fdmc.domain.models.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CatServiceModel {
    private String id;
    private String name;
    private String breed;
    private String color;
    private Integer age;
    private String gender;
    private BigDecimal price;
    private LocalDate addedOn;
    private boolean hasPassport;

    public CatServiceModel() {
    }

    public String getId() {
        return this.id;
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

    public Integer getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public LocalDate getAddedOn() {
        return this.addedOn;
    }

    public boolean isHasPassport() {
        return this.hasPassport;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setAddedOn(LocalDate addedOn) {
        this.addedOn = addedOn;
    }

    public void setHasPassport(boolean hasPassport) {
        this.hasPassport = hasPassport;
    }
}
