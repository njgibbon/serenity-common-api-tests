@humansTxtStandardTest
Feature: Humans.txt Standard

    Tests against the humans.txt file of several popular websites.

    Scenario: Check google humans.txt endpoint
    Hitting the humans.txt on google and doing some metadata and content verifications with very generic reusable steps.

        Given The correct baseURI https://www.google.com
        When I get the endpoint humans.txt
        Then I should get a 200 status code
        Then I should get a text content type
        Then The response should contain "Google is built by a large team of engineers"

    Scenario: Check netflix humans.txt endpoint
    Hitting the humans.txt on netflix and doing some metadata and content verifications with very generic reusable steps.

        Given The correct baseURI https://www.netflix.com
        When I get the endpoint humans.txt
        Then I should get a 200 status code
        Then I should get a text content type
        Then The response should contain "An all-star cast of talented"

    Scenario: Check medium humans.txt endpoint
    Hitting the humans.txt on medium and doing some metadata and content verifications with very generic reusable steps.

        Given The correct baseURI https://www.medium.com
        When I get the endpoint humans.txt
        Then I should get a 200 status code
        Then I should get a text content type
        Then The response should contain "you are a nerd"




