import java.util.*;

class Event{
    private long movieId;
    private String theatreName;
    private String movieName;
    private String actor;
    private String studioName;
    private List<Seat> seats;
    
    //constructor
    public Event(long userId,String theatreName,String movieName,String actor,String studioName,List<Seat> seats){
        this.movieId=movieId;
        this.theatreName=theatreName;
        this.movieName=movieName;
        this.actor=actor;
        this.studioName=studioName;
        this.seats=seats;
    }
    
    public long getId(){
        return movieId;
    }
    
    public String getMovieName(){
        return movieName;
    }
    
    public List<Seat> getSeats(){
        return seats;
    }
}
