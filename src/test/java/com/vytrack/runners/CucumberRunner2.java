package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber2.json"
        },
        features ={
                "src/test/resources/features/fleet"
        }, // content root path of features
        glue = "com/vytrack/step_definitions", // source root path of step definitions
        dryRun = false,
        tags = "",
        publish = true
)
public class CucumberRunner2 {
    // tags = "@s_o @with_two_columns",
    // scenario must have BOTH tags
    // @s_o @with_two_columns

    // tags = "@s_o or @with_two_columns"
    // scenario must have EITHER of tags
    // tags = "@s_o || @with_two_columns
    // | - single pipe checks both of conditions, || double pipe checks first matching
    // in Java ||, && but here and,or with words
}
