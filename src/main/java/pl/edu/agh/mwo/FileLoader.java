package pl.edu.agh.mwo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

    public static List<Pitstop> loadPitstops(String fileName) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(new File(fileName));

        List<Pitstop> pitstops = new ArrayList<>();

        for (JsonNode node : root) {
            Pitstop pitstop = new Pitstop();

            pitstop.setSessionKey(node.get("session_key").asInt());
            pitstop.setMeetingKey(node.get("meeting_key").asInt());
            pitstop.setDate(node.get("date").asText());
            pitstop.setDriverNumber(node.get("driver_number").asInt());
            pitstop.setPitDuration(node.get("pit_duration").asDouble());
            pitstop.setLapNumber(node.get("lap_number").asInt());

            pitstops.add(pitstop);
        }

        return pitstops;
    }
}