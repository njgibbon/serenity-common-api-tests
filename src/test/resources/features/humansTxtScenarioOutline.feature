@humansTxtScenarioOutlineTest

Feature: Humans.txt Scenario Outline

    Tests against the humans.txt file of several popular websites.

    Scenario Outline: Check various websites humans.txt endpoint
    Hitting the humans.txt on google and doing some metadata and content verifications with very generic reusable steps.

        Given The correct baseURI <baseURI>
        When I get the endpoint <endpointPath>
        Then I should get a <statusCode> status code
        Then I should get a <contentType> content type
        Then The response should contain <contentToSearch>

    Examples:

        | baseURI                 | endpointPath | statusCode | contentType | contentToSearch                                |
        | https://www.google.com  | humans.txt   | 200        | text        | "Google is built by a large team of engineers" |
        | https://www.netflix.com | humans.txt   | 200        | text        | "An all-star cast of talented"                 |
        | https://www.medium.com  | humans.txt   | 200        | text        | "you are a nerd"                               |







