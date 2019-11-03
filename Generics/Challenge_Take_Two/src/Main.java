public class Main {

    public static void main(String[] args) {


        League<Team<PingPongPlayer>> pingPongLeague = new League<>("AFL");

        Team<PingPongPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<PingPongPlayer> melbourne = new Team<>("Melbourne");
        Team<PingPongPlayer> hawthorn = new Team<>("Hawthorn");
        Team<PingPongPlayer> fremantle = new Team<>("Fremantle");

        adelaideCrows.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 8, 3);


        pingPongLeague.add(adelaideCrows);
        pingPongLeague.add(melbourne);
        pingPongLeague.add(hawthorn);
        pingPongLeague.add(fremantle);



        pingPongLeague.showLeagueTable();



    }
}
