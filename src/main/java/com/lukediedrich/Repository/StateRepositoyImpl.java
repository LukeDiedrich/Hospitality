package com.lukediedrich.Repository;

import com.lukediedrich.hospitalityApp.StatesObjectMapper;
import com.lukediedrich.model.RestResponse;
import com.lukediedrich.model.State;
import com.lukediedrich.model.StatesData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StateRepositoyImpl implements StateRepositoy
{
    List<State> states;

    public StateRepositoyImpl(){
        StatesObjectMapper mapper = new StatesObjectMapper();
        states = new ArrayList<State>();
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

    
    public List<State> getAllStates(){
        return states;
    }

    
    public State getStateByID(int id) {
        for (State state:states)
        {
            if(state.getId() == id){
                return state;
            }
        }
        return null;
    }

    
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
