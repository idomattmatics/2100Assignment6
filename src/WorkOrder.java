
/**
 * Purpose : Utilizing design patterns
 * Matthew Kachar
 * @author MKachar
 * matthew.kachar@marquette.edu
 * April 30, 2015
 */
 
public abstract class WorkOrder {
 
    public final void generateWorkOrder(){//template
       
    	generalServing();
        addCatering();
        addLavService();
        addAttendants();
        System.out.println();
        System.out.println("Charter is booked");
    }
 
    private void addLavService() {
        System.out.println("Lav services provided");
    }
 
    //two options that vary for each charter
    public abstract void addCatering();
    
    public abstract void addAttendants();
 
    //Client requested general serving for entire fleet
    private void generalServing() {
        System.out.println("General Serving included : Hydraulics, Oil, Nitrogen, Oxygen");
        System.out.println();
    }
}