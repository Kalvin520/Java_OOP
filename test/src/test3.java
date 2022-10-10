class test3 {
    public static void main(String[] args) {
        int[] num = {10,20,30};
        for (int i = 0; i < 4; i++){
            try{
                System.out.print("num :" + num[i]);
                System.out.println(" : 第" + (i + 1) + "次的迴圈");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("例外發生!");
            }
        }
        System.out.println("--end--");
    }
}