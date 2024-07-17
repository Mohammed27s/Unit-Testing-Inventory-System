package com.Inventory.System.notifications.TRA.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "product_details") //This is ProductDetails Table
public class ProductDetails extends BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productID;
    String name;
    String brandName;

    @Temporal(TemporalType.DATE)
    Date expiredate;
    String size;
    String color;
    String description; // This is explaining what the product is for
    Double price;
    String countryMade; // This is for the country where the product was created

}
