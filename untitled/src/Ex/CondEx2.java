package Ex;

public class CondEx2 {
    public static void main(String[] args) {
        int distance = 1000;
        String status;

        if (distance <= 1) {
            status = "도보";
        } else if (distance <= 10) {
            status = "자전거";
        } else if (distance <= 100) {
            status = "자동차";
        } else {
            status = "비행기";
        }
        System.out.println("distance : " + distance);
        System.out.println("출력: " + status + "를 이용하세요.");

    }
}
