package pl.edu.agh.mwo;

import java.util.List;

public class PitStopCounter {

    public int countPitStops(List<PitStop> pitStops) {

        if (pitStops == null) {
            return 0;
        }

        return pitStops.size();
    }
}
