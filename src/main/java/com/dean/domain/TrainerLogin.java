package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Trainer Login")
public class TrainerLogin {
    @Id
    private String loginId;
    @Column(name = "Email")
    private String emailAddress;
    @Column(name = "Password")
    private String password;


    private TrainerLogin(){}

    private TrainerLogin(Builder builder){
        this.loginId = builder.loginId;
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }

    public String getLoginId() {
        return loginId;
    }

    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

    public static class Builder{
        private String emailAddress,password,loginId;

        public Builder loginId(String id){
            this.loginId=id;
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
        public Builder Copy(TrainerLogin trainerLogin){
            this.emailAddress = trainerLogin.emailAddress;
            this.password = trainerLogin.password;

            return this;
        }
        public TrainerLogin build(){return new TrainerLogin(this);}
    }

    @Override
    public String toString() {
        return "TrainerLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", loginId='" + loginId + '\'' +
                '}';
    }
}
