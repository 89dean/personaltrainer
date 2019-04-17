package com.dean.domain;

public class CustomerDetails {
    private UpdateUserDetails updateUserDetails;


    private CustomerDetails(){}

    private CustomerDetails(Builder builder){
        this.updateUserDetails=builder.updateUserDetails;
    }
    public static class Builder{

        private UpdateUserDetails updateUserDetails;

        public Builder loginDetails(UpdateUserDetails updateUserDetails){
            this.updateUserDetails=updateUserDetails;
            return this;
        }

        public CustomerDetails build(){return new CustomerDetails(this);}

    }
}
