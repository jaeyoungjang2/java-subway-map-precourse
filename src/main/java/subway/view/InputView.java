package subway.view;

import java.util.Scanner;

public class InputView {

    public static String requireMain(Scanner scanner) {
        System.out.println("## 메인 화면");
        System.out.println("1. 역 관리");
        System.out.println("2. 노선 관리");
        System.out.println("3. 구간 관리");
        System.out.println("4. 지하철 노선도 출력");
        System.out.println("Q. 종료");
        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.nextLine();
    }

    public static String stationMain(Scanner scanner) {
        System.out.println("## 역 관리 화면");
        System.out.println("1. 역 등록");
        System.out.println("2. 역 삭제");
        System.out.println("3. 역 조회");
        System.out.println("B. 돌아가기");
        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.nextLine();
    }

    public static String registStation(Scanner scanner) {
        System.out.println("## 등록할 역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static void finishRegistStation() {
        System.out.println("[INFO] 지하철 역이 등록되었습니다.");
    }

    public static String deleteStation(Scanner scanner) {
        System.out.println("## 삭제할 역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String lineMain(Scanner scanner) {
        System.out.println("## 노선 관리 화면");
        System.out.println("1. 노선 등록");
        System.out.println("2. 노선 삭제");
        System.out.println("3. 노선 조회");
        System.out.println("B. 돌아가기");
        System.out.println();
        System.out.println("## 원하는 기능을 선택하세요.");
        return scanner.nextLine();
    }

    public static String registLine(Scanner scanner) {
        System.out.println("## 등록할 노선 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String registUpLine(Scanner scanner) {
        System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String registDownLine(Scanner scanner) {
        System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
        return scanner.nextLine();
    }

    public static String deleteLine(Scanner scanner) {
        System.out.println("## 삭제할 노선 이름을 입력하세요.");
        return scanner.nextLine();
    }
}
