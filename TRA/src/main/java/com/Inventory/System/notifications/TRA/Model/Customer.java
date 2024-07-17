package com.Inventory.System.notifications.TRA.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "customer") //This is Customer Table
public class Customer extends BaseEntity {


    String customerFullName;
    @OneToOne
    ContactDetails contactDetails; //This is has all contact information for the customer
    Integer age;
    String Nationality;
    String customerType; // This is  individual, corporate
    String Country;

}
