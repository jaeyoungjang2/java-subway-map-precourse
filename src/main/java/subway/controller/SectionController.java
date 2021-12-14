package subway.controller;

import java.util.Scanner;
import subway.domain.LineRepository;
import subway.view.InputView;
import subway.view.OutputView;

public class SectionController {
    private final Scanner scanner;

    public SectionController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        // ## 구간 관리 화면
        // 1. 구간 등록
        // 2. 구간 삭제
        // B. 돌아가기
        String sectionInfo = InputView.sectionMain(scanner);
        if (sectionInfo.equals("1")) {
            String targetLine = InputView.registSectionLine(scanner);
            String targetStation = InputView.registSectionStation(scanner);
            String order = InputView.sectionTargetStationOrder(scanner);
            LineRepository.addSectionByStationOrder(targetLine, targetStation, Integer.parseInt(order));
            OutputView.finishRegistSection();
        }

        if (sectionInfo.equals("2")) {
            String targetLine = InputView.deleteSectionLine(scanner);
            String targetStation = InputView.deleteSectionStation(scanner);
            LineRepository.deleteSectionByStation(targetLine, targetStation);
        }
    }
}
