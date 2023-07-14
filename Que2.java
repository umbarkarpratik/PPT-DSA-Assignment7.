package PrePlacementTraning.AssingnmentString;

public class Que2 {
    public static boolean isStrobogrammatic(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left <= right) {
            char cLeft = num.charAt(left);
            char cRight = num.charAt(right);

            if (cLeft == '0' && cRight == '0' ||
                    cLeft == '1' && cRight == '1' ||
                    cLeft == '8' && cRight == '8' ||
                    cLeft == '6' && cRight == '9' ||
                    cLeft == '9' && cRight == '6') {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String num = "69";
        System.out.println(isStrobogrammatic(num));
    }
}
