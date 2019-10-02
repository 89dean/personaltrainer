package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Customer Reset Password")
public class CustomerResetPassword {
    @Id
    private String resetId;
    @Column(name = "Email")
    private String emailAddress;

    private CustomerResetPassword(){}

    private CustomerResetPassword(Builder builder){
        this.resetId = builder.resetId;
        this.emailAddress = builder.emailAddress;

    }
    public String getEmailAddress(){return emailAddress;}

    public static class Builder{
        private String emailAddress,resetId;

        public Builder resetId(String resetId){
            this.resetId = resetId;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(CustomerResetPassword customerResetPassword){
            this.resetId = customerResetPassword.resetId;
            this.emailAddress = customerResetPassword.emailAddress;

            return this;
        }
        public CustomerResetPassword build(){
            return new CustomerResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "CustomerResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                ", resetId='" + resetId + '\'' +
                '}';
    }
}
