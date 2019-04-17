package com.dean.domain;

public class CustomerCancelation {
    private Cancelation cancelation;

    private CustomerCancelation(){}

    private CustomerCancelation(Builder builder){
        this.cancelation=builder.cancelation;
    }
    public static class Builder{

        private Cancelation cancelation;

        public Builder cancelation(Cancelation cancelation){
            this.cancelation=cancelation;
            return this;
        }

        public CustomerCancelation build(){return new CustomerCancelation(this);}

    }
}
