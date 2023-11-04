import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final int 
            MONSOON = 100, 
            SUMMER = 200;
        Scanner input = new Scanner(System.in);
        int caseCount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < caseCount; i++) {
            int treeHeight = 1;
            int cycleType = MONSOON;
            int cycleCount = Integer.parseInt(input.nextLine());
            for (int j = 0; j < cycleCount; j++) {
                switch (cycleType) {
                case MONSOON:
                    treeHeight = treeHeight * 2;
                    cycleType = SUMMER;
                    break;
                case SUMMER:
                    treeHeight += 1;
                    cycleType = MONSOON;
                    break;
                }
            }
            System.out.println(treeHeight);
        }
    }
}
