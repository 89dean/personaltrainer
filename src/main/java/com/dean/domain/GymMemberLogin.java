package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
    public class GymMemberLogin {
    @Id
    private String loginId;
    private String emailAddress;
    private String password;


    private GymMemberLogin(){}

    private GymMemberLogin(Builder builder){
        this.loginId=builder.loginId;
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

    public static class Builder{
        @Id
        private String loginId;
        private String emailAddress;
        private String password;

        public Builder loginId(String id){
            this.loginId= loginId;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress=emailAddress;
            return this;
        }
        public Builder password(String password){
            this.password=password;
            return this;
        }
        public Builder Copy(GymMemberLogin gymMemberLogin){
            this.loginId = gymMemberLogin.loginId;
            this.emailAddress = gymMemberLogin.emailAddress;
            this.password = gymMemberLogin.password;

            return this;
        }
        public GymMemberLogin build(){return new GymMemberLogin(this);}
    }

    @Override
    public String toString() {
        return "GymMemberLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", loginId='" + loginId + '\'' +
                '}';
    }
}
