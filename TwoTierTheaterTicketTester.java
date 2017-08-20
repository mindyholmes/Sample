public class TwoTierTheaterTicketTester
{
    public static void main(String[] args)
    {
        TwoTierTheaterTickets tix = new TwoTierTheaterTickets(40, 4.00, 10, 6.00);
        System.out.println(tix);  // 40 tickets left: 30 regular, 10 premium; $0.0 collected

        boolean success = tix.buySeats(10);
        if (!success)
        {
            System.out.println("Not enough seats left.");
        }
        System.out.println(tix);  // 30 tickets left: 20 regular, 10 premium; $40.0 collected

        success = tix.buyPremSeats(4);
        if (!success)
        {
            System.out.println("Not enough seats left.");
        }
        System.out.println(tix);  // 26 tickets left: 20 regular, 6 premium; $64.0 collected

        success = tix.buyPremSeats(8);
        if (!success)
        {
            System.out.println("Not enough seats left.");
        }
        System.out.println(tix);  // Not enough seats left
                                  // 26 tickets left: 20 regular, 6 premium; $64.0 collected

        success = tix.buySeats(22);
        if (!success)
        {
            System.out.println("Not enough seats left.");
        }
        System.out.println(tix);  // Not enough seats left
                                  // 26 tickets left: 20 regular, 6 premium; $64.0 collected
    }
}