package com.Inventory.System.notifications.TRA.Repository;

import com.Inventory.System.notifications.TRA.Model.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;


//This is for saving product information in DataBase
public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Integer> {

    /*
    @Query("SELECT p FROM ProductDetails p WHERE p.id = :productId") //ProductId
    ProductDetails getByProductId(@Param("productId") Integer productId);

    @Query("SELECT n FROM ProductDetails n WHERE n.name = :name") //ProductName
    ProductDetails getByProductName(@Param("name") String name);

    @Query("SELECT b FROM ProductDetails b WHERE b.brandName = :brandName") //BrandName
    ProductDetails getByProductBrandName(@Param("brandName") String brandName);

    @Query("SELECT e FROM ProductDetails e WHERE e.expireDate = :expireDate") //ExpireDate
    ProductDetails getByProductExpireDate(@Param("expireDate") Date expireDate);

    @Query("SELECT s FROM ProductDetails s WHERE s.size = :size") //size
    ProductDetails getByProductSize(@Param("size") String size);

    @Query("SELECT c FROM ProductDetails c WHERE c.color = :color") //color
    ProductDetails getByProductColor(@Param("color") String color);

    @Query("SELECT d FROM ProductDetails d WHERE d.description = :description") //description
    ProductDetails getByProductDescription(@Param("description") String description);

    @Query("SELECT p FROM ProductDetails p WHERE p.price = :price") //price
    ProductDetails getByProductPrice(@Param("price") Double price);

    @Query("SELECT co FROM ProductDetails co WHERE co.countryMade = :countryMade") //countryMade
    ProductDetails getByProductCountryMade(@Param("countryMade") String countryMade);


*/

}
