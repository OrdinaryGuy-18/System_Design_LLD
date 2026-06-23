class BookingDetails{
    private long mobileNo;
    private User user;
    private Event movie;
    private String seatNo;
    
    //constructor
    public BookingDetails(long mobileNo,User user, Event movie, String seatNo){
        this.mobileNo=mobileNo;
        this.user=user;
        this.movie=movie;
        this.seatNo=seatNo;
    }
    
    public String toString(){
        return "----------BOOKING----------\nPhoneNo: "+mobileNo+"\nName: "+user.getUserName()+"\nMovie: "+movie.getMovieName()+"\nSeatNo: "+seatNo+"\n----------BOOKING----------\n";
    }
    
    
}
