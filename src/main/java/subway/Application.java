package subway;

import java.util.Scanner;
import subway.controller.StationController;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.InputView;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        StationController stationController = new StationController(scanner);
        initStation();

        String mainSelect = InputView.requireMain(scanner);
        if (mainSelect.equals("1")) {
            stationController.run();
        }
    }

    private static void initStation() {
        StationRepository.addStation(new Station("교대역"));
        StationRepository.addStation(new Station("강남역"));
        StationRepository.addStation(new Station("역삼역"));
        StationRepository.addStation(new Station("남부터미널역"));
        StationRepository.addStation(new Station("양재역"));
        StationRepository.addStation(new Station("양재시민의숲역"));
        StationRepository.addStation(new Station("매봉역"));
    }
}
