package subway;

import java.util.Scanner;
import subway.view.InputView;

public class LineController {
    private final Scanner scanner;

    public LineController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        // ## 노선 관리 화면
        // 1. 노선 등록
        // 2. 노선 삭제
        // 3. 노선 조회
        // B. 돌아가기
        String lineMain = InputView.lineMain(scanner);


    }
}
