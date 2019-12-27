package com.Bookit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "\\Users\\basak\\IdeaProjects\\Marufcan_Bookit\\src\\test\\resources\\features\\login.feature",
        glue = "com/Bookit/step_Definitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunners {
}


