package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;


@Entity
@Table(name = "Customer Cancelation")
public class CustomerCancelation {
    @Id
    private String cancelationId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Surname")
    private String surname;
    @Column(name = "Cancel")
    private String cancelMessage;


    private CustomerCancelation(){}

    private CustomerCancelation(Builder builder){
        this.cancelationId=builder.cancelationId;
        this.name=builder.name;
        this.surname=builder.surname;
        this.cancelMessage=builder.cancelMessage;

    }
    public String getCancelationId(){return cancelationId;}

    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getCancelMessage(){return cancelMessage;}


    public static class Builder {
        private String name, surname, cancelMessage,cancelationId;

        public Builder cancelationId(String id) {
            this.cancelationId = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder cancelMessage(String cancelMessage) {
            this.cancelMessage = cancelMessage;
            return this;
        }
        public Builder Copy(CustomerCancelation customerCancelation){
            this.cancelMessage = customerCancelation.cancelMessage;
            this.name = customerCancelation.name;
            this.surname = customerCancelation.surname;

            return this;
        }

            public CustomerCancelation build(){
                return new CustomerCancelation(this);
            }
    }

    @Override
    public String toString() {
        return "CustomerCancelation{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cancelMessage='" + cancelMessage + '\'' +
                ", cancelationId='" + cancelationId + '\'' +
                '}';
    }

}
