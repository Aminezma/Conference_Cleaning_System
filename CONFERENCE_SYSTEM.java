
package conference_system;

import java.time.DayOfWeek;
import java.util.ArrayList;


public class CONFERENCE_SYSTEM {

    
    public static void main(String[] args) {
        
        FACILITY facility_1 = new Conference_room() {};
        facility_1.setType("Room");
        facility_1.setName("[Room] Main Conference Hall");
        
        FACILITY facility_2 = new Conference_room() {};
        facility_2.setType("Room");
        facility_2.setName("[Room] Meeting Delight");
        
        
        FACILITY facility_3 = new Corridor() {};
        facility_3.setType("Corridor");
        facility_3.setName("[Corridor] East Wing");
        
        
        FACILITY facility_4 = new Corridor() {};
        facility_4.setType("Corridor");
        facility_4.setName("[Corridor] West Wing");
        
        
        FACILITY facility_5 = new Reception() {};
        facility_5.setType("Reception");
        facility_5.setName("[Reception] Main");
        
        Conference_room room_1 = new Conference_room() {};
        room_1.setName("Main Conference Hall");
        room_1.setCapacity(70);
        room_1.setNum_Projectors(2);
        room_1.setNum_Whiteboards(2);
        
        Conference_room room_2 = new Conference_room() {};
        room_2.setName("Meeting Delight");
        room_2.setCapacity(20);
        room_2.setNum_Projectors(1);
        room_2.setNum_Whiteboards(1);
        
        
        DayOfWeek first_day = DayOfWeek.MONDAY;
        DayOfWeek second_day = DayOfWeek.TUESDAY;
        DayOfWeek third_day = DayOfWeek.WEDNESDAY;
        DayOfWeek fourth_day = DayOfWeek.THURSDAY;
        DayOfWeek fifth_day = DayOfWeek.FRIDAY;
        DayOfWeek sixth_day = DayOfWeek.SATURDAY;
        DayOfWeek seventh_day = DayOfWeek.SUNDAY;        
 
        
         Cleaner first_cleaner = new Cleaner();
         first_cleaner.setFacility(facility_1.getName());
         first_cleaner.setDay(first_day);
         first_cleaner.setCleaners(2);
         first_cleaner.clean();
         
         Cleaner second_cleaner = new Cleaner();
         second_cleaner.setFacility(facility_2.getName());
         second_cleaner.setDay(second_day);
         second_cleaner.setCleaners(1);
         second_cleaner.clean();
         
         Cleaner third_cleaner = new Cleaner();
         third_cleaner.setFacility(facility_3.getName());
         third_cleaner.setDay(third_day);
         third_cleaner.setCleaners(1);
         third_cleaner.clean();
         
         Cleaner fourth_cleaner = new Cleaner();
         fourth_cleaner.setFacility(facility_4.getName());
         fourth_cleaner.setDay(fourth_day);
         fourth_cleaner.setCleaners(1);
         fourth_cleaner.clean();
         
         Cleaner fifth_cleaner = new Cleaner();
         fifth_cleaner.setFacility(facility_5.getName());
         fifth_cleaner.setDay(first_day);
         fifth_cleaner.setDay2("[FRIDAY]");
         fifth_cleaner.setCleaners(1);
         fifth_cleaner.clean();
      
         
         ArrayList<FACILITY> facilities = new ArrayList<>();
         facilities.add(facility_1);
         facilities.add(facility_2);
         facilities.add(facility_3);
         facilities.add(facility_4);
         facilities.add(facility_5);
         Report.displayfacility(facilities);
         
        ArrayList<Conference_room> room = new ArrayList<>();
        room.add(room_1);
        room.add(room_2);
        Report.roomdetails(room);
        
        ArrayList<Cleaner> cleaning = new ArrayList<>();
        cleaning.add(first_cleaner);
        cleaning.add(second_cleaner);
        cleaning.add(third_cleaner);
        cleaning.add(fourth_cleaner);
        cleaning.add(fifth_cleaner);
        Report.cleanedby2(cleaning);
        Report.cleaningdays(cleaning);
        Report.cleantoday(cleaning);

        
        
        
        
        
        
    }
    
}
