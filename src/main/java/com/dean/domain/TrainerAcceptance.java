package com.dean.domain;

import java.util.Objects;

public class TrainerAcceptance implements Comparable<TrainerAcceptance>{
    private String name,surname,message;

    private TrainerAcceptance(){ }

    private TrainerAcceptance(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.message=builder.message;
    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getMessage(){return message;}

    @Override
    public int compareTo(TrainerAcceptance o) {
        return this.message.compareTo(o.message);
    }

    public static class Builder{
        private String name,surname,message;

        public Builder name(String name){
            this.name=name;
            return this;
        }
        public Builder surname(String surname){
            this.surname=surname;
            return this;
        }
        public Builder message(String message){
            this.message=message;
            return this;
        }
        public Builder Copy(TrainerAcceptance trainerAcceptance){
            this.name = trainerAcceptance.name;
            this.surname = trainerAcceptance.surname;
            this.message = trainerAcceptance.message;


            return this;
        }
        public TrainerAcceptance build(){return new TrainerAcceptance (this);}
    }

    @Override
    public String toString() {
        return "TrainerAcceptance{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainerAcceptance that = (TrainerAcceptance) o;
        return message.equals(that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
