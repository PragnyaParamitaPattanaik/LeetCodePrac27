import com.sun.tools.javac.Main;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[]={3,2,2,3};
        int val=3;
        System.out.println(RemoveElement(nums,val));

    }
    static int RemoveElement(int nums[],int val) {
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
         nums[count]=nums[val];
         count++;
        }
    }
    return count;

    }
}
