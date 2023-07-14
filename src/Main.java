import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements !!!");
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the Array Elements !!!!");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the number of queries");
        int query=scanner.nextInt();

        int[][] queries=new int[query][2];
        System.out.println("Enter the respective start and end of each queries !!!");
        for(int i=0;i<query;i++){
            for(int j=0;j<2;j++){
                queries[i][j]=scanner.nextInt();
            }
        }

        int result[]=EvenNumbers(queries,array,size,query);

        System.out.println("Output !!!!");
        for(int i:result){
            System.out.print(i+" ");
        }

    }

    private static int[] EvenNumbers(int[][] queries, int[] array, int size, int query) {
        int result[]=new int[query];
        while(query>0){

            int start=queries[query-1][0];
            int end=queries[query-1][1];
            int count=0;
            for(int i=start;i<=end;i++){
                if(array[i]%2==0){
                    count++;
                }
            }
            result[query-1]=count;
            query--;
        }
        return result;
    }

}