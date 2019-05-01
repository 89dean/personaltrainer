package com.dean.domain;

import java.util.Objects;

public class CustomerUpdateDetails implements Comparable<CustomerUpdateDetails> {
    private String name,surname;

    private CustomerUpdateDetails(){}

    private CustomerUpdateDetails(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    @Override
    public int compareTo(CustomerUpdateDetails o) {
        return this.name.compareTo(o.name);
    }

    public static class Builder{
        private String name,surname;

        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder Copy(CustomerUpdateDetails customerUpdateDetails){
            this.name = customerUpdateDetails.name;
            this.surname = customerUpdateDetails.surname;

            return this;
        }
        public CustomerUpdateDetails build(){return new CustomerUpdateDetails(this);}

    }

    @Override
    public String toString() {
        return "UpdateUserDetails{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerUpdateDetails that = (CustomerUpdateDetails) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
