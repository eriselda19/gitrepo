package src.CollectionFramework;

public class SortingAlgorithm {
    public static void selectionSort( int num[],int size){

        for(int i=0; i<size; i++){
            for(int j=i+1;j<size; j++){
                if(num[j]<num[i]){
                    int temp=num[i];
                    num[i]=num[j];
                    num[j] =temp;}
            }
        }
    }
    public static void main(String[] args) {
        int num []={4,1,8,9,3,2,6};
        System.out.println("Before sorting");
        for(int n: num){
            System.out.println(n+ " ");
        }
        selectionSort(num,num.length);
        System.out.println("");
        System.out.println("After sorting");
        for(int n: num){
            System.out.println(n+ " ");
        }
    }
}
