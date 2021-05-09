import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClassTestNG {


    @Test
    public void helloWorld () {

        int [] numbers = {23,54,12,34,67,8,98,51};
        int numMax = findMax(numbers); //98
        //Assert.assertEquals(numMax,98);
        Assert.assertEquals(numMax,97, "Result is not as expected");
    }

    @Test
    public void helloAgain () {
        int [] numbers2 = {23,54,12,3,67,8,98,51,3345,23,0,-1,1231};
        int numMax2 = findMax(numbers2);
        Assert.assertEquals(numMax2,3345, "Result is not as expected");
    }


    public static int findMax (int [] arr) {
        int max = arr[0];
        for (int i=1; i <arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
        }

        return max;
    }

    /**
     * Do not need to create a main method. Instead of main method we create a Test  method ->
     * -> Add @Test to run a method (test cases).
     * Assert is a method when we try to do verification.
     */
}
