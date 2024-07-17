package com.Inventory.System.notifications.TRA.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

//This is store contact Information for all class that has contact info
@Entity
@Data
@Table(name = "contact_details") //This is the ContactDetails Table
public class ContactDetails extends BaseEntity{


    String email;
    String phoneNumber;
    String faxNumber;
    String address;
    String postalCode;


}
