/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Danac
 */
public class parma {
    private Statement st;

    public void insertRegis(String fName, String lName, String email, String address1, String province, int postelCode, String password, int phone, String note) {
        String sql="INSERT INTO registration(fName,lName,email,address,province,postelCode,password,phone,notes)VALUES ('"+fName+"' , '"+lName+"', '"+email+"', '"+address1+"', '"+province+"', '"+postelCode+"', '"+password+"', '"+phone+"', '"+note+"')";
       connectToDB();
         try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(parma.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    private void connectToDB() {
        String url="jdbc:mysql://localhost:3306/pharma";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","");
            st = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(parma.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void insertPharma(String fName, String lName, String email, String address1, String id, String city, String password, int phone, String note) {
         String sql="INSERT INTO pharmacist(fName,lName,email,address,id,city,password,phone,notes)VALUES ('"+fName+"' , '"+lName+"', '"+email+"', '"+address1+"', '"+id+"', '"+city+"', '"+password+"', '"+phone+"', '"+note+"')";
       connectToDB();
         try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(parma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertPharma(String name, String category, String company, int price, int quantity, String description) {
         String sql="INSERT INTO medicine(name,category,company,price,quantity,description)VALUES ('"+name+"' , '"+category+"', '"+company+"', '"+price+"', '"+quantity+"', '"+description+"')";
         connectToDB();
         try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(parma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertPharma(String img, String fName, String lName, String email, String address1, String province, String postelCode, String phone) {
     String sql="INSERT INTO customer(img,fName,lName,email,address,province,postalCode,phone)VALUES ('"+img+"','"+fName+"','"+lName+"','"+email+"','"+address1+"','"+province+"','"+postelCode+"','"+phone+"')" ;   
      connectToDB();
         try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(parma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertPharma(String name, String category, String fName, String lName, String email, String address1, String province, String postelCode, String phone) {
        String sql="INSERT INTO customerbook(name,category,fName,lName,email,address,province,postelCode,phone)VALUES('"+name+"','"+category+"','"+fName+"','"+lName+"','"+email+"','"+address1+"','"+province+"','"+postelCode+"','"+phone+"')";
         connectToDB();
         try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(parma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    

   


   
    

   
}
