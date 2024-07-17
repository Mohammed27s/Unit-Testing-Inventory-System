package com.Inventory.System.notifications.TRA.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "user") //This is User Table
public class User extends BaseEntity{

    String name;
    @Enumerated(EnumType.STRING)
    UserTypes userTypes; //This is Enum
    @OneToOne
    ContactDetails contactDetails;
    AccessPrivileges accessPrivileges; //This is an Enum

}
