package subway.controller;

import java.util.Scanner;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.InputView;
import subway.view.OutputView;

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
        if (main.equals("1")) {
            String station = InputView.registStation(scanner);
            StationRepository.addStation(new Station(station));
            InputView.finishRegistStation();
        }

        if (main.equals("2")) {
            String deleteStation = InputView.deleteStation(scanner);
            StationRepository.deleteStation(deleteStation);
            OutputView.finishDeleteStation();
        }

        if (main.equals("3")) {
            StationRepository stationRepository = new StationRepository();
            OutputView.printStationState(stationRepository);
        }


    }
}
