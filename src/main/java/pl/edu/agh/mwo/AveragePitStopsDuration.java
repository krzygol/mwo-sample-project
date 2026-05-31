package pl.edu.agh.mwo;

public class AveragePitStopsDuration {

    public double averagePitStopsDuration(List<PitStop> pitStops) {

        if (pitStops == null || pitStops.isEmpty()) {
            return 0.0;
        }

        double sum = 0;

        for (PitStop pitStop : pitStops) {
            sum += pitStop.getPitDuration();
        }

        return sum / pitStops.size();
    }
}
