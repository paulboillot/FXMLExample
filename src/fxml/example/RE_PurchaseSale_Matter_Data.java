/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml.example;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Paul
 */
public class RE_PurchaseSale_Matter_Data 
{

    /*
    * Basic constructor in.
    */
    public RE_PurchaseSale_Matter_Data(SimpleIntegerProperty client_id_number, SimpleIntegerProperty matter_id_number, SimpleStringProperty title_company, SimpleStringProperty title_order_number, SimpleStringProperty client_last_name, SimpleStringProperty detached_or_condo, SimpleStringProperty property_street_address, SimpleStringProperty property_city, SimpleStringProperty property_state, SimpleStringProperty property_zipcode, SimpleStringProperty property_county, SimpleDateFormat contract_closing_date, SimpleBooleanProperty transaction_closed, SimpleBooleanProperty attorney_is_mario) {
        this.client_id_number = client_id_number;
        this.matter_id_number = matter_id_number;
        this.title_company = title_company;
        this.title_order_number = title_order_number;
        this.client_last_name = client_last_name;
        this.detached_or_condo = detached_or_condo;
        this.property_street_address = property_street_address;
        this.property_city = property_city;
        this.property_state = property_state;
        this.property_zipcode = property_zipcode;
        this.property_county = property_county;
        this.contract_closing_date = contract_closing_date;
        this.transaction_closed = transaction_closed;
        this.attorney_is_mario = attorney_is_mario;
    }
    
    public RE_PurchaseSale_Matter_Data(ResultSet rs) 
    {

        //TODO: Extract the relevant variables from an SQL result set.
        
        
        this.client_id_number = null;
        this.matter_id_number = null;
        this.title_company = null;
        this.title_order_number = null;
        this.client_last_name = null;
        this.detached_or_condo = null;
        this.property_street_address = null;
        this.property_city = null;
        this.property_state = null;
        this.property_zipcode = null;
        this.property_county = null;
        this.contract_closing_date = null;
        this.transaction_closed = null;
        this.attorney_is_mario = null;
    }
    
    /*
        Private fields for the modeling/manipulation of a generic RE Purchase/Sale Matter's data.
    */
    
    private final SimpleIntegerProperty client_id_number;
    private final SimpleIntegerProperty matter_id_number;
    
    private final SimpleStringProperty  title_company;
    private final SimpleStringProperty  title_order_number;
    
    private final SimpleStringProperty  client_last_name;
    
    private final SimpleStringProperty  detached_or_condo;
    
    private final SimpleStringProperty  property_street_address;
    private final SimpleStringProperty  property_city;
    private final SimpleStringProperty  property_state;
    private final SimpleStringProperty  property_zipcode;
    private final SimpleStringProperty  property_county;
    
    private final SimpleDateFormat      contract_closing_date;
    
    private final SimpleBooleanProperty transaction_closed;
    
    private final SimpleBooleanProperty attorney_is_mario;
    
    /*
    public Getters/Setters for the object's private fields
    */

    public SimpleIntegerProperty getClient_id_number() {
        return client_id_number;
    }

    public SimpleIntegerProperty getMatter_id_number() {
        return matter_id_number;
    }

    public SimpleStringProperty getTitle_company() {
        return title_company;
    }

    public SimpleStringProperty getTitle_order_number() {
        return title_order_number;
    }

    public SimpleStringProperty getClient_last_name() {
        return client_last_name;
    }

    public SimpleStringProperty getDetached_or_condo() {
        return detached_or_condo;
    }

    public SimpleStringProperty getProperty_street_address() {
        return property_street_address;
    }

    public SimpleStringProperty getProperty_city() {
        return property_city;
    }

    public SimpleStringProperty getProperty_state() {
        return property_state;
    }

    public SimpleStringProperty getProperty_zipcode() {
        return property_zipcode;
    }

    public SimpleStringProperty getProperty_county() {
        return property_county;
    }

    public SimpleDateFormat getContract_closing_date() {
        return contract_closing_date;
    }

    public SimpleBooleanProperty getTransaction_closed() {
        return transaction_closed;
    }

    public SimpleBooleanProperty getAttorney_is_mario() {
        return attorney_is_mario;
    }
    
    
}
