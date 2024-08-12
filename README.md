

<h1 align="center">CucumberHybridFramework</h1>

<h2 align="center">Introduction to Cucumber-Selenium Project for "Tutorials Ninja" Demo Site.</h2>

Overview
------------
In this project, we aim to leverage Cucumber and Selenium WebDriver to automate the acceptance testing for the **"Tutorials Ninja"** demo site. The **"Tutorials Ninja"** site is a demo e-commerce platform that showcases various products and functionalities, making it an ideal candidate for testing different aspects of a web application, such as **Login, Register, product search**.

Objectives
------------

- **Automate Acceptance Tests:**  Develop automated tests to verify the functionality of the website's key features.
  
- **Ensure Consistency:**  Confirm that the site's features work as expected across different browsers and environments.
  
- **Improve Test Efficiency:**  Reduce manual testing effort and increase test coverage by automating test scenarios.

Tools and Technologies
-----------------------
- **Cucumber:** A tool for behavior-driven development (BDD) that allows writing test cases in a natural language format. It helps in defining application behavior in a way that is easily understandable by non-technical stakeholders.
  
- **Selenium WebDriver:** A browser automation tool that enables interaction with the web application's user interface. It supports multiple browsers and provides a robust framework for automating web application tests.
  
- **TestNG:** Testing frameworks used in conjunction with Selenium to run and manage test cases.
  
- **Maven:** Build automation tools that manage project dependencies and build processes.
  
- **Gherkin:** The language used by Cucumber to write test scenarios in a Given-When-Then format.

Project Structure
------------------

- **Feature Files:** Written in Gherkin, these files describe the behavior of the application from an end-user perspective. 
     They are stored in the **src/test/resources/features** directory and contain scenarios and steps that outline the expected behavior.

- **Step Definitions:** Java classes that implement the steps defined in the feature files. They are located in the **src/test/java/stepDefinitions** directory and contain the code to interact with the web application using Selenium WebDriver.

- **Page Objects:** Classes representing the pages of the web application. They encapsulate the interactions with the web elements and help in organizing the test code. These are found in the **src/test/java/pageObjects** directory.

- **Test Runner:** A class responsible for running the Cucumber tests. It is configured to specify which feature files and step definitions to use, and it can be found in the **src/test/java/runner** directory.

- **Configuration Files:** Files that define the test environment and other settings. For example, config.properties file may be used to configure the test execution environment-specific variables such as browser settings, URLs, and timeouts, are easily configurable and consistently applied throughout the test framework.


Example Scenarios
------------------

**User Login :** 

- **Valid Credentials:** Test logging in with valid credentials and verify that the user is redirected to the appropriate page, such as the account dashboard or homepage.

- **Invalid Credentials:** Test logging in with incorrect credentials to ensure that the system displays an appropriate error message and does not grant access.

- **Empty Fields:** Ensure that the system handles cases where the login form is submitted with empty fields.


**User Registration:** 

- **Successful Registration:** Test registering a new user with valid details and confirm that the user receives a confirmation message and can log in using the new credentials.

- **Duplicate Registration:** Verify that the system handles attempts to register with an email address that is already in use.

- **Invalid Input:** Ensure that the system validates user input correctly, such as requiring a valid email format and strong password requirements.


**Search Product:** 

- **Search Valid Product:** Validate that the search functionality returns the correct product(s) when a valid product name is entered. The product(s) returned should match the search query precisely.

- **Search Invalid Product:** Validate that the search functionality returns the appropriate warning message to the user when an invalid product name is entered.

- **Search Invalid Product:** Validate that the search functionality displays an appropriate error message or prompt to the user, preventing the search action from being executed.

Benefits
---------

- **Improved Communication:** The use of Gherkin allows both technical and non-technical team members to understand and contribute to the test scenarios.

- **Reusable Steps:** Step definitions can be reused across different scenarios, promoting code reuse and maintenance.

- **Automated Regression Testing:** Automated tests can be run frequently to catch regressions early, improving software quality and stability.


Questions / Contact / Contribute
---------------------------------
Feel free to fork this repo, add to it, and create a pull request if you like to contribute.  

If you have any questions, you can contact me via email: `thorata89@gmail.com`




