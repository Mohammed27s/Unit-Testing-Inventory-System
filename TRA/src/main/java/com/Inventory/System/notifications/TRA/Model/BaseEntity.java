package com.Inventory.System.notifications.TRA.Model;

//The BaseEntity class for just adding additional information for other classes
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Integer id;
    @CreatedDate
    Date createdDate;
    @UpdateTimestamp
    Date updatedDate;
    Boolean isActive;
}