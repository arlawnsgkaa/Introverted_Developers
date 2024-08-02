package Score;


public class Rank {

    public static String getrsRank(int score) {
        if (score >= 95) {
            return "A";
        } else if (score >= 90) {
            return "B";
        } else if (score >= 80) {
            return "C";
        } else if (score >= 70) {
            return "D";
        } else if (score >= 60) {
            return "F";
        } else {
            return "N";
        }
    }

    public static String getesRank(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score >= 50) {
            return "F";
        } else {
            return "N";
        }
    }
}
