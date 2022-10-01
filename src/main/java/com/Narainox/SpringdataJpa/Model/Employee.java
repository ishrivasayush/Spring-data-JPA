package com.Narainox.SpringdataJpa.Model;
import javax.persistence.*;

@Entity(name = "Employee")
public class Employee {

    @Id
    @SequenceGenerator(
            name = "Employee_Sequence",
            sequenceName = "Employee_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Employee_Sequence"
    )
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String fName;
    @Column(name="lastName")
    private String lName;
    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "age")
    private Integer age;
    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
