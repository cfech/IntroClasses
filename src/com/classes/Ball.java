package com.classes;

public class Ball {







//blueprint
//you can create multiple constructors

    //-----------------------------------PROPERTIES/INSTANCE VARIABLES----------------------------------------
    //properties or instances variables
    private String color;
    private String name;

    //access control, when it is public anyone can modify anything
    //private, only accessed with the class
    private int compacity;
    private int bounceRate;
    //-----------------------------------PROPERTIES/INSTANCE VARIABLES----------------------------------------


    //-----------------------------------CONSTRUCTORS----------------------------------------
    //default export?
    public Ball() {

    }


    //Example of overloading a constructor, you can create many Ball constructors, and use them as long as they do not have teh same number of properties
    //This gives us the ability to make many different kinds of the same class,
    //So we could make a ball with 0 properties, 2 properties, and 4 properties, because we have those 3 constructors set up depending on the ball that we want
    public Ball(String Mcolor, String Mname) {
        name = Mname;
        color = Mcolor;

    }

    //The constructor must be the same name as the class, this is referring to the class,
    //to create a constructor, highlight was you want command g and choose constructor, highlight what you want, click create
    public Ball(String Mcolor, String name, int compacity, int bounceRate) {

        //since we differentiate the mMcolor being passe in from the "color" on line 18 we dont need this
        color = Mcolor;
        this.name = name;
        this.compacity = compacity;
        this.bounceRate = bounceRate;
    }


    //-----------------------------------CONSTRUCTORS----------------------------------------


    ///-----------------------------GETTERS AND SETTERS---------------------------------------------------
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompacity() {
        return compacity;
    }

    public void setCompacity(int compacity) {
        this.compacity = compacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

///-----------------------------GETTERS AND SETTERS---------------------------------------------------

    ///-----------------------------BEHAVIORS/METHODS---------------------------------------------------

    public void Bounce() {
        System.out.println("Bouncing...");
    }

    public void Deflate() {
        System.out.println("Deflating ...");
    }

    public void Inflate() {
        System.out.println("Inflating ...");
    }

    ///-----------------------------BEHAVIORS/METHODS---------------------------------------------------

}
