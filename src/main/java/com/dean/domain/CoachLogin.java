package com.dean.domain;

import com.dean.util.Misc;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="login")
public class CoachLogin {
    @Id

    @GeneratedValue
    private int loginId;
    private String name;
    private String surname;
    private String emailAddress;
    private String password;


    private CoachLogin(){}

    private CoachLogin(Builder builder){
        this.loginId=builder.loginId;
        this.name=builder.name;
        this.surname=builder.surname;
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public int getLoginId(){return loginId;}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword(){return password;}

    @Override
    public String toString() {
        return "CoachLogin{" +
                "loginId=" + loginId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private int loginId;
        private String name;
        private String surname;
        private String emailAddress;
        private String password;

        public Builder loginId(int loginId){
            this.loginId=loginId;
            return this;
        }
        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
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
        public Builder Copy(CoachLogin coachLogin){
            this.loginId = coachLogin.loginId;
            this.name = coachLogin.name;
            this.surname = coachLogin.surname;
            this.emailAddress = coachLogin.emailAddress;
            this.password = coachLogin.password;

            return this;
        }
        public CoachLogin build()
        {return new CoachLogin(this);}
    }

}
