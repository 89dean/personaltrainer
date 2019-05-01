package com.dean.domain;

import java.util.Objects;

public class CustomerCancelation implements Comparable<CustomerCancelation>{
    private String name,surname,cancelMessage;

    private CustomerCancelation(){}

    private CustomerCancelation(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.cancelMessage=builder.cancelMessage;

    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getCancelMessage(){return cancelMessage;}

    @Override
    public int compareTo(CustomerCancelation o) {
        return this.cancelMessage.compareTo(o.cancelMessage);
    }

    public static class Builder {
        private String name, surname, cancelMessage;

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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCancelation that = (CustomerCancelation) o;
        return cancelMessage.equals(that.cancelMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cancelMessage);
    }
}
