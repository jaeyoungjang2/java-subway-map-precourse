package subway.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Line {
    private String name;
    private List<Station> stations = new ArrayList<>();

    public Line(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public void addStation(String station) {
        stations.add(new Station(station));
    }

    @Override
    public String toString() {
        return name;
    }

    public void addStationByOrder(String stationName, Integer order) {
        stations.add(order, new Station(stationName));
    }

    public boolean deleteStationByName(String targetStation) {
        return stations.removeIf(station -> Objects.equals(station.getName(), targetStation));
    }
}
