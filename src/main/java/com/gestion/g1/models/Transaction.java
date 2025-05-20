package com.gestion.g1.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "object_id")
    private Objet rentedObject;

    @ManyToOne
    @JoinColumn(name = "renter_id")
    private User renter;

    private LocalDate rentStartDate;
    private LocalDate rentEndDate;

    private boolean returned;

    public Transaction() {}

    public Transaction(Objet rentedObject, User renter, LocalDate rentStartDate, LocalDate rentEndDate) {
        this.rentedObject = rentedObject;
        this.renter = renter;
        this.rentStartDate = rentStartDate;
        this.rentEndDate = rentEndDate;
        this.returned = false;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Objet getRentedObject() {
        return rentedObject;
    }

    public void setRentedObject(Objet rentedObject) {
        this.rentedObject = rentedObject;
    }

    public User getRenter() {
        return renter;
    }

    public void setRenter(User renter) {
        this.renter = renter;
    }

    public LocalDate getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public LocalDate getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }
}
