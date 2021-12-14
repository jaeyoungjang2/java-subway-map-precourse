package subway.view;

import subway.domain.StationRepository;

public class OutputView {

    public static void printStationState(StationRepository stationRepository) {
        System.out.println(stationRepository.toString());
    }

    public static void finishDeleteStation() {
        System.out.println("[INFO] 지하철 역이 삭제되었습니다.");
    }
}
