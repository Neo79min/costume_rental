package com.example.costume_rental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tblCashier")
@Getter
@Setter
public class Cashier extends User {
    String username;
    String password;
}
