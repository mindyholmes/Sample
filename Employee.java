public class Employee
{

    private double payRate1;
    private double hoursWorked1; 

    public void Employee()
    {
        payRate1 = 0;
        hoursWorked1 = 0;
    }

    public void Employee(double payRate)
    {
        payRate1 = payRate;
        
    }
    
    
    public void work(double hoursWorked)
    {
        hoursWorked1 += hoursWorked;
    }

    public double GetHoursWorked()
    {
        return hoursWorked1;
    }

    public double getPaid()
    {  
        double hours = hoursWorked1;
        hoursWorked1 = 0;
        return hours * payRate1;
        
    }
    
    public void workJobShare(Employee other, double HoursWorked)
    {
     other.work(HoursWorked / 2);
     work(HoursWorked / 2);
    }

}