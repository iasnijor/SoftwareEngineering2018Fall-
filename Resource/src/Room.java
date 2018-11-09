/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rojen
 */
public class Room {
   private String Name;
   private int Hours;
   private String Event;
   private String Type;
   public Room(String Name,int Hours, String Event,String Type){
       this.Name=Name;
       this.Hours=Hours;
       this.Event=Event;
       this.Type=Type;
   }
   public String getName(){
       return Name;
   }
   public void reserve(int Hours, String Event){
       this.Hours=Hours;
       this.Event=Event;
   }
   public String getType(){
       return Type;
   }
   public String getEvent(){
       return Event;
   }
   public int getHours(){
       return Hours;
   }
   
}



