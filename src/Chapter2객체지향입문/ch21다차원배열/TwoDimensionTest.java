package Chapter2객체지향입문.ch21다차원배열;

/**
 * TwoDimensionTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class TwoDimensionTest {
    public static void main(String[] args){

        int [][] arr = {{1,2,3}, {1,2,3,4}};
        int i,j;

        for(i = 0; i < arr.length; i++){
            for(j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("\t"+ arr[i].length);
        }
    }
}
