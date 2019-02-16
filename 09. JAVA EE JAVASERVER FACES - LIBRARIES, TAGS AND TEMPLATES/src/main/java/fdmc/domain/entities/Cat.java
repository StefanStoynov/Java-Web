package fdmc.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "cats")
public class Cat extends BaseEntity {

    private String name;
    private String breed;
    private String color;
    private Integer age;
    private String gender;
    private BigDecimal price;
    private LocalDate addedOn;
    private boolean hasPassport;

    public Cat() {
    }

    @Column(name = "name")
    @Size(min = 2, max = 10)
    public String getName() {
        return this.name;
    }

    @Column(name = "breed")
    @Size(min = 5, max = 20)
    public String getBreed() {
        return this.breed;
    }

    @Column(name = "color")
    public String getColor() {
        return this.color;
    }

    @Column(name = "age")
    @Min(1)
    @Max(31)
    public Integer getAge() {
        return this.age;
    }

    @Column(name = "gender")
    public String getGender() {
        return this.gender;
    }

    @Column(name = "price")
    @DecimalMin("0.01")
    public BigDecimal getPrice() {
        return this.price;
    }

    @Column(name = "added_on")
    public LocalDate getAddedOn() {
        return this.addedOn;
    }

    @Column(name = "has_passport")
    public boolean isHasPassport() {
        return this.hasPassport;
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
