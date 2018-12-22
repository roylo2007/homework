package com.train;

public class Ticket {

    private static int priceOneWay = 1000;
    private static int priceRoundTrip = 2000;
    private static float discount = 0.9f;
    private int TotalTickets;
    private int NumberRoundTrip;

    public int getTotalTickets() {
        return TotalTickets;
    }

    public void setTotalTickets(int totals) {
        TotalTickets = totals;
    }

    public int getNumberRoundTrip() {
        return NumberRoundTrip;
    }

    public void setNumberRoundTrip(int numRoundTrip) {
        NumberRoundTrip = numRoundTrip;
    }

    public int getTotalPrice(){
        return (TotalTickets - NumberRoundTrip) * priceOneWay + (int)(NumberRoundTrip * priceRoundTrip * discount);
    }
}
