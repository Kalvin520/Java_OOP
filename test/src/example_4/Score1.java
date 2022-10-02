package example_4;

public class Score1 {
    public static void main(String[] args) {
        int[] scores={88,81,74,68,78,76,77,85,95,93};

        for (int score:scores){
            System.out.printf("學生分數：%d %n",score);
        }


        int[][]cords={{1,2,3},{4,5,6}};
        for (var x=0;x<cords.length;x++){
            for (var y=0;y<cords[x].length;y++){
                System.out.printf("%2d",cords[x][y]);
            }
            System.out.println();
        }


    }
}
