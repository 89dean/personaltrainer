package com.dean.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
public class TrainerResetPassword  {
    @Id
    private String passwordId;
    private String emailAddress;

    private TrainerResetPassword(){}

    private TrainerResetPassword(Builder builder){
        this.emailAddress = builder.emailAddress;

    }

    public String getPasswordId() {
        return passwordId;
    }

    public String getEmailAddress(){return emailAddress;}


    public static class Builder{
        private String passwordId;
        private String emailAddress;

        public Builder passwordId(String id){
            this.passwordId = id;
            return this;
        }
        public Builder emailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }
        public Builder Copy(TrainerResetPassword trainerResetPassword){
            this.emailAddress = trainerResetPassword.emailAddress;

            return this;
        }
        public TrainerResetPassword build(){
            return new TrainerResetPassword(this);
        }
    }

    @Override
    public String toString() {
        return "TrainerResetPassword{" +
                "emailAddress='" + emailAddress + '\'' +
                ", passwordId='" + passwordId + '\'' +
                '}';
    }
}
