package subway.controller;

import java.util.Scanner;
import subway.view.InputView;

public class StationController {
    private final Scanner scanner;

    public StationController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        String main = InputView.stationMain(scanner);
        // ## 역 관리 화면
        // 1. 역 등록
        // 2. 역 삭제
        // 3. 역 조회
        // B. 돌아가기

    }
}
