package com.dean.domain;

import java.util.Objects;

public class CustomerRegistration implements Comparable<CustomerRegistration>{
    private String name,surname,emailAddress,preferdSport,id;

    private CustomerRegistration(){}

    private CustomerRegistration(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.emailAddress = builder.emailAddress;
        this.preferdSport = builder.preferedSport;
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
    public int compareTo(CustomerRegistration o) {
        return this.id.compareTo(o.id);
    }

    public static class Builder{
        private String name,surname,emailAddress,preferedSport,id;

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
            this.preferedSport = preferedSport;
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
            this.preferedSport = customerRegistration.preferdSport;
            this.id = customerRegistration.id;

            return this;
        }
        public CustomerRegistration build(){
            return new CustomerRegistration(this);
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerRegistration that = (CustomerRegistration) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
