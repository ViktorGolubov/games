package tech.bts.games;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Game game1 = new Game("Football", 22, 12);
        Game game2 = new Game("Golf", 1, 50);
        Game game3 = new Game("Tennis", 2, 15);
        Game game4 = new Game("Ping-pong", 2, 0);
        Game game5 = new Game("Padal", 4, 7);


        List<Game> games = new ArrayList<Game>();

        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);
        games.add(game5);

        for (Game game : games) {

            String productLine = (game.getName())
                    + ("," + game.getNumPlayers() + " players" )
                    + ("," + game.getPrice() + " €");

            System.out.println(productLine);

    }

    }
}
