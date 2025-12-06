public class RemoveDuplicate {

    public static int[] removeDuplicates(int[] a){

        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(a.length < 2){
            return a;
        }
        while(i < a.length){
            if(a[i] == a[j]){
                i++;
            }else{
                a[++j] = a[i++];
            }
        }
        int[] b = new int[j+1];
        for(int k=0; k<b.length; k++){
            b[k] = a[k];
        }

        return b;
    }

    public static void main(String a[]){
        int[] a1 = {2,3,6,6,8,9,10,10,10,12,12};
        int[] b = removeDuplicates(a1);
        for(int i:b){
            System.out.print(i+" ");
        }
    }
}
