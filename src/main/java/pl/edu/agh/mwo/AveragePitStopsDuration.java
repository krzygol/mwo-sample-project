package pl.edu.agh.mwo;

import java.util.List;

public class AveragePitStopsDuration {

    public double averagePitStopsDuration(List<Pitstop> pitStops) {

        if (pitStops == null || pitStops.isEmpty()) {
            return 0.0;
        }

        double sum = 0;

        for (Pitstop pitStop : pitStops) {
            sum += pitStop.getPitDuration();
        }

        return sum / pitStops.size();
    }
}
