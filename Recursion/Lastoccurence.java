public class Lastoccurence {

    public static int lastoccur(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastoccur(arr,key,i+1);
        if (isfound == -1 && arr[i] == key){
            return i;
        }

        return isfound;
    }

    public static void main(String[] args){
        int arr[] = {2,3,4,5,6,7,9,1};
        int key = 9;
        System.out.println(lastoccur(arr,9,0));

    }
    
}
