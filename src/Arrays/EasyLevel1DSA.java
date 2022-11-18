package Arrays;

public class EasyLevel1DSA {
    // public class NewtonSchool {
        public static void main(String[] args) {
            int[] arr={2,1,2,3,3,4,4,4};
            int max=Integer.MIN_VALUE;
            // int max1=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if (max<arr[i])
                    max = arr[i];
            }
//            for (int i=0;i< arr.length;i++){
//                if (max!=arr[i])
//                    max1=arr[i];
//            }
//            System.out.println(max1);
        }
    // }
}
