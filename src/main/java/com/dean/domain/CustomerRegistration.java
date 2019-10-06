package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class CustomerRegistration implements Comparable<CustomerRegistration>{
    @Id
    private String id;
    private String name;
    private String surname;
    private String emailAddress;
    private String preferdSport;

    private CustomerRegistration(){}

    private CustomerRegistration(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.emailAddress = builder.emailAddress;
        this.preferdSport = builder.preferdSport;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPreferdSport() {
        return preferdSport;
    }

    public String getId(){return id;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerRegistration)) return false;
        CustomerRegistration customerRegistration = (CustomerRegistration) o;
        return getId().equals(customerRegistration.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "CustomerRegistration{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", preferdSport='" + preferdSport + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(CustomerRegistration customerRegistration) {
        return this.getId().compareToIgnoreCase(customerRegistration.getId());
    }


    public static class Builder{
        private String id;
        private String name;
        private String surname;
        private String emailAddress;
        private String preferdSport;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder prferedSport(String preferedSport){
            this.preferdSport = preferedSport;
            return this;
        }
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder Copy(CustomerRegistration customerRegistration){
            this.name = customerRegistration.name;
            this.surname = customerRegistration.surname;
            this.emailAddress = customerRegistration.emailAddress;
            this.preferdSport = customerRegistration.preferdSport;
            this.id = customerRegistration.id;

            return this;
        }
        public CustomerRegistration build(){
            return new CustomerRegistration(this);
        }
    }
}
