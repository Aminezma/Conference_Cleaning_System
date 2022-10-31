
package conference_system;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;


public class Cleaner {
    
    private DayOfWeek day;
    private String  day2 = " " ;
    private int cleaners;
    private String facility;
  
     
    /**
     * @return the day
     */
    
    DayOfWeek clean()
    {
      Calendar now = Calendar.getInstance();    

    /*String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
    "Friday", "Saturday" };
      
      
      
    // Day_OF_WEEK starts from 1 while array index starts from 0
        cleanto =(strDays[now.get(Calendar.DAY_OF_WEEK) - 1]); */ 
         DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
         
        return dayOfWeek;
    }

    /**
     * @return the day
     */
    public DayOfWeek getDay() 
    {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(DayOfWeek day)
    {
        this.day = day;
    }

    /**
     * @return the cleaners
     */
    public int getCleaners() 
    {
        return cleaners;
    }

    /**
     * @param cleaners the cleaners to set
     */
    public void setCleaners(int cleaners)
    {
        this.cleaners = cleaners;
    }

    /**
     * @return the facility
     */
    public String getFacility() 
    {
        return facility;
    }

    /**
     * @param facility the facility to set
     */
    public void setFacility(String facility) 
    {
        this.facility = facility;
    }

    /**
     * @return the day2
     */
    public String getDay2()
    {
        return day2;
    }

    /**
     * @param day2 the day2 to set
     */
    public void setDay2(String day2) 
    {
        this.day2 = day2;
    }
  
}

    
