package subway;

import java.util.Scanner;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.view.InputView;
import subway.view.OutputView;

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

        if (lineMain.equals("1")) {
            String targetLine = InputView.registLine(scanner);
            String upLine = InputView.registUpLine(scanner);
            String downLine = InputView.registDownLine(scanner);
            Line line = new Line(targetLine);
            line.addStation(upLine);
            line.addStation(downLine);
            LineRepository.addLine(line);
            OutputView.finishRegistLine();
        }

        if (lineMain.equals("3")) {
            LineRepository lineRepository = new LineRepository();
            OutputView.printLineState(lineRepository.toString());
        }

        if (lineMain.equals("2")) {
            String targetLine = InputView.deleteLine(scanner);
            LineRepository.deleteLineByName(targetLine);
            OutputView.finishDeleteLine();
        }
    }
}
