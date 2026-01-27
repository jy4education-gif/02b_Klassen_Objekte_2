package com.cc.java;

public class Cat {

    // Felder / Eigenschaften / Attribute
    private String firstName;
    private String furColor;
    private int age;
   
    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }

    
    // Getter
    public String getFirstName() {
        if (checkPermission()) {
            return firstName;
        } else {
            return "Sorry, no permission!!";
        }
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }



    private boolean checkPermission () {
            // some fancy code here
            return true;
    }




    // return der Instanzvariablen / Adresse
    public Cat getInstanceVariable(){
       return this;
    }
    


}