package com.lukediedrich.Repository;

import java.util.List;

import com.lukediedrich.model.State;

public interface StateRepositoy
{
    List<State> getAllStates();

    State getStateByID(int id);

    void addState(State newState);
}
