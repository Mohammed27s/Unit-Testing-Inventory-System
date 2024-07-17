package com.Inventory.System.notifications.TRA.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "inventory") //This is Inventory Table
public class Inventory extends BaseEntity {

    @OneToMany
    List<Staff> staffDetails;
    ProductDetails productDetails;
    Double unitPrice;
    Integer quantityInStock;
    Integer thresholdForLowStockAlert;
    SupplierDetails supplierDetails;
    String location;
    @OneToMany
    List<Product> products;
    String ManagerName;
    String supplier;
    String phoneNumber;
    String openingHours;
    String closingHours;

}
