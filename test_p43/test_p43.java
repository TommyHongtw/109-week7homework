public class test_p43 {
    public static void main(String[] args) 
    {
        int[] test={80,60,22,50,75}; //declare a array which called test

        for(int i=0;i<test.length;i++) //test.length can get length of test
        {
            System.out.println((i+1)+"'s score is "+ test[i]);
        }
        System.out.println("Number of attended this test is "+test.length);
    }
}
