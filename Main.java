import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    stringArray();

    }
    static void stringArray(){
        //Mang String
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tủ cho mang: ");
        int sum=0;
        int sum1=0;
        int temp;
        int size =sc.nextInt();
        int strArray[]= new int[size];
        for (int i=0; i<strArray.length;i++){
            System.out.println("Nhập phần tử ở ví trí:" +i);
            strArray[i]=sc.nextInt();
        }
//        System.out.println("Đây là mảng");
//        for (int i=0;i<strArray.length;i++){
//            System.out.println(strArray[i]);
//            show(size);
//        }
        show(strArray);
        System.out.println("Phần tủ ở vị trí index số 2 là: "+strArray[2]);
        for (int i=0;i<strArray.length;i++){
            sum=sum+strArray[i];
        }
        System.out.println("Tổng các phần tủ trong mảng là: "+sum);
        for(int i=0;i<strArray.length;i++){
            if (strArray[i]%2==0){
                System.out.println("Các số chẵn trong mảng: "+ i);
                sum1=sum1+strArray[i];
            }
        }
            System.out.println("Tổng các số chẵn trong mảng= "+ sum1);
        for(int i=0; i<strArray.length;i++){
            for(int j=i+1;j<strArray.length;j++){
                if (strArray[i]>strArray[j]){
                    temp=strArray[i];
                    strArray[i]=strArray[j];
                    strArray[j]=temp;
                }
            }
        }
        System.out.println("Sắp xếp lại mảng như sau:");
        System.out.println("Đây là mảng");
        for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }
}

public static void show(int [] arr){
    System.out.println("Đây là mảng");


    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}

    }

