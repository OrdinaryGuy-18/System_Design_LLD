import java.util.*;

class Search{
    private List<Event> eventlist;
    //constructor
    public Search(List<Event> eventlist){
        this.eventlist=eventlist;
    }
    
    public Event searchByName(String movieName){
        for(Event e:eventlist){
            if(e.getMovieName().equalsIgnoreCase(movieName)){
                return e;
            }
        }
        return null;
    }
}
