package com.example;

import lombok.ToString;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kelvin.johnson on 1/28/2016.
 */
@ToString
public class Row {

    private String lastName;
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    private String firstName;
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    private String gender;
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    private String favoriteColor;
    public String getFavoriteColor() { return favoriteColor; }
    public void setFavoriteColor(String favoriteColor) { this.favoriteColor = favoriteColor; }

    private Date dob;
    public Date getDob() { return dob; }
    public void setDob(Date dob) { this.dob = dob; }
    public void setDob(String dob) throws RuntimeException {
        SimpleDateFormat formatter = new SimpleDateFormat("mm-dd-yyyy");
        try {
            Date date = formatter.parse(dob);
            this.dob = date;
        }
        catch(java.text.ParseException e)
        {
            throw new RuntimeException(e);
        }
    }


}
