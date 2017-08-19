import java.text.MessageFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.planetpif.model.Passenger;
import com.planetpif.model.Trip;
import com.planetpif.service.TripService;

public class Application {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	public static void main(String[] args) {

		TripService tripService = context.getBean("tripService", TripService.class);

		Trip testTrip = tripService.getFirstTrip();
		String output = MessageFormat.format("The trip is from {0} to {1} ", testTrip.getFrom(), testTrip.getTo());
		System.out.println(output);
		
		// See which passengers are in this trip
		System.out.println("Passengers: ");
		for(Passenger p : testTrip.getPassengers()) {
			System.out.println(p.getFirstName() + " " + p.getLastName());
		}
	
	}

}
