package com.classes;

public class Basketball extends Ball{
    //--------------------Properties -------------------------------------------
    private  boolean isNba;
    private  int circumference;

    //--------------------Getters and Setters ----------------------------------
    public boolean isNba() {
        return isNba;
    }

    public void setNba(boolean nba) {
        isNba = nba;
    }

    public int getCircumference() {
        return circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    //--------------------Getters and Setters ----------------------------------


    // ---------------------------------------methods---------------------------

    public boolean isNBA(){
        if(isNba == true){
            return true;
        } else {
            return false;
        }

    }

    //---------------------Overrides ---------------------------------------
    //This bounce overrides the bounce in the ball class for basketballs only

    public void Bounce(){
        System.out.println("Basketball bouncing ...");
    }

}
