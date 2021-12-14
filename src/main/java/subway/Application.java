package subway;

import java.util.Scanner;
import subway.controller.StationController;
import subway.view.InputView;

public class Application {
    public static void main(String[] args) {
        StationController stationController = new StationController();
        final Scanner scanner = new Scanner(System.in);

        String mainSelect = InputView.requireMain(scanner);

    }
}
