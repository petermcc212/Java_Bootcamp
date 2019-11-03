public class Main {

    public static void main(String[] args) {



        Swimmer peter = new Swimmer("Peter");
        Swimmer steven = new Swimmer("Steven");
        Swimmer stewart = new Swimmer("Stewart");


        BadmintonPlayer john = new BadmintonPlayer("Michael");


        Team<BadmintonPlayer> whatARacket = new Team<>("What A Racket");
        whatARacket.addPlayer(john);


        Team<Swimmer> dolphins = new Team<>("Dolphins");
        dolphins.addPlayer(peter);

        Team<Swimmer> trout = new Team<>("Trout");
        trout.addPlayer(steven);

        Team<Swimmer> salmon = new Team<>("Salmon");
        salmon.addPlayer(stewart);

        dolphins.matchResult(trout, 2, 0);
        dolphins.matchResult(trout, 0, 2);
        salmon.matchResult(trout, 2, 0);





        LeagueTable<Team<Swimmer>> swimmingLeague = new LeagueTable<>("Swim League");

        swimmingLeague.add(dolphins);
        swimmingLeague.add(trout);
        swimmingLeague.add(salmon);



        swimmingLeague.showLeagueTable();






    }
}
