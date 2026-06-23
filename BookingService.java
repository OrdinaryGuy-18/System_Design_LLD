import java.util.*;

class BookingService{
    private Payment pay;
    public BookingService(){
        pay=new Payment();
    }
    
    public BookingDetails bookTicket(long mobileNo,User user, Event movie,String seatNo){
        for(Seat s:movie.getSeats()){
            if(s.getSeats().equalsIgnoreCase(seatNo) && !s.isBooked()){
                boolean payment=pay.makePayment(200);
                if(payment){
                    s.seatBooked();
                    return new BookingDetails(mobileNo,user,movie,seatNo);
                }
            }
        }
        System.out.println("Seat is already booked.");
        return null;
        
        
    }
}
