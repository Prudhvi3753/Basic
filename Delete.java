public class Delete {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int a=2;
        for(int i=a;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]);
        }
    }
    
}