package com.supraja.mvc;

import com.supraja.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;
import org.springframework.beans.factory.annotation.Value;

public class Customer {
    private String firstName;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @NotNull(message = "is required")
    @Size(min=1, message = "minimum size is 1")
    private String lastName;

    @Pattern(regexp="^[a-zA-Z0-9]{5}", message = "Only 5 letters or digits")
    private String postalCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @CourseCode(value="LUV", message = "Course code should start with LUV")
    public String courseCode;

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
    @Min(value=0,message = "value should be greater than or equal to 0")
    @Max(value=10, message = "value should not be greater than 10")
    @NotNull
    private Integer freePasses;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
