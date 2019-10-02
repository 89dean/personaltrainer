package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Coach Reset Password")
public class CoachResetPassword {
    @Id
    private String resetId;
    @Column(name = "Email")
    private String emailAddress;


    private CoachResetPassword(){}

    private CoachResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }
    public String getResetId(){return resetId;}

    public String getEmailAddress(){return emailAddress;}


    public static class Builder{
        private String emailAddress,resetId;

        public Builder resetId(String id){
            this.resetId = id;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(CoachResetPassword coachResetPassword){
            this.resetId = coachResetPassword.resetId;
            this.emailAddress = coachResetPassword.emailAddress;

            return this;
        }
        public CoachResetPassword build(){
            return new CoachResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "CoachResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                ", resetId='" + resetId + '\'' +
                '}';
    }
}
