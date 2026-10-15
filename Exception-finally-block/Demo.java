public class Demo {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int size=m+n;
        int arr[]=new int[size];

        int k=0;

        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0)
            arr[k++]=nums1[i];
        }

        for(int i=0;i<nums2.length;i++){
            if(nums2[i]!=0)
            arr[k++]=nums2[i];
        }

         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
    }

    public static void main(String[] args) {

        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        int m=3;
        int n=3;

        merge(nums1, m, nums2, n);


        
    }
}