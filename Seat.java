class Seat{
    private String seatNo;
    private boolean booked;
    public Seat(String seatNo){
        this.seatNo=seatNo;
        this.booked=false;
    }
    
    public String getSeats(){
        return seatNo;
    }
    
    public boolean isBooked(){
        return booked;
    }
    //setter method after booking a class
    public void seatBooked(){
        booked=true;
    }
}
