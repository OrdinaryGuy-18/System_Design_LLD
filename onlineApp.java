import java.util.*;
public class onlineApp
{
	public static void main(String[] args) {
		System.out.println("-----OnlineApp-----");
		List<Seat> seats=new ArrayList<>();
		seats.add(new Seat("Z9"));
		seats.add(new Seat("A12"));
		
		Event movie1=new Event(101,"Sathya Cinemas","KARA","Dhanush","Vels Film Studios",seats);
		Event movie2=new Event(102,"Sri Sakthi Cinemax","KARUPPU","Surya","Dream Warrior Studios",seats);
		
		//store the events
		List<Event> eventlist=new ArrayList<>();
		eventlist.add(movie1);
		eventlist.add(movie2);
		
		//search for movies present in the venue
		Search s1=new Search(eventlist);
		Event movieName=s1.searchByName("Kara");
		//response
		if(movieName==null){
		    System.out.println("Movie not found");
		}
	
		
		User user1=new User(1,"Kumaran");
		User user2=new User(2,"Soundar");
		User user3=new User(3,"Arun");
		User user4=new User(4,"Ram");
		
		BookingDetails booking1=new BookingService().bookTicket(9080044508L,user1,movie1,"Z9");
		System.out.println(booking1);
		BookingDetails booking2=new BookingService().bookTicket(8148704508L,user3,movie2,"A12");
		System.out.println(booking2);
		
		
	}
}


/*
System Design flow:

Function and Non-Functional requirements
Core Entity
API Design
HLD arc 
LLD arc 
Code implementation and deployment(sprint)
*/
