package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static void addSectionByStationOrder(String lineName, String stationName, Integer order) {
        for (Line line : lines) {
            if (Objects.equals(line.getName(), lineName)) {
                line.addStationByOrder(stationName, order);
            }
        }
    }

    public static void deleteSectionByStation(String targetLine, String targetStation) {
        for (Line line : lines) {
            if (Objects.equals(line.getName(), targetLine)) {
                line.deleteStationByName(targetStation);
            }
        }
    }

    @Override
    public String toString() {
        String lineInfo = "";
        for (Line line : lines) {
            lineInfo += String.format("[INFO] %s%n", line.toString());
        }
        return lineInfo;
    }
}
