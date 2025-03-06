package com.ericcode.eric_first_graphql_server;

import java.util.Arrays;
import java.util.List;

public record Park(Integer id,
                   String parkName,
                   String dateEstablished,
                   String area,
                   Boolean hasCamping) {

    public static List<Park> parks = Arrays.asList(
            new Park(1, "Acadia", "1919-02-26", "198.6", true),
            new Park(2, "American Samoa", "1988-10-31", "33.4", false)
    );
}
