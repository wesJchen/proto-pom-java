# Selenium Test Automation Framework

A Selenium WebDriver test automation framework built with Java, TestNG, and Maven.

## Prerequisites

- **Java JDK 11** or higher
- **Maven 3.6+**
- **Chrome Browser** (for ChromeDriver tests)

## Project Structure

```
selenium_framework/
├── src/
│   ├── main/java/          # Main application code
│   └── test/java/           # Test code
│       ├── com/
│       │   ├── base/        # Base test classes
│       │   ├── pages/       # Page Object Model classes
│       │   └── test/        # Test classes
├── target/                  # Build output (ignored in git)
├── pom.xml                  # Maven configuration
└── testng.xml               # TestNG suite configuration
```

## Running Tests

### Run All Tests

Execute all tests in the suite:

```bash
mvn test
```

### Run Tests by Group

Tests are organized into functional groups. Run specific groups:

```bash
# Run only e-commerce tests
mvn test -Dgroups=ecommerce

# Run only general tests
mvn test -Dgroups=general

# Run multiple groups
mvn test -Dgroups="ecommerce,general"
```

### Run Specific Test Class

Run a single test class:

```bash
# Run Amazon tests only
mvn test -Dtest=AmazonTest

# Run Google tests only
mvn test -Dtest=GoogleTest
```

### Run Specific Test Method

Run a single test method:

```bash
mvn test -Dtest=AmazonTest#verifySearchProductResults
```

## Test Groups

Tests are organized into the following groups:

- **`general`** - General functionality tests (e.g., Google tests)
- **`ecommerce`** - E-commerce and shopping-related tests (e.g., Amazon tests)

To add a test to a group, annotate your test method:

```java
@Test(groups = "ecommerce")
public void myTest() {
    // test code
}
```

## Test Reports

After running tests, reports are generated in:

```
target/surefire-reports/
```

Open `target/surefire-reports/index.html` in a browser to view detailed test results.

## Configuration

### TestNG Configuration

Test suite configuration is defined in `testng.xml`. To modify test execution:

1. Edit `testng.xml` to add/remove test groups or classes
2. Add new groups to the `<include>` section to run them with all tests

### Maven Configuration

Maven is configured to use TestNG via the Surefire plugin. The default test suite is set in `pom.xml`:

```xml
<testng.suite>testng.xml</testng.suite>
```

## Adding New Tests

1. Create a new test class in `src/test/java/com/test/`
2. Extend `BaseTest` class
3. Add `@Test` annotation with appropriate group:
   ```java
   @Test(groups = "your-group-name")
   public void yourTest() {
       // test code
   }
   ```
4. Add the class to `testng.xml` if needed
5. Add the group to `testng.xml` `<include>` section to run with all tests

## Dependencies

- **Selenium WebDriver 4.15.0** - Browser automation
- **TestNG 7.8.0** - Test framework
- **SLF4J Simple 2.0.17** - Logging

## Build Commands

```bash
# Compile project
mvn compile

# Compile tests
mvn test-compile

# Run tests
mvn test

# Clean build
mvn clean test
```

## Notes

- Tests use ChromeDriver by default (configured in `BaseTest`)
- Browser will open/close automatically for each test
- Test reports are generated after each test run
