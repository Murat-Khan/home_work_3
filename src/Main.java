import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] nums = {9.7, 56.3, -7.0, 6.0, -8.0, 5.9, 6.8,
                -23.23, -13.34, 42.6, -32.0, -78.65, 19.98, 75.5, -54.6};



        System.out.println("result: " + calculateMean(nums));
        System.out.println(Arrays.toString(sortArray(nums)));


        }


        public static double calculateMean(double[] nums){
            boolean find = false;
            double allNum = 0.0;
            int index = 0;
            for (double element: nums) {
                if (element < 0){
                    find = true;
                    continue;
                }


                if (find && element > 0){
                    index = index + 1;
                    allNum = allNum + element;
                }

            }

            return allNum / index;
        }

        public static double[] sortArray(double[] nums){
            for (int i = 0; i <nums.length ; i++) {

                double min = nums[i];
                int minId = i;
                for (int j = i + 1; j <nums.length ; j++) {
                    if (nums[j] < min){
                        min = nums[j];
                        minId = j;
                    }

                }
                double temp = nums[i];
                nums [i] = min;
                nums[minId] = temp;
            }

            return nums;
        }
    }
