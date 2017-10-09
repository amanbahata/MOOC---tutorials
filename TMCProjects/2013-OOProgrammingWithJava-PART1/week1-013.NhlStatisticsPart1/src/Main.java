
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println();
        NHLStatistics.searchByPlayer("Sydney Crosby");
        System.out.println();
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        System.out.println();
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();

    }
}
