package com.gestion.g1.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password; // ideally hashed

    @OneToMany(mappedBy = "owner")
    private List<Objet> ownedObjects;

    @OneToMany(mappedBy = "renter")
    private List<Transaction> rentedTransactions;

    private String role = "USER";

    public User() {}

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Objet> getOwnedObjects() {
        return ownedObjects;
    }

    public void setOwnedObjects(List<Objet> ownedObjects) {
        this.ownedObjects = ownedObjects;
    }

    public List<Transaction> getRentedTransactions() {
        return rentedTransactions;
    }

    public void setRentedTransactions(List<Transaction> rentedTransactions) {
        this.rentedTransactions = rentedTransactions;
    }
}
