package com.champsoft.vrms.cars.domain.model;

public record VehicleSpecs(String make, String model, int year) {
    public VehicleSpecs{
        if(make == null || make.trim().isEmpty()) throw new IllegalArgumentException("Make is required");
        if(model == null || model.trim().isEmpty()) throw new IllegalArgumentException("Model is required");
        if (year < 1980) throw new IllegalArgumentException("Year must be between 1980 and 2050");
    }
}
