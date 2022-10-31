
package conference_system;


public class Conference_room extends FACILITY{
    
    private String Room_Name;
    private int Capacity;
    private int Num_Projectors;
    private int Num_Whiteboards;
    
    

    /**
     * @return the Room_Name
     */
    public String getRoom_Name() {
        return Room_Name;
    }

    /**
     * @param Room_Name the Room_Name to set
     */
    public void setRoom_Name(String Room_Name) {
        this.Room_Name = Room_Name;
    }

    /**
     * @return the Capacity
     */
    public int getCapacity() {
        return Capacity;
    }

    /**
     * @param Capacity the Capacity to set
     */
    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * @return the Num_Projectors
     */
    public int getNum_Projectors() {
        return Num_Projectors;
    }

    /**
     * @param Num_Projectors the Num_Projectors to set
     */
    public void setNum_Projectors(int Num_Projectors) {
        this.Num_Projectors = Num_Projectors;
    }

    /**
     * @return the Num_Whiteboards
     */
    public int getNum_Whiteboards() {
        return Num_Whiteboards;
    }

    /**
     * @param Num_Whiteboards the Num_Whiteboards to set
     */
    public void setNum_Whiteboards(int Num_Whiteboards) {
        this.Num_Whiteboards = Num_Whiteboards;
    }
    
}
