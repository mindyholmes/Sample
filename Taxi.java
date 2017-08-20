//Lindsey Guan Taxi Class
import ExamFiles.Car;
public class Taxi extends Car
{
    private double rate, income;
    private boolean hasPassenger;
    private int sinceFill;
    
    public Taxi(int milesOnATank, double feePerMile)
    {
        super(milesOnATank);
        rate = feePerMile;
        income = 0;
        hasPassenger = false;
        sinceFill = 0;
    }
    
    public void pickUpPassenger()
    {
        hasPassenger = true;
    }
    
    public void dropOffPassenger()
    {
        hasPassenger = false;
    }
    
    @Override
    public void drive(int miles)
    {
        super.drive(miles);
        if (hasPassenger)
        {
            income += (miles * rate);
        }
        sinceFill += miles;
    }
    
    @Override
    public void fillTank()
    {
        super.fillTank();
        income -= (sinceFill * 0.2);
        sinceFill = 0;
    }
    
    public double getIncome()
    {
        return income;
    }
    
    public String toString()
    {
        String str = super.toString();
        if (hasPassenger)
        {
            str += "Has passenger";
        }
        else
        {
            str += "No passenger";
        }
        str += ", $" + income;
        return str;
    }
}