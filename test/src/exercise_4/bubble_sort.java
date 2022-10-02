package exercise_4;

public class bubble_sort {
    public static void main(String[] args) {
        int[] numbers={70,80,31,37,10,1,48,60,33,80};
        var flag = true;

        for (var i = 0; i < numbers.length-1 && flag; i++){
            flag=false;
            for (var j = 0; j < numbers.length - i - 1; j++){
                if (numbers[j+1] < numbers[j]){
                    //bubble sort
                    int temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                    flag = true;
                }
            }
        }
        for (var number : numbers){
            System.out.printf("%3d",number);
        }
    }
}
