package Application;

import java.sql.Connection;
import db.DB;
import entities.Department;

public class application {

    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        System.out.println(obj);
    }
}