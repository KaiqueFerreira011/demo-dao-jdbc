package Application;

import java.sql.Connection;
import db.DB;
import entities.Department;
import entities.Seller;
import java.util.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class application {

    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        
        System.out.println(seller);
    }
}