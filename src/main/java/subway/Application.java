package subway;

import java.util.Scanner;
import subway.controller.StationController;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.InputView;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        StationController stationController = new StationController(scanner);
        initStation();
        initLine();

        String mainSelect = InputView.requireMain(scanner);
        if (mainSelect.equals("1")) {
            stationController.run();
        }
    }

    private static void initLine() {
        //- 2호선: 교대역 - 강남역 - 역삼역
        //- 3호선: 교대역 - 남부터미널역 - 양재역 - 매봉역
        //- 신분당선: 강남역 - 양재역 - 양재시민의숲역
        Line line = new Line("2호선");
        line.addStation("교대역");
        line.addStation("강남역");
        line.addStation("역삼역");
        LineRepository.addLine(line);

        line = new Line("3호선");
        line.addStation("교대역");
        line.addStation("남부터미널역");
        line.addStation("양재역");
        line.addStation("매봉역");
        LineRepository.addLine(line);

        line = new Line("신분당선");
        line.addStation("강남역");
        line.addStation("양재역");
        line.addStation("양재시민의숲역");
        LineRepository.addLine(line);
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
