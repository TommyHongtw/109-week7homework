public class test_p39 {
    public static void main(String[] args) 
    {
        int[] test; //declare a array which called test
        test=new int[5]; //this array has 5 space
        //int[]test=new int[5];
        test[0]=80;
        test[1]=60;
        test[2]=22;
        test[3]=50;
        test[4]=75;

        for(int i=0;i<5;i++)
        {
            System.out.println(i+"'s score is "+ test[i]);
        }
    }
}
