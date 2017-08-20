public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();

        e1.Employee(6.75);
        e1.work(6.0);
        System.out.println(e1.GetHoursWorked());
        
        System.out.println(e1.getPaid() + " " +e1.GetHoursWorked());
        
        Employee e2 = new Employee();
        
        e2.Employee(7.25);
        e2.work(10);
        e2.work(4);
        System.out.println(e2.GetHoursWorked());
        
        e1.workJobShare(e2, 8);
        System.out.println(e1.GetHoursWorked());
        System.out.println(e2.GetHoursWorked());
    }
}
