package Application;

import java.sql.Connection;
import db.DB;
import entities.Department;
import entities.Seller;
import java.util.Date;

public class application {

    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
        
        System.out.println(seller);
    }
}