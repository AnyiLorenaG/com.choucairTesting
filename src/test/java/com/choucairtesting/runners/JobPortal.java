package com.choucairtesting.runners;

import com.choucairtesting.utils.FeatureLocation;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = FeatureLocation.JOBS,
        glue = FeatureLocation.GLUE,
        snippets = SnippetType.CAMELCASE)

public class JobPortal {
}
