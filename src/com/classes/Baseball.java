package com.classes;

public class Baseball extends  Ball{
    //-------------------------------------Properties ----------------------------------------------
    private boolean isMLB;
    private String typeOfHit;


    //----------------------------------------Getters and Setters -----------------------------------
    public boolean isMLB() {
        return isMLB;
    }

    public void setMLB(boolean MLB) {
        isMLB = MLB;
    }

    public String getTypeOfHit() {
        return typeOfHit;
    }

    public void setTypeOfHit(String typeOfHit) {
        this.typeOfHit = typeOfHit;
    }



    //-----------------------------Methods-------------------------------------------------------------

    public void homeRun(){
        System.out.println("You hit a home run ");
    }

    //---------------------------Overrides-------------------------------------------------------------

    public void  Inflate(){
        System.out.println("Baseballs dont inflate");
    }





}
