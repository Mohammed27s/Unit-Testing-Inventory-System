package com.Inventory.System.notifications.TRA.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "invoice") //This is is Invoice Table
public class Invoice extends BaseEntity {

    String invoiceNumber;
    Date invoiceDate;
    Date dueDate;
    Double PaidAmount;
    String MoneyCurrency;
    @Enumerated(EnumType.STRING)
    PaymentMethod paymentMethod;
    @OneToMany
    List<Product> products; //This store all the exiting products
    Double totalAmount;


}
