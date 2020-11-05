import java.lang.reflect.Array;

public class test_p40 {
    public static void main(String[] args) 
    {
        //other type for array
        int[] inArray = (int[]) Array.newInstance(int.class,3); //(type,length)
        Array.set(inArray,0,123); 
        Array.set(inArray,1,456);
        Array.set(inArray,2,789);

        System.out.println("inArray[0]="+ Array.get(inArray,0));
        System.out.println("inArray[1]="+ Array.get(inArray,1));
        System.out.println("inArray[2]="+ Array.get(inArray,2));
    }
}
