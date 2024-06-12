package com.pluralsight.db;

import com.pluralsight.models.Product;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    //attribute for data source
    private DataSource dataSource;


    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //method to return all products
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        String productsQuery = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";

        //get the connection
        try (Connection connection = dataSource.getConnection();
             //prepared statement
             PreparedStatement preparedStatement = connection.prepareStatement(productsQuery);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int productID = resultSet.getInt(1);
                String productName = resultSet.getString(2);
                double unitPrice = resultSet.getDouble(3);
                int unitsInStock = resultSet.getInt(4);

                Product product = new Product(productID, productName, unitPrice, unitsInStock);
                products.add(product);
            }
        } catch (Exception ex) {
            System.out.println("error has occurred");
            ex.printStackTrace();
        }

        return products;
    }

    public Product getProductById (int productId){
        String productByIdQuery = " SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products WHERE ProductID = ? ";
        Product product = null;

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(productByIdQuery)
        ){
            preparedStatement.setInt(1,productId);

            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if (resultSet.next()){
                    int productID = resultSet.getInt(1);
                    String productName = resultSet.getString(2);
                    double unitPrice = resultSet.getDouble(3);
                    int unitsInStock = resultSet.getInt(4);

                    product = new Product(productID,productName,unitPrice,unitsInStock);
                }else{
                    System.out.println("Product not found");
                }
            }

            }catch (Exception ex) {
            System.out.println("error occurred");
            ex.printStackTrace();

        }

        return product;
    }
}









