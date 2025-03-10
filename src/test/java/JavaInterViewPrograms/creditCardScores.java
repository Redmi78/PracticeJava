package JavaInterViewPrograms;

public class creditCardScores {
    public static void main(String args[]) {
        int creditCardScore = 399;
        if (creditCardScore < 400 || creditCardScore >850) {
            System.out.println("Credit card score is not valid");
        } else {
            if (creditCardScore >= 400 && creditCardScore < 600) {
                System.out.println("Silver card");
            } else if (creditCardScore >= 600 && creditCardScore < 800) {
                System.out.println("Gold card");
            } else  {
                System.out.println("Platinum card");
            }
        }
        }
    }
