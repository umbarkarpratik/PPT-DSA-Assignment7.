package PrePlacementTraning.AssingnmentString;

public class Que6 {
    public static boolean canShiftString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String concatenated = s + s;
        return concatenated.contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(canShiftString(s, goal));
    }
}
