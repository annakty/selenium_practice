public class MyClass {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        int [] numbers = {23,54,12,34,67,8,98,51};
        int numMax = findMax(numbers);
        System.out.println("Max num is - " + numMax);

        int [] numbers2 = {23,54,12,3,67,8,98,51,3345,23,0,-1,1231};
        int numMax2 = findMax(numbers2);
        System.out.println("Max num #2 is - " + numMax2);
    }

        /**
         * <word> - starting tag
         * </word> - closing tag
         *
         * <dependencies> - first tag that you need.
         * The dependencies are gathered in the pom. xml file, inside of a <dependencies> tag.
         * When you run a build or execute a maven goal, these dependencies are resolved,
         * and are then loaded from the local repository.
         *
         * pom is a xml file where we put all dependencies.
         */


        public static int findMax (int [] arr) {
            int max = arr[0];
            for (int i=1; i <arr.length; i++) {
                if (arr[i] > max) {
                    max=arr[i];
                }
            }

            return max;
    }
}
