/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo06group;

/**
 *
 * @author Srilekha Janagam
 */
public class ShootingArcade extends AdventureRides{
    private int players;
    private int bullets;
    private String ticketType;
    /**
     * run method
     */

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * speed method
     */
    public static void speed()
    {
        System.out.println("BulletSpeed");
               
    }
    /**
     * resultOfGame
     * @return You never Loose
     */
    
    
     @Override
    public String resultOfGame(){
        return "You never Loose";
    }
    /**
     *onlineBooking 
     * @return Your ticket is booked
     */
    
    public  String onlineBooking(){
         System.out.println("Welcome to adventure rides");
    return "Your ticket is booked";
    }
    public static void Casting()

{
int i=6;
double d=(double) i;
System.out.println("Casted to"+d);




}



public static void Exception()
{
int a=5;
int b=0;
try{
int x=a/b;
System.out.println("h:"+x);



}catch(Exception E)
{
System.out.println("Generated Exception is"+E);


}
}
public static void main(String[] args)
{
Exception();
Casting();

}

    
    
    
    
}
