#serenity-common-api-tests

##description

This project will be a series of experiements for Automated Testing using BDD in Java. 
There will be several seperate Test Suites which can be ran in isolation.
Each Suite should deal with some different common aspects of Functional Automation Testing against APIs.

##background

In each I want to deal with some common problems and arrive at good-practise minimal solutions so that they should also have practical benefits for commercial projects in terms of re-use and reference material. 
All will be ran through a BDD framework. Serenity is chosen for the advanced Reporting. 
I want to continually iterate new features as I learn and have different ideas. So this will always be a work in progress.

##sister-projects

I want to replicate these suites in other projects using SoapUI and JUnit without Cucumber. 
Partly to learn and partly to further the value of the project. 
//TODO: put repo links here once done

##primary technology

**Java**, **Maven**, **Serenity**, **RestAssured**
but ofcourse look at the pom for details. 

##resources

I want to try to output all of the resources that help me along the journey so please take a look in the 'resources' section at the bottom. 

#1) Humans.txt Standard Tests

##test suite description

Using a Standard gherkin syntax execute some get requests against the /humans.txt path of various sites. 
Verify the status code and content type. Then perform some unstructured content verification by checking that the content contains some specified string value. 
All steps should be generic. 

##files of interest

Feature: src/test/resources/features/humansTxtStandard.feature
Runner: src/test/java/njgibbon/test/serenity/api/runners/HumansTxtStandardTestSuite.java
Steps: src/test/java/njgibbon/test/serenity/api/steps/CommonApiSteps.java

##test command

```
mvn -DtestSuite=HumansTxtStandardTestSuite serenity:aggregate clean verify
```

##output

Site: target/site/serenity/index.html
JUnite: target/cucumber.xml
![suite 1 pass report](/images/suite1PassResport.png)

#resources

##base

My starting point was the Rest Starter which is a base for API Testing using RestAssured and Serenity. 
Serenity BDD: https://github.com/serenity-bdd
Serenity BDD Rest Starter: https://github.com/serenity-bdd/serenity-rest-starter

Markdown help:
https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet
https://www.makeareadme.com/

CucumberOptions: https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/

Environment property parameterisation:
https://stackoverflow.com/questions/3868310/how-can-i-change-a-properties-file-in-maven-depending-on-my-profile

