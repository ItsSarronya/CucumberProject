package saro.fb.runner;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

/*This class describes the use of cucumber options*/

@RunWith(Cucumber.class)

// Generic
/* @Cucumber.Options() */

/*
 * >> 1 << Option : Feature - locates the feature file, Option : Glue - locates
 * step definition file
 */
 @Cucumber.Options(features = "feature/",glue = "stepDefinition")

/*
 * >> 2 << Option : Format Generating a HTML report
 */
/* @Cucumber.Options(features = "feature/",glue = "stepDefinition",format = {
 "html:target/cucumber" },tags = {"@PresenceCheck,@PageNavigation"})*/

/*
 * >> 3 << Option : Format Generating a Json report / Junit report
 */
// @Cucumber.Options(tags = {"@PageNavigation"},features = "feature/",glue =
// "stepDefinition",format = {
// "pretty","json:target/cucumber/json_report/cucumber.json"
// ,"junit:target/cucumber/junit_report/cucumber.xml"})

/* >> 4 << Runs Scenarios with Tag - @PageNavigation */
// @Cucumber.Options(features = "feature/",glue = "stepDefinition",format = {
// "pretty", "html:target/cucumber" },tags = {"@PageNavigation"})

/*
 * >> 5 << Runs Scenarios without Tag - @PageNavigation
 */
// @Cucumber.Options(features = "feature/",glue = "stepDefinition",format = {
// "pretty", "html:target/cucumber" },tags = {"~@PageNavigation"})
// @Cucumber.Options(tags = "not @PageNavigation")

/*
 * >> 6 << Runs Scenarios without Tag - @PageNavigation and with tag
 * BasicFunctionality
 */
/*
 * @Cucumber.Options(format = { "pretty", "html:target/cucumber" },tags =
 * {"@BasicFunctionality,~@PageNavigation"})
 */

/*
 * >> 7 << if you want to check whether all feature file steps have
 * corresponding step definitions
 */
 // @Cucumber.Options(dryRun=true) 

/* >> 8 << if you want console output from Cucumber in a readable format */
/* @Cucumber.Options(monochrome=true) */

public class FaceBook_Runner {

}
