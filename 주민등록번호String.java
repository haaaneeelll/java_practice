package Chap_03;

public class 주민등록번호String {
    public static void main(String[] args) {
       String id = "901231-1234556";
        System.out.println(id. substring(0,8)); // 0 위치부터 8 위치 직전까지
        System.out.println(id.substring(0,id.indexOf("-")+2)); // 0 위치부터 하이픈 위치 +2 직전까지
        System.out.println(id.substring(0,id.indexOf("-")+2)); // 0 위치부터 하이픈 위치 +2 직전까지
    }
}
