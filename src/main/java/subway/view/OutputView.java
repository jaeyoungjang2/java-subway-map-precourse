package subway.view;

import subway.domain.StationRepository;

public class OutputView {

    public static void printStationState(StationRepository stationRepository) {
        System.out.println(stationRepository.toString());
    }

    public static void finishDeleteStation() {
        System.out.println("[INFO] 지하철 역이 삭제되었습니다.");
    }

    public static void finishRegistLine() {
        System.out.println("[INFO] 지하철 노선이 등록되었습니다.");
    }

    public static void printLineState(String toString) {
        System.out.println("## 역 목록");
        System.out.println(toString);
    }

    public static void finishDeleteLine() {
        System.out.println("[INFO] 지하철 노선이 삭제되었습니다.");
    }

    public static void finishRegistSection() {
        System.out.println("[INFO] 구간이 등록되었습니다.");
    }
}
