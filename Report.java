
package conference_system;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Report  {
    
  public static void displayfacility(ArrayList<FACILITY> facilities)
    {
        System.out.println("LIST OF ALL FACILITIES");
        System.out.println("===================================");
        
        facilities.stream().map((facility) -> facility.getName()).forEachOrdered((name) -> {
            System.out.println(name);
      });
        
        System.out.println("\n=================================");
     }
        
    public static void roomdetails(ArrayList<Conference_room> room)
    {
        System.out.println("LIST OF ROOM DETAILS");
        System.out.println("==================================");
        
        room.forEach((rooms) -> {
            String name1 = rooms.getName();
            int capacity = rooms.getCapacity();
            int projectors = rooms.getNum_Projectors();
            int whiteboards = rooms.getNum_Whiteboards();
            
            System.out.println("[Room name:]" + name1);
            System.out.println("[Capacity:]" + capacity);
            System.out.println("[Projectors:]" + projectors);
            System.out.println("[Whiteboards:]" + whiteboards + "\n");
      });
        System.out.println("\n=====================================");
    } 
         
    
    public static void cleanedby2 (ArrayList<Cleaner> cleaning)
    {

            System.out.println("LIST OF FACILITIES CLEANED BY 2 CLEANERS");
            System.out.println("===========================================");
            cleaning.forEach((cleans) -> {
                String name2 = cleans.getFacility();
          if (cleans.getCleaners()== 2) {
              System.out.println(name2);
              System.out.println("\n=====================================");
          }
      });
            
    }
    
   public static void cleaningdays (ArrayList<Cleaner> cleaning)
   {
        System.out.println("LIST OF CLEANING DAYS FOR ALL FACILITIES");
        System.out.println("================================================");
        
        cleaning.forEach((cleans) -> {
            String name3 = cleans.getFacility();
            DayOfWeek day = cleans.getDay();
            String day2 = cleans.getDay2();
            
            System.out.println(name3 + "-" + "["+day+"]" + day2 );
      });
        System.out.println("\n=====================================");
                
    }   
   
   public static void cleantoday (ArrayList<Cleaner> cleaning)
   {
       System.out.println("LIST OF FACILITIES TO BE CLEANED TODAY");
       System.out.println("==============================================");
       
       cleaning.forEach((cleans) -> {
           Calendar calendar = Calendar.getInstance();
           Date date = calendar.getTime();
           String today = new SimpleDateFormat("EEEE").format(date.getTime());
           String name4 = cleans.getFacility();
           DayOfWeek use = cleans.clean();
           DayOfWeek use1 = cleans.getDay();
           String use1Str = use1.toString();
          if (use1Str.equalsIgnoreCase(today)) {
              System.out.println(name4);
          }
      });
   }
}
      
   