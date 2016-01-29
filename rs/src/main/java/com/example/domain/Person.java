package com.example.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kelvin.johnson on 1/28/2016.
 */
@Entity
@ToString
@Table(name = "Person")
@EqualsAndHashCode
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    public Long getId() { return id; }

    @Column
    private String lastName;
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Column
    private String firstName;
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    @Column
    private String gender;
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    @Column
    private String favoriteColor;
    public String getFavoriteColor() { return favoriteColor; }
    public void setFavoriteColor(String favoriteColor) { this.favoriteColor = favoriteColor; }

    @Column
    @Type(type="date")
    private Date dob;
    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }
}
