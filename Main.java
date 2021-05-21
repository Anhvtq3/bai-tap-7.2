import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
bai1();
    }
    static void bai1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của hàng: ");
        int row=scanner.nextInt();
        System.out.print("Nhập số phần tử của cột: ");
        int cloum=scanner.nextInt();

        int [][] A= new int[row][cloum];
        int [][] B = new int[row][cloum];
        for(int i=0;i<row;i++){
            for (int j=0; j<cloum;j++){
                System.out.printf("Nhập số phần tử mảng A ở ví trí  A[%d][%d]:", i, j);
                A[i][j]= scanner.nextInt();

            }
        }
        show(A);
        for(int i=0;i<row;i++){
            for (int j=0; j<cloum;j++){
                System.out.printf("Nhập số phần tử Mảng B ở ví trí  B[%d][%d]:", i, j);
                B[i][j]= scanner.nextInt();

            }
        }
        show(B);

        int [][] C = new int[row][cloum];
        for(int i=0;i<row;i++){
            for (int j=0; j<cloum;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.printf("Phần tử mảng C= A+B ở ví trị C[%d][%d]: %d",i,j,C[i][j]);
            }
        }
        show(C);
        int [][] chuyenviA = new int[cloum][row];
        for (int i=0;i<row;i++){
            for(int j=0;j<cloum;j++){
                chuyenviA[j][i]=A[i][j];
                System.out.printf(" chuyenviA[%d][%d]: %d",i,j,chuyenviA[i][j]);
            }
        }
        show(chuyenviA);
        int [][] chuyenviB = new int[cloum][row];
        for (int i=0;i<row;i++){
            for(int j=0;j<cloum;j++){
                chuyenviB[j][i]=B[i][j];
                System.out.printf("chuyenviB[%d][%d]: %d",i,j,chuyenviB[i][j]);
            }
        }
        show(chuyenviB);
    }
    static void bai2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của hàng: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số phần tử của cột: ");
        int cloum = scanner.nextInt();

        int[][] AB = new int[row][cloum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cloum; j++) {
                System.out.printf("Nhập số phần tử mảng A ở ví trí  A[%d][%d]:", i, j);
                AB[i][j] = scanner.nextInt();

            }
        }
    }
    static void show(int[][] matran){
        System.out.println("Hiển thị ma trận vừa nhập: ");

        for(int i=0;i<matran.length;i++){
            for (int j=0; j<matran[i].length;j++){
                System.out.print(matran[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
