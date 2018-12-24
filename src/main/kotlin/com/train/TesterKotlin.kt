package com.train.kotlin

import java.util.*

var priceOneWay :Int = 1000
var priceRoundTrip :Int = 2000
var discount : Float = 0.9f

fun main(args: Array<String>) {
    while (true){
        if(!booking()){
            break
        }
    }
}

private fun booking(): Boolean {
    val ticket = Ticket()
    val scanner = Scanner(System.`in`)
    println("**************************************************")
    println("****** Welcome Train Ticket booking system *******")
    println("**************************************************")
    print("Please enter number of tickets:")
    ticket.totalTickets = scanner.nextInt()
    if(ticket.totalTickets > 0) {
        do {
            if (ticket.numRoundTrip > ticket.totalTickets) {
                println("Round-trip tickets > Total tickets")
                print("Please re-enter round-trip tickets again:")
            } else {
                print("How many round-trip tickets:")
            }
            ticket.numRoundTrip = scanner.nextInt()
        } while (ticket.numRoundTrip > ticket.totalTickets)
        println("**************************************************")
        println("****** Thank you for your order *******")
        println("Total tickets: " + ticket.totalTickets)
        println("Round-trip: " + ticket.numRoundTrip)
        println("Total Price: $" + String.format("%,d", ticket.getTotalPrice()))
        println("**************************************************")
        return true
    }else{
        println("End")
        println("**************************************************")
        return false
    }
}

class Ticket (var totalTickets:Int = 0 , var numRoundTrip:Int = 0) {
    fun getTotalPrice(): Int =
        (totalTickets - numRoundTrip) * priceOneWay + (numRoundTrip * priceRoundTrip * discount).toInt()
}

