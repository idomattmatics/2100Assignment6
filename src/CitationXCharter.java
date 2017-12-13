
/**
 * Purpose : Utilizing design patterns
 * Matthew Kachar
 * @author MKachar
 * matthew.kachar@marquette.edu
 * April 30, 2015
 */
 
public class CitationXCharter extends WorkOrder {
 
    @Override
    public void addCatering() {
        System.out.println("Galley Stock only");
    }
 
    @Override
    public void addAttendants() {
        System.out.println("No attendants assigned to this charter");
    }
 
}