package pl.edu.agh.mwo;

import java.util.List;

public class StartEndLaps {

    public String startStopLaps(List<Pitstop> pitStops) {

        if (pitStops == null || pitStops.isEmpty()) {
            return "Brak danych";
        }

        int firstLap = pitStops.get(0).getLapNumber();
        int lastLap = pitStops.get(0).getLapNumber();

        for (Pitstop pitStop : pitStops) {

            if (pitStop.getLapNumber() < firstLap) {
                firstLap = pitStop.getLapNumber();
            }

            if (pitStop.getLapNumber() > lastLap) {
                lastLap = pitStop.getLapNumber();
            }
        }

        return "Pierwszy pit stop: okrążenie "
                + firstLap
                + ", ostatni pit stop: okrążenie "
                + lastLap;
    }
}