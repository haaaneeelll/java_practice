package Chap_06;

public class 개인정보보호 {

public static String getHiddenData(String data, int index ) {
    String HiddenData = data.substring(0,index);// 나코딩 -> 나
    for (int i = 0; i < data.length() - index ; i++)
        HiddenData += "*"; // 나**
        return HiddenData;



    }

       // 비공개 적용}
    // 개인정보를 비공개로 전환하는 메소드 작성
    // 하나의 메소드에서 모든 동작 처리
    // 각 정보는 아래 위치부터 비공개 적용
    // 이름은 2번째 글자
    // 주민번호: 9번째 글자
    // 전화번호: 10번째 글자

    public static void main(String[] args) {
        String name = "나코딩"; // 이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData("나코딩", 1));
        System.out.println("주민등록번호 : " + getHiddenData("99130-1234567", 8));
        System.out.println("전화번호 : " + getHiddenData("010-1234-5678", 9));


    }
}
