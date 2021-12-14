package subway.view;

import subway.domain.StationRepository;

public class OutputView {

    public static void printStationState(StationRepository stationRepository) {
        System.out.println(stationRepository.toString());
    }
}
