package com.qa.challenge.runners;

import io.cucumber.junit.platform.engine.Cucumber;

@Cucumber
@io.cucumber.junit.platform.engine.CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.qa.challenge.steps",
    plugin = {
        "pretty",
        "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
    },
    monochrome = true
)
public class TestRunner {
}
