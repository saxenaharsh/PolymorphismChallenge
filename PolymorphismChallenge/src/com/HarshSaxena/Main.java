package com.HarshSaxena;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car --> startEngine()";
    }

    public String acclerate(){
        return "Car --> acclerate()";
    }
    public String brake(){
        return "Car --> brake()";
    }
}

class Ignis extends Car{
    public Ignis(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ignis --> startEngine()";
    }

    @Override
    public String acclerate() {
        return "Ignis --> accelerate()";
    }

    @Override
    public String brake() {
        return "Ignis --> brake()";
    }
}
 class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford --> startEngine()";
    }

    @Override
    public String acclerate() {
        return "Ford --> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford --> brake()";
    }
}

 class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName()  + "--> startEngine()";
    }

    @Override
    public String acclerate() {
        return getClass().getSimpleName() +   "--> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  "--> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.acclerate());
        System.out.println(car.brake());

        Ignis ignis = new Ignis(8, "Ignis Delta");
        System.out.println(ignis.startEngine());
        System.out.println(ignis.acclerate());
        System.out.println(ignis.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Pajero");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.acclerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Mustang");
        System.out.println(ford.startEngine());
        System.out.println(ford.acclerate());
        System.out.println(ford.brake());

    }


}
