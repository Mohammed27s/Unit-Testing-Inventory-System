package com.Inventory.System.notifications.TRA.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

//This is for sending notification to the customer
@Data
@Entity
@Table(name = "notification") //This is Notification Table
public class Notification extends BaseEntity{

    String subject;
    String message;
    String recipient;
    Status status;// This is an Enum
    Type type; //This is an Enum


}
