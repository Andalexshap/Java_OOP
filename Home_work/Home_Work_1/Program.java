package Home_work.Home_Work_1;

import Home_work.Services.Game;
import Home_work.Services.Greeting;
import Home_work.Services.Teams;

public class Program {
    public static void main(String[] args) {
        var team1 = Teams.createTeam(10, 1);
        var team2 = Teams.createTeam(10, 2);

        System.out.println("Поприветствуем наши команды:");
        Greeting.greetingTeams(team1, 1);
        Greeting.greetingTeams(team2, 2);
        
        Game.StartGame(team1, team2);
    }
}
