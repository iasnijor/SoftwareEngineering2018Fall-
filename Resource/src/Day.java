/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rojen
 */
public class Day {
      private int startTime;
    private int endTime;
    private int netHours;
            public Day(){
                startTime=0;
                endTime=0;
                netHours=endTime-startTime;
            }
            public Day(int startTime,int endTime){
                if (startTime>=8 && endTime<=9){
                if(startTime >12){this.startTime=startTime-12;}
                else this.startTime=startTime;
                if (endTime>12) this.endTime=endTime-12;
                else this.endTime=endTime;
                }
                else{ this.startTime=0; this.endTime=0;
                }
                netHours=endTime-startTime;
            }
            public void setstartTime(int startTime){
               this.startTime= startTime;
            }
            public void calculatenetTime(){
                netHours= endTime-startTime;
            }
            public void setendTime(int endTime){
               this.endTime= endTime;
            }
            public int getstartTime(){
                return startTime;
            }
            public int getendTime(){
                return endTime;
            }
            public int getnetHours(){
                return netHours;
            }
            
}


