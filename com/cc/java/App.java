package com.cc.java;

public class App {
    
    public static void main(String[] args){

        // 2. Iteration
        // private Felder in Cat
        // Instanziierung und Wertzuweisung kombiniert ---> costum Konstruktor

        Cat cat = new Cat("Grizabella", "white", 29);
       
        output(cat.getFirstName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge())); // explizite Typumwandlung
        // output(String.valueOf(cat.age));
        output("-----------------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);
        
        cat2.setAge(36);        // Zugriff über Setter

        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge())); // explizite Typumwandlung
    }

        public static void output(String outputStr){
        System.out.println(outputStr);
        }

}
