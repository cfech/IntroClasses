package com.classes;


//class is like a blueprint of an object
public class Main {

    //its is a functions that wont return anything , every program must have a main method
    public static void main(String[] args) {


        //------------------48, inheritance -------------------

        Basketball basketBall = new Basketball();
        basketBall.setColor("Orange");
        basketBall.setNba(true);

        Basketball bball = new Basketball();
                bball.setColor("black");
                bball.setNba(false);

        System.out.println(basketBall.getColor());

        Baseball baseBall = new Baseball();
        baseBall.setColor("white");
        baseBall.setTypeOfHit("Double");



        System.out.println(baseBall.getColor());

        //overriding the bounce method in ball with the one in basketball
        basketBall.Bounce();
        baseBall.Bounce();

        basketBall.Inflate();
        baseBall.Inflate();

        //-----------------------------Object classes -----------------------------

        //we can call these methods becuase they are connected to object super class
        System.out.println(basketBall.hashCode());
        System.out.println(bball.getClass().getSimpleName());
        System.out.println(bball.toString());



        //---------------------Getters and Setter, Multiple Contrcutors-------------------------------------


    Ball mBall = new Ball("black", "singleBall");
       // System.out.println(mBall.getColor());


        //We need to instantiate the ball, create an instance of it
        Ball otherBall = new Ball("blue", "aBall", 12, 45);

        Ball myBall = new Ball();
        //using setter to set a new name
        myBall.setName("Hello");
        myBall.setBounceRate(124);
        myBall.setColor("red");
        myBall.setCompacity(2);

        //using getter to get info
        //System.out.println(myBall.getBounceRate());

        String color = myBall.getColor();
        //System.out.println(color);




///////////////////////////////////43/////////////^^^^^^^^^^^^45^^^^^^^^^^^^^^^^^^^^^

        //can now access my ball, and set its properties using .notation
//        myBall.color = "Orange";
//
//        myBall.name ="Basketball";



//        System.out.println(myBall.color);
//
//        System.out.println(myBall.name);

        //We can create multiple instances from one class

//        Ball footBall = new Ball();

//        footBall.name="Football";
//        footBall.color ="Brown";
//
//        System.out.println(footBall.color);
//        System.out.println(footBall.name);
    }
}
