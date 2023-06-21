package org.example.model;

import lombok.Data;

@Data
public class Route {

    private String description;

    private float[][] coordinates;

    public Route(String description, float[][] coordinates) {
        this.description = description;
        this.coordinates = coordinates;
    }
}
