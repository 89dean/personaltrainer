package com.dean.domain;

import java.util.Objects;

public class CoachAcceptance implements Comparable<CoachAcceptance> {
    private String name,surname,message;

    private CoachAcceptance(){}

    private CoachAcceptance(Builder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.message=builder.message;
    }
    public String getName(){return name;}

    public String getSurname(){return surname;}

    public String getMessage(){return message;}

    @Override
    public int compareTo(CoachAcceptance o) {
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
        public Builder Copy(CoachAcceptance coachAcceptance){
            this.name = coachAcceptance.name;
            this.surname = coachAcceptance.surname;
            this.message = coachAcceptance.message;


            return this;
        }
        public CoachAcceptance build(){
            return new CoachAcceptance(this);
        }
    }
    @Override
    public String toString() {
        return "CoachAcceptance{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoachAcceptance that = (CoachAcceptance) o;
        return message.equals(that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
