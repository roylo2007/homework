package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        do{
           if(!booking()){
               break;
           }
        }while (true);
    }

    private static boolean booking() {
        Ticket ticket = new Ticket();
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************************");
        System.out.println("****** Welcome Train Ticket booking system *******");
        System.out.println("**************************************************");
        System.out.print("Please enter number of tickets:");
        ticket.setTotalTickets(scanner.nextInt());
        if (ticket.getTotalTickets() > 0 ){
            do {
                if(ticket.getNumberRoundTrip() > ticket.getTotalTickets()){
                    System.out.println("Round-trip tickets > Total tickets");
                    System.out.print("Please re-enter round-trip tickets again:");
                }else{
                    System.out.print("How many round-trip tickets:");
                }
                ticket.setNumberRoundTrip(scanner.nextInt());
            } while(ticket.getNumberRoundTrip() > ticket.getTotalTickets());
            System.out.println("**************************************************");
            System.out.println("****** Thank you for your order *******");
            System.out.println("Total tickets: " + ticket.getTotalTickets());
            System.out.println("Round-trip: " + ticket.getNumberRoundTrip());
            System.out.println("Total Price: $" + String.format("%,d",ticket.getTotalPrice()));
            System.out.println("**************************************************");
            return true;
        }else{
            System.out.println("End");
            System.out.println("**************************************************");
            return false;
        }
    }
}
