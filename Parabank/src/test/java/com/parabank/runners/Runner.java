package com.parabank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.parabank.stepDefinitions",
        tags = "@Transferir",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
