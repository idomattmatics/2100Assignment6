/**
 * Purpose : Utilizing design patterns
 * Matthew Kachar
 * @author MKachar
 * matthew.kachar@marquette.edu
 * April 30, 2015
 */


public class BookingClass {

	public static void main(String[] args) {

		/*********Objective***********
		 * booking class receives a work order for charter request
		 * for specific aircraft which has specific accommodations
		 * Since the charter company will have the same customer
		 * information for every charter a template can be used
		 */
		WorkOrder netJets = new FalconCharter();
		System.out.println("Client : NetJets ");
		System.out.println();
		
		System.out.println("***requesting Falcon charter***");
		System.out.println();
		//using template method
		netJets.generateWorkOrder();

		//added for readability
		System.out.println();
		System.out.println("************");
		System.out.println();

		//new request
		System.out.println("***requesting Citation charter***");
		System.out.println();
		netJets = new CitationXCharter();

		netJets.generateWorkOrder();
	}

}