package com.lukediedrich.service;

import com.lukediedrich.Repository.StateRepositoy;
import com.lukediedrich.model.State;

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

    
    public List<State> getAll()
    {
        return stateRepositoy.getAllStates();
    }
}
