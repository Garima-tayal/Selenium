🚀 Project Title & Tagline
-------------------------

### Amazon Html Selectors

📖 Description
--------------

Amazon Html Selectors is a Java Spring Boot (Maven) project that uses Selenium WebDriver to automate web browser interactions and extract data from Amazon's HTML pages. This project showcases various features of Selenium WebDriver, including web element locating, clicking, and verifying the presence of elements.

The project consists of several Java classes and CSS files that work together to extract and process data from Amazon's web pages. The project uses TestNG for unit testing and Maven for building and managing the project.

✨ Features
------------

### 1. Web Element Locating

* Uses Selenium's By class to locate web elements by ID, class, name, and other attributes.
* Demonstrates how to use Selenium's findElement and findElements methods to retrieve and interact with web elements.

### 2. Web Element Clicking

* Shows how to use Selenium's click method to simulate a click on a web element.
* Demonstrates how to use Selenium's getAttribute method to retrieve the value of an attribute of a web element.

### 3. Web Element Verification

* Uses Selenium's isDisplayed method to verify if a web element is displayed on the page.
* Demonstrates how to use Selenium's isEnabled method to verify if a web element is enabled.

### 4. Web Page Navigation

* Shows how to use Selenium's navigate method to navigate to a specific web page.
* Demonstrates how to use Selenium's getTitle method to retrieve the title of a web page.

### 5. Handling Cookies

* Uses Selenium's getCookie method to retrieve a cookie from a web page.
* Demonstrates how to use Selenium's deleteCookie method to delete a cookie from a web page.

### 6. Handling Windows

* Shows how to use Selenium's getWindowHandles method to retrieve the handles of multiple windows.
* Demonstrates how to use Selenium's switchTo method to switch between multiple windows.

### 7. Handling Frames

* Uses Selenium's frame method to switch to a specific frame.
* Demonstrates how to use Selenium's defaultContent method to switch back to the default content of a frame.

### 8. Handling Alerts

* Shows how to use Selenium's switchTo method to switch to an alert.
* Demonstrates how to use Selenium's dismiss method to dismiss an alert.

🧰 Tech Stack Table
--------------------

| Technology | Version |
| --- | --- |
| Java | 1.8 |
| Spring Boot | 2.3.0 |
| Selenium WebDriver | 4.0.0 |
| TestNG | 7.1.0 |
| Maven | 3.6.0 |
| EdgeDriver | 84.0.0 |

📁 Project Structure
--------------------

### `src/main/java`

* `com.garima.project`: Contains the Java classes for the project, including the AmazonHtmlSelectors class.
* `testng-reports`: Contains the CSS files for the TestNG reports.
* `testng-reports1`: Contains the CSS files for the TestNG reports.
* `testng-reports2`: Contains the JavaScript files for the TestNG reports.

### `src/test/java`

* `com.garima.project`: Contains the Java classes for the unit tests, including the AppTest class.

⚙️ How to Run
--------------

### Setup

* Install Java 1.8 or later on your system.
* Install Maven 3.6.0 or later on your system.
* Install Selenium WebDriver 4.0.0 or later on your system.
* Install EdgeDriver 84.0.0 or later on your system.

### Environment

* Set the `webdriver.edge` system property to the path of the EdgeDriver executable.

### Build

* Run the following command in the terminal to build the project: `mvn clean package`
* This will create a `target` directory containing the compiled Java classes and the generated TestNG reports.

### Deploy

* Run the following command in the terminal to deploy the project: `mvn deploy`
* This will upload the project to a remote repository.

🧪 Testing Instructions
-------------------------

### Running the Tests

* Run the following command in the terminal to run the unit tests: `mvn test`
* This will execute the unit tests and generate the TestNG reports.

📸 Screenshots
--------------

### [Insert screenshots of the project in action]

📦 API Reference
-----------------

### [Insert API reference documentation for the project]

👤 Author
---------

### Garima

📝 License
---------

### Apache 2.0 License

This project is licensed under the Apache 2.0 License. See the `LICENSE` file for more information.
