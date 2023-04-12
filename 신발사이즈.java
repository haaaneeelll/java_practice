package Chap_05;

public class 신발사이즈 {
    public static void main(String[] args) {
        int [] sizeArray = new int[10];
                //신발 사이즈는 250부터 295까지 5단위로 증가
        for (int i = 0 ; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }
        for (int size: sizeArray)  // for each로 배열의 값(sizeArray)를 int size로 정의...편하게
            {
            System.out.println("사이즈 " + size + " (재고있음)");
        }
    }
}
