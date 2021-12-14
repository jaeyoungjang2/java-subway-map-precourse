package subway;

import java.util.Scanner;
import subway.controller.StationController;
import subway.view.InputView;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        StationController stationController = new StationController(scanner);


        String mainSelect = InputView.requireMain(scanner);
        if (mainSelect.equals("1")) {
            stationController.run();
        }
    }
}
