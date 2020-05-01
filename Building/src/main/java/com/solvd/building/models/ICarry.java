package com.solvd.building.models;

import com.solvd.building.models.exceptions.CannotCarryException;

public interface ICarry {

    public void carry(Float cargoCapacity, float t) throws CannotCarryException;
}
