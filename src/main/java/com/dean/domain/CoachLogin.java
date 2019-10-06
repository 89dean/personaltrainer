package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class CoachLogin implements Comparable<CoachLogin>{
    @Id
    private String loginId;
    private String emailAddress;
    private String password;


    private CoachLogin(){}

    private CoachLogin(Builder builder){
        this.loginId=builder.loginId;
        this.emailAddress=builder.emailAddress;
        this.password=builder.password;

    }
    public String getLoginId(){return loginId;}

    public String getEmailAddress(){return emailAddress;}

    public String getPassword(){return password;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoachLogin)) return false;
        CoachLogin coachLogin = (CoachLogin) o;
        return getLoginId().equals(coachLogin.getLoginId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLoginId());
    }

    @Override
    public String toString() {
        return "CoachLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", loginId='" + loginId + '\'' +
                '}';
    }
    @Override
    public int compareTo(CoachLogin coachLogin) {
        return this.getLoginId().compareToIgnoreCase(coachLogin.loginId);
    }


    public static class Builder{
        private String loginId;
        private String emailAddress;
        private String password;

        public Builder loginId(String loginId){
            this.loginId=loginId;
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
            this.emailAddress = coachLogin.emailAddress;
            this.password = coachLogin.password;

            return this;
        }
        public CoachLogin build()
        {return new CoachLogin(this);}
    }



}
