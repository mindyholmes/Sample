import ExamFiles.TheaterTickets;
public class TwoTierTheaterTickets extends TheaterTickets{
    private int pSeats;
    private double pPrice;
    private int sLeft;
    public TwoTierTheaterTickets( int totalSeats, double regularPrice){
        super(totalSeats, regularPrice);
        pSeats = 0; 
        pPrice = 0;
        sLeft = totalSeats;
    }

    public TwoTierTheaterTickets( int totalSeats, double regularPrice, int premiumSeats, double premiumPrice){
        super(totalSeats, regularPrice);
        pSeats = premiumSeats;
        pPrice = premiumPrice;
        sLeft = totalSeats;
    }

    public boolean buyPremSeats(int numSeats){
        if(pSeats >= numSeats){
            sLeft-= numSeats;
            pSeats-= numSeats;
            return true;
        }
        else
            return false;
    }

    public boolean buySeats(int numSeats){
        if(super.buySeats(numSeats)){
            sLeft -= numSeats;
            return true;
        } 
        else{
            return false;
        }

    }

    public double getPremPrice(){
        return pPrice;
    }

    public int getRegSeatsLeft(){
        return (getSeatsLeft() - getPremSeatsLeft());
    }

    public int getPremSeatsLeft(){
        return pSeats;
    }

    public String toString(){
        String str = (super.toString()+ "Regular Tickets Remaining: " + getRegSeatsLeft() + "\nPremium Tickets Remaining: " + pSeats + "\n");
        return str;
    }

}