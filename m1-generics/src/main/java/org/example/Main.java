package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();

        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

        System.out.println("-------------");

        FootballPlayer yilmaz = new FootballPlayer("yilmaz");
        BaseballPlayer joe = new BaseballPlayer("joe");
        SoccerPlayer jim = new SoccerPlayer("jim");

        Team<SoccerPlayer> liverpool = new Team("Liverpool");
//        liverpool.addPlayer(yilmaz);
//        liverpool.addPlayer(joe);
        liverpool.addPlayer(jim);


    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(int item : items){
            System.out.println(item*2);
        }


    }
}