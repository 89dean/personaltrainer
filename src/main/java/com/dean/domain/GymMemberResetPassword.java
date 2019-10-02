package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Member Reset Password")
public class GymMemberResetPassword {
    @Id
    private String passwordId;
    @Column(name = "Email")
    private String emailAddress;

    private GymMemberResetPassword(){}

    private GymMemberResetPassword(Builder builder){
        this.passwordId = builder.passwordId;
        this.emailAddress = builder.emailAddress;

    }
    public String getEmailAddress(){return emailAddress;}


    public static class Builder{
        private String emailAddress,passwordId;

        public Builder passwordId(String id){
            this.passwordId = id;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(GymMemberResetPassword gymMemberResetPassword){
            this.passwordId = gymMemberResetPassword.passwordId;
            this.emailAddress = gymMemberResetPassword.emailAddress;

            return this;
        }
        public GymMemberResetPassword build(){
            return new GymMemberResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "GymMemberResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                ", passwordId='" + passwordId + '\'' +
                '}';
    }
}
