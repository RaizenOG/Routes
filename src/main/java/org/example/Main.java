package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Feature;
import org.example.model.FeatureCollection;
import org.example.model.Node;
import org.example.model.Route;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FeatureCollection featureCollection =
                objectMapper.readValue(new File("C:\\Users\\ThePe\\Desktop\\map.json"), FeatureCollection.class);
        List<Route> routes = new ArrayList<>();
        for (Feature feature : featureCollection.getFeatures()) {
            Route route = new Route(feature.getProperties().getDescription(), feature.getGeometry().getCoordinates());
            routes.add(route);
        }
        List<Node> nodes = new ArrayList<>();

    }
}
