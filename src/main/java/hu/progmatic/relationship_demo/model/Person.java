package hu.progmatic.relationship_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

    @Id
    Long id;
    String name;
    @OneToOne
    @JoinColumn(name = "address_id")
    Address address;

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAddress() {
        return address.getId();
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
