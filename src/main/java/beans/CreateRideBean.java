package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import domain.Driver;
import domain.Ride;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("ridebean")
@SessionScoped
public class CreateRideBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String from;
	private String to;
	private int seats;
	private Date date;
	private float price;
	private Driver driver;

	private List<Ride> rides = new ArrayList<Ride>();

public CreateRideBean() {
driver=new Driver("Test driver","test");
}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}

	public String crear() {
		System.out.println(from + " " + to + " " + date + " " + seats + " " + price);

		Ride r = driver.addRide(from, to, date, seats, price);
		rides.add(r);
		System.out.println("Rides: " + rides);
		return "ok";
	}
}