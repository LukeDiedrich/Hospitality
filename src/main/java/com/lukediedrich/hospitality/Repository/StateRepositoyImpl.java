package com.lukediedrich.hospitality.Repository;

import com.lukediedrich.hospitality.StatesObjectMapper;
import com.lukediedrich.hospitality.model.RestResponse;
import com.lukediedrich.hospitality.model.State;
import com.lukediedrich.hospitality.model.StatesData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StateRepositoyImpl implements StateRepositoy
{
    List<State> states;

    public StateRepositoyImpl(){
        StatesObjectMapper mapper = new StatesObjectMapper();
        states = new ArrayList<>();
        try
        {
            StatesData StatesData;
            StatesData = mapper.readJsonWithObjectMapper();
            states.addAll(StatesData.getRestResponse().getResult());
        }
        catch (IOException e)
        {
            System.out.println("Failed read" + e);
        }

    }

    @Override
    public List<State> getAllStates(){
        return states;
    }

    @Override
    public State getStateByID(int id) {
        for (State state:states)
        {
            if(state.getId() == id){
                return state;
            }
        }
        return null;
    }

    @Override
    public void addState(State newState) {
        for (State state:states)
        {
            if(state.getId() == newState.getId()){
                return;
            }
        }
        states.add(newState);
    }
}
