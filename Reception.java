/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conference_system;

/**
 *
 * @author Mohamed amin
 */
public class Reception extends FACILITY {
    
    private String Name;

    /**
     * @return the Name
     */
    @Override
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    @Override
    public void setName(String Name) {
        this.Name = Name;
    }
}
