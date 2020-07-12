public class Theatre{
    private int seatingCapacity;
    private int numberTicket;
    private String name;

    public Theatre(int seatingCapacity,int numberTicket,String name){
        this.seatingCapacity=seatingCapacity;
        this.numberTicket=numberTicket;
        this.name=name;
    }
    public int ticketSold(){
        return (seatingCapacity-numberTicket);
    }
    public String toString(){
        return "Production: "+ this.name+ "\nTickets Sold: "+ ticketSold;
    }



}
