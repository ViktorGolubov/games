package tech.bts.games;
import util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Game game1 = new Game("Football", 22, 12);
        Game game2 = new Game("Golf", 1, 50);
        Game game3 = new Game("Tennis", 2, 15);



        List<Game> games = new ArrayList<Game>();

        games.add(game1);
        games.add(game2);
        games.add(game3);

        int columnWidth = 10;

        List<String> fieldNames = Arrays.asList("Name", "Players", "Price");

        String boarder = "|";
        String title = "";
        for (String fieldName : fieldNames) {
            title += StringUtil.padRight( boarder + " " + fieldName, columnWidth);

        }

        String line = StringUtil.repeat("-" , columnWidth * fieldNames.size());
        String linewith = StringUtil.repeat( "-", columnWidth - 1);
        String linewith1 = StringUtil.repeat( "|", 1);
        String linewith2 = StringUtil.repeat( "-", columnWidth - 4);



        System.out.println(line);
        System.out.println(title);
        System.out.println(linewith1 + linewith + linewith1 + linewith + linewith1 + linewith2 + linewith1);





        for (Game game : games) {

            String productLine = StringUtil.padRight( boarder + " " + game.getName(), columnWidth)
                    + StringUtil.padRight( "" + boarder + " " + game.getNumPlayers(), columnWidth)
                    + StringUtil.padRight( "" + boarder + " " + game.getPrice() + " " + boarder , columnWidth);

            System.out.println(productLine);

        }
        System.out.println(line);



    }
}
