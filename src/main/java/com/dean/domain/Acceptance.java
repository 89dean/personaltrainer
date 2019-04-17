package com.dean.domain;

public class Acceptance {
    private String message;

    private Acceptance(){ }

    private Acceptance(Builder builder){
        this.message=builder.message;
    }
    public String getMessage(String message){return message;}

    public static class Builder{
        private String message;

        public Builder message(String message){
            this.message=message;
            return this;
        }
        public Acceptance build(){return new Acceptance(this);}
    }
}
