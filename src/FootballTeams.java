import java.util.*;

//Given a list of football teams with the result of the match. Output the summary table of the results of all matches.
//
//        The team gets 3 points for winning, 0 points for loosing, 1 point for draw.
//
//        Input format:
//
//        The first line specifies the integer nn — the number of completed games.
//        After this follow the nn lines, which contain the game results in the following format:
//        First_team;Goals_by_first_team;Second_team;Goals_by_second_team
//        Output of your program should look like the following:
//        Team:Total_games Wins Draws Defeats Total_points
//
//        You can output teams in an arbitrary order.
//
//        Sample Input:
//
//        3
//        Zenit;3;Spartak;1
//        Spartak;1;CSKA;1
//        CSKA;0;Zenit;2
//        Sample Output:
//
//        Spartak:2 0 1 1 1
//        Zenit:2 2 0 0 6
//        CSKA:2 0 1 1 1

public class FootballTeams {
    private static Map<String, List<Integer>> map = new HashMap<>();

    private static void compareTeams(String s) {
        if (Integer.parseInt(s.split(";")[1]) > Integer.parseInt(s.split(";")[3])) {
            gotWin(s.split(";")[0]);
            gotLost(s.split(";")[2]);
        } else if (Integer.parseInt(s.split(";")[1]) < Integer.parseInt(s.split(";")[3])) {
            gotWin(s.split(";")[2]);
            gotLost(s.split(";")[0]);
        } else if (Integer.parseInt(s.split(";")[1]) == Integer.parseInt(s.split(";")[3])) {
            gotDraws(s.split(";")[0], s.split(";")[2]);
        }
    }

    private static void gotWin(String team) {
        map.get(team)
                .set(0, map.get(team)
                        .get(0) + 1);
        map.get(team)
                .set(1, map.get(team)
                        .get(1) + 1);
        map.get(team)
                .set(4, map.get(team)
                        .get(4) + 3);
    }

    private static void gotLost(String team) {
        map.get(team)
                .set(0, map.get(team)
                        .get(0) + 1);
        map.get(team)
                .set(3, map.get(team)
                        .get(3) + 1);
    }

    private static void gotDraws(String team1, String team2) {
        map.get(team1)
                .set(0, map.get(team1)
                        .get(0) + 1);
        map.get(team2)
                .set(0, map.get(team2)
                        .get(0) + 1);

        map.get(team1)
                .set(2, map.get(team1)
                        .get(2) + 1);
        map.get(team2)
                .set(2, map.get(team2)
                        .get(2) + 1);

        map.get(team1)
                .set(4, map.get(team1)
                        .get(4) + 1);
        map.get(team2)
                .set(4, map.get(team2)
                        .get(4) + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (!map.containsKey(s.split(";")[0])) {
                map.put(s.split(";")[0],new ArrayList<>(Arrays.asList(0,0,0,0,0)));
            }

            if (!map.containsKey(s.split(";")[2])) {
                map.put(s.split(";")[2],new ArrayList<>(Arrays.asList(0,0,0,0,0)));
            }
            compareTeams(s);
        }

        for (Map.Entry<String, List<Integer>> entry:map.entrySet()) {
            System.out.print(entry.getKey()+":");
            entry.getValue().forEach(x->System.out.print(x+" "));
            System.out.println();
        }
    }
}
