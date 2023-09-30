package hu.progmatic.relationship_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.factory.support.AbstractBeanDefinitionReader;
@Entity
public class Address {
    @Id
     private Long id;
    private String country;
    private String zip;
    private String city;
    private String street;

    public Address(){

    }

    public Address(Long id, String country, String zip, String city, String street) {
        this.id = id;
        this.country = country;
        this.zip = zip;
        this.city = city;
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
