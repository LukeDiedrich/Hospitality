package com.lukediedrich.hospitality.service;

import com.lukediedrich.hospitality.Repository.StateRepositoy;
import com.lukediedrich.hospitality.Repository.StateRepositoyImpl;
import com.lukediedrich.hospitality.model.State;

import java.util.List;

public class StateServiceImpl implements StateService
{

    private StateRepositoy stateRepositoy;

    public StateServiceImpl(StateRepositoy stateRepositoy){
        this.stateRepositoy = stateRepositoy;
    }

    public void setStateRepositoy(StateRepositoy stateRepositoy)
    {
        this.stateRepositoy = stateRepositoy;
    }

    @Override
    public List<State> getAll()
    {
        return stateRepositoy.getAllStates();
    }
}
