package com.Inventory.System.notifications.TRA.Model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "product") //This is Product Table
public class Product extends BaseEntity {


    Integer quantity;
    String category;
    UUID sku; //This is the id for product
    @OneToOne
    ProductDetails productDetails; //This for each product it will have it own description

}
