package com.qa.challenge.api;

import com.intuit.karate.junit5.Karate;

public class ApiTestRunner {

    @Karate.Test
    Karate testApi() {
        return Karate.run("login").relativeTo(getClass());
    }
}
