package com.lukediedrich.hospitality;

import com.lukediedrich.hospitality.Repository.StateRepositoy;
import com.lukediedrich.hospitality.model.State;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/states")
public class StateResource
{

//    @Autowired
//    private StateRepositoy stateRepository;
//
//    @GET
//    @Path("/{id}")
//    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//    public State getEmployee(@PathParam("id") int id)
//    {
//        return stateRepository.(id);
//    }
//
//    @POST
//    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//    public RestResponse addEmployee(State state, @Context UriInfo uriInfo)
//    {
//        stateRepository.addState(new State(state.getId(),state.getCountry(),state.getAbbr(), state.getArea(),state.getLargestCity(),
//                                           state.getCapital()));
//
//        return RestResponse.status(RestResponse.Status.CREATED.getStatusCode()).header("Location",
//                                                                               String.format("%s/%s",
//                                                                                             uriInfo.getAbsolutePath().toString(),
//                                                                                             state.getId())).build();
//    }

}
