package com.pchen.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@WebServlet("/DemoServlet")
@Path("/")
public class Api extends HttpServlet {

    @GET
    public Response test() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("Alex", 22);
        String json = objectMapper.writeValueAsString(user);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }
}