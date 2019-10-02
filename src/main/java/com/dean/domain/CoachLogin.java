package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Coach Login")
public class CoachLogin {
    @Id
    private String loginId;
    @Column(name = "Email")
    private String emailAddress;
    @Column(name = "Password")
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


    public static class Builder{
        private String emailAddress,password,loginId;

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

    @Override
    public String toString() {
        return "CoachLogin{" +
                "emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", loginId='" + loginId + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoachLogin coachLogin = (CoachLogin) o;
        return loginId.equals(coachLogin.loginId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginId);
    }

}
