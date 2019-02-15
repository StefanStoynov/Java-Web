package regapp.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity(name = "employees")
public class Employee extends BaseEntity{
    private String firstName;
    private String lastName;
    private String position;
    private BigDecimal salary;
    private Integer age;

    public Employee() {
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return this.firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return this.lastName;
    }

    @Column(name = "position")
    public String getPosition() {
        return this.position;
    }

    @Column(name = "salary")
    public BigDecimal getSalary() {
        return this.salary;
    }

    @Column(name = "age")
    public Integer getAge() {
        return this.age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
