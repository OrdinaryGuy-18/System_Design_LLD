class User{
    private int userId;
    private String userName;
    //constructor
    public User(int userId,String userName){
        this.userId=userId;
        this.userName=userName;
    }
    //getter methods
    public int getUserId(){
        return userId;
    }
    public String getUserName(){
        return userName;
    }
}
