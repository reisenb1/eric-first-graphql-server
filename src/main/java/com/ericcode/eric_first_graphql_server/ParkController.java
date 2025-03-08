package com.ericcode.eric_first_graphql_server;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ParkController {

    @QueryMapping
    public List<Park> parks() {
        return Park.parks;
    }
}
