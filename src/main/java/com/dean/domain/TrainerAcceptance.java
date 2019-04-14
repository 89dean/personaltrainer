package com.dean.domain;

public class TrainerAcceptance {
    private String message;

    private TrainerAcceptance(){}

    private TrainerAcceptance(Builder builder){
        this.message=builder.message;
    }
    public String getMessage(){return message;}

    public static class Builder{
        private String message;

        public Builder message(String message){
            this.message=message;
            return this;
        }
        public TrainerAcceptance build(){return new TrainerAcceptance(this);}
    }
}
