package fdmc.domain.models.binding;

import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class CatCreateBindingModel {
    private String name;
    private String breed;
    private String color;
    private Integer age;
    private String gender;
    private BigDecimal price;
    private Date addedOn;
    private boolean hasPassport;

    public CatCreateBindingModel() {
    }
    @Size(min = 2, max = 10)
    public String getName() {
        return this.name;
    }
    @Size(min = 5, max = 20)
    public String getBreed() {
        return this.breed;
    }

    public String getColor() {
        return this.color;
    }
    @Min(1)
    @Max(31)
    public Integer getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }
    @DecimalMin("0.01")
    public BigDecimal getPrice() {
        return this.price;
    }

    public Date getAddedOn() {
        return this.addedOn;
    }

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

    public void setAddedOn(Date addedOn) {
        this.addedOn = addedOn;
    }

    public void setHasPassport(boolean hasPassport) {
        this.hasPassport = hasPassport;
    }
}
