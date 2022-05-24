package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { //the type , place where store,the name of report files
                //"pretty",  used to print out additional information about the
                // scenario currently executed

                "html:target/cucumber-report.html",
                //generates default cucumber html report

                "rerun:target/rerun.txt",
                // generates rerun.txt for keep tracking of failed tests

                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
                //generates the "MAVEN CUCUMBER REPORTING"

        },
        features = "src/test/resources/features", //feature : where we pass feature files path
        // glue : where we pass step_definitions path

        glue = "com/cydeo/step_definitions", // glue : where we pass step_definitions path
        dryRun = false,
        //turn on and off our step_definition implementations running or not so we can easily generate snippet.
        tags = "@femaleScientists and @maleScientist",

       // mvn test - Dcucumber.options="--tags @femaleScientists and @maleScientist'",
        //create different scenario suites where we can include or exclude different scenarios.
         publish = false
        //true-generate a public link for the report of our final execution of our code

)
class CukesRunner {
}



//Background
//used to re-use the steps that are common in the same FEATURE FILE.
//only effective for the scenarios in the same feature file.

//Hooks
//create pre- and post- condition for ALL scenarios in our project.

//Parametrization
//being able to pass and change data directly from feature file

//dataTables
//COLLECTIONS TYPE OF DATA under the same STEP.
        //LIST MAP  LIST OF MAP  MAP OF MAP

//scenario outlines
//allows us to simplify the DDT (Data Driven Testing)
//by creating "Example:" tables under our "Scenario Outline:""
