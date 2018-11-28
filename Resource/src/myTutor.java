
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean-
 */
public class myTutor {
    String name;
    // Subjects
    String algebra;
    String precalc;
    String calc;
    String stats;
    
    String contact;
    
    String mon;
    String tues;
    String wed;
    String thurs;
    String fri;
    
    public myTutor(String name, 
            String algebra, String precalc, String calc, String stats, 
            String contact, String mon, String tues, String wed, String thurs, String fri) {
        
        this.name = name;
        
        this.algebra = algebra;
        this.precalc = precalc;
        this.calc = calc;
        this.stats = stats;
        
        this.contact = contact;
        this.mon = mon;
        
        this.tues = tues;
        this.wed = wed;
        this.thurs = thurs;
        this.fri = fri; 
    }
    
    public myTutor(myTutor tutor) {
        name = tutor.getName();
        contact = tutor.getContact();
        
        algebra = tutor.getAlgebra();
        precalc = tutor.getPreCalc();
        calc = tutor.getCalc();
        stats = tutor.getStats();
        
        mon = tutor.getMonday();
        tues = tutor.getTuesday();
        wed = tutor.getWednesday();
        thurs = tutor.getThursday();
        fri = tutor.getFriday();
    }
    
    public void save(Statement statement) throws SQLException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT INTO tutor (name, ")
            .append("algebra, precalc, calc, stats, ")
            .append("contact, ")
            .append("mon, tues, wed, thurs, fri) VALUES (")
            .append("'").append(name).append("','")
                
                    .append(algebra).append("','")
                    .append(precalc).append("','")
                    .append(calc).append("','")
                    .append(stats).append("','")
                
                    .append(contact).append("','")
                
                    .append(mon).append("','")
                    .append(tues).append("','")
                    .append(wed).append("','")
                    .append(thurs).append("','")
                    .append(fri).append("');");
        
        statement.executeUpdate(stringBuilder.toString());
    }
    
    public String getName() {
        return name;
    }
    
    public String getClasses() {
        String classes = algebra + precalc + calc + stats;
        if (!classes.isEmpty())
            classes = classes.substring(0, classes.length() - 2);
        return classes;
    }
    
    public String getMonday() {
        return mon;
    }
    
    public String getTuesday() {
        return tues;
    }
    
    public String getWednesday() {
        return wed;
    }
    
    public String getThursday() {
        return thurs;
    }
    
    public String getFriday() {
        return fri;
    }
    
    public String getAlgebra() {
        return algebra;
    }
    
    public String getPreCalc() {
        return precalc;
    }
    public String getCalc() {
        return calc;
    }
    public String getStats() {
        return stats;
    }
    
    public String getSchedule(int day) {
        switch (day) {
                case 0:
                    return mon;
                case 1:
                    return tues;
                case 2:
                    return wed;
                case 3:
                    return thurs;
                case 4:
                    return fri;
                default:
                    return "";
        }          
    }
    public String getContact() {
        return contact;
    }
    
    public int[] toIndices(String day) {
        ArrayList<Integer> indices = new ArrayList();
        
        if (day.contains(", 8, "))
            indices.add(0);
        if (day.contains(", 9, "))
            indices.add(1);
        if (day.contains(", 10, "))
            indices.add(2);
        if (day.contains(", 11, "))
            indices.add(3);
        if (day.contains(", 12, "))
            indices.add(4);
        if (day.contains(", 1, "))
            indices.add(5);
        if (day.contains(", 2, "))
            indices.add(6);
        if (day.contains(", 3, "))
            indices.add(7);
        if (day.contains(", 4, "))
            indices.add(8);
        
        
        int[] arr = new int[indices.size()];
        
        for (int i=0; i < indices.size(); i++) {
            arr[i] = indices.get(i);
        }
        return arr;
    }
    
    public boolean equals(myTutor tutor) {
        if (!name.equals(tutor.getName()))
            return false;
        if (!algebra.equals(tutor.getAlgebra()))
            return false;
        if (!precalc.equals(tutor.getPreCalc()))
            return false;
        if (!calc.equals(tutor.getCalc()))
            return false;
        if (!stats.equals(tutor.getStats()))
            return false;
        if (!contact.equals(tutor.getContact()))
            return false;
        if (!mon.equals(tutor.getMonday()))
            return false;
        if (!tues.equals(tutor.getTuesday()))
            return false;
        if (!wed.equals(tutor.getWednesday()))
            return false;
        if (!thurs.equals(tutor.getThursday()))
            return false;
        if (!fri.equals(tutor.getFriday()))
            return false;
        else
            return true;
    }
     //String algebra, String precalc, String calc, String stats, 
       //     String contact, String mon, String tues, String wed, String thurs, String fri)
}
