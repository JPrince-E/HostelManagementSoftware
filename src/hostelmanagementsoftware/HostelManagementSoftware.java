/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostelmanagementsoftware;

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Prince E
 */
public class HostelManagementSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
    Connection con = ConnectionProvider.getCon();
    Statement st = con.createStatement();
    //String q1="create table users(name varchar(100),email varchar(100)primary key,mobileNumber bigint,securityQuestion varchar(200),answer varchar(200),password varchar(100),address varchar(500),city varchar(100),state varchar(100),country varchar(100))";
    //String q2="create table product(id int,name varchar(500),category varchar(200),price int,active varchar(10))";
    //String q3="create table cart(email varchar(100),product_id int,qantity int,price int,total int,address varchar(500),city varchar(100),state varchar(100),country varchar(100),mobileNumber bigint,orderDate varchar(100),deliveryDate varchar(100),paymentMethod varchar(100),transactionId varchar(100),status varchar(10))";
    //String q1="create table room(number varchar(30),activate varchar(10),roomstatus varchar(20))";
    //String q1="create table newstudent(mobileNumber varchar(30), name varchar(50), fathername varchar(50), mothername varchar(50), email varchar(50), address varchar(100), college varchar(50), uniqueID varchar(25), roomnumber varchar(20), roomstatus varchar(10))";
    //String q1="create table fees(mobileNo varchar(30), month varchar(50), amount varchar(50))";
    //String q1="create table employee(mobileNo varchar(30)primary key, name varchar(200), father varchar(200), mother varchar(200), email varchar(200), address varchar(200), uniqueID varchar(20), designation varchar(100),status varchar(50))";
    String q1="create table payment(mobileNo varchar(30),month varchar(50),amount varchar(50))";
    System.out.println(q1);
    st.execute(q1);
    System.out.print("Table Created");
    con.close();
    
}catch(Exception e){
    System.out.print(e);
}
    
    }
    
}
