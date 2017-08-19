Welcome, this is a project that showcases some features of Cucumber framework.  The example fictitious application that cucumber is testing
is about a "business proposition" web application, where users submit and register business ideas.

# Guidelines About a Feature
* @ Given(s) is precondition(s), creating object(s)
* @ When(s) changes state and/or manipulates outputs
* @ Then(s) asserts/verifies the state and/or output

# TODO list:
2. Add feature tagging

# Build
./mvn clean package

# Run tests
## Cucumber tests:
You can use "./mvn test" OR your IDE to run "CucumberTest" Junit like test.

NOTE:  For windows OS running tests from IntelliJ, need feature file to be using LF line separator (using CRLF (windows) causes parsing error)


# Run prod code
This isn't really necessary... but if you want to run the silly app standalone

./mvn spring-boot:run

or

java -jar target/cucumber-1.0-SNAPSHOT.jar

## REST service for default config
http://localhost:8080/echo

# References
* Decent intro article to Cucumber (and see it's subsections) http://toolsqa.com/cucumber/behavior-driven-development/
* Feature Reference https://github.com/cucumber/cucumber/wiki/Feature-Introduction
* Cucumber reference https://cucumber.io/docs/reference
* https://groups.google.com/forum/#!forum/cukes for general mailing list and topic support
