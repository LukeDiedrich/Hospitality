package com.lukediedrich.hospitality.Repository;

import com.lukediedrich.hospitality.model.State;

import java.util.List;

public interface StateRepositoy
{
    List<State> getAllStates();

    State getStateByID(int id);

    void addState(State newState);
}
