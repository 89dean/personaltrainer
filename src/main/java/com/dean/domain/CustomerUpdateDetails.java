package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Customer Update Details")
public class CustomerUpdateDetails {
    @Id
    private String detailsId;
    @Column(name="Name")
    private String name;
    @Column(name = "Surname")
    private String surname;


    private CustomerUpdateDetails(){}

    private CustomerUpdateDetails(Builder builder){
        this.detailsId=builder.detailsId;
        this.name=builder.name;
        this.surname=builder.surname;
    }

    public String getDetailsId() {
        return detailsId;
    }

    public String getName(){return name;}

    public String getSurname(){return surname;}


    public static class Builder{
        private String name,surname,detailsId;

        public Builder detailsId(String id){
            this.detailsId=id;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder Copy(CustomerUpdateDetails customerUpdateDetails){
            this.detailsId = customerUpdateDetails.detailsId;
            this.name = customerUpdateDetails.name;
            this.surname = customerUpdateDetails.surname;

            return this;
        }
        public CustomerUpdateDetails build(){return new CustomerUpdateDetails(this);}

    }

    @Override
    public String toString() {
        return "CustomerUpdateDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", detailsId='" + detailsId + '\'' +
                '}';
    }

}
