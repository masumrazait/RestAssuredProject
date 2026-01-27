# RestAssuredProject

A lightweight, opinionated test automation template for REST APIs using RestAssured. This repository provides a starting point for writing reliable, maintainable API tests in Java with support for configuration, test reports, and CI integration.

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Quickstart](#quickstart)
- [Running tests](#running-tests)
- [Project structure](#project-structure)
- [Configuration](#configuration)
- [Writing tests](#writing-tests)
- [Test reports](#test-reports)
- [CI / GitHub Actions](#ci--github-actions)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features
- RestAssured-based HTTP client utilities for concise API tests
- Maven-based build and test execution
- Environment-specific configuration support
- Test reporting (Surefire / configurable reporters)
- Example test and test utilities to get started quickly

## Prerequisites
- Java JDK 11 or newer (set JAVA_HOME)
- Maven 3.6.x or newer
- Internet access to download dependencies

Verify installation:
```bash
java -version
mvn -v
```

## Quickstart
1. Clone the repository:
```bash
git clone https://github.com/masumrazait/RestAssuredProject.git
cd RestAssuredProject
```

2. Run the test suite:
```bash
mvn clean test
```

If the project uses environment-specific profiles (example):
```bash
mvn clean test -Denv=staging
```

## Running tests
- Run all tests:
  mvn clean test

- Run a single test class:
  mvn -Dtest=MyApiTest test

- Run a single test method:
  mvn -Dtest=MyApiTest#shouldCreateResource test

- Increase logging/verbose output:
  mvn -DskipTests=false -Dlogging.level=DEBUG test

(Adjust the commands above according to your Maven surefire/failsafe configuration and test framework.)

## Project structure
This project follows a conventional Maven layout. Example structure:

- src/
  - main/
    - java/                # Reusable utilities (HTTP client, helpers)
    - resources/           # Shared resources (schemas, templates)
  - test/
    - java/                # Test classes
    - resources/           # Test-specific config (e.g., config.properties)
- pom.xml                 # Maven project file
- README.md

Note: If your repo differs, update this section to reflect the actual layout.

## Configuration
The project supports environment-specific configuration. Common patterns:

- src/test/resources/config.properties
- src/test/resources/env/*.properties (e.g. dev.properties, staging.properties)

Typical configuration values:
- base.url — Base API URL
- api.key / auth.token — Credentials or tokens
- timeouts — Request timeouts
- report.dir — Where to output test reports

You can select an environment via Maven property:
```bash
mvn test -Denv=staging
```

Or export environment variables:
```bash
export BASE_URL=https://api.staging.example.com
mvn test
```

Make sure to never commit secrets. Use CI secret store or environment variables for credentials.

## Writing tests
Tests should be placed under `src/test/java`. Use RestAssured to write readable, concise tests. Example with TestNG (adjust imports/framework as used in this repo):

```java
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ExampleApiTest {

    @Test
    public void shouldReturn200ForHealthEndpoint() {
        given()
            .baseUri(System.getProperty("base.url", "https://api.example.com"))
            .when()
            .get("/health")
            .then()
            .statusCode(200)
            .body("status", equalTo("UP"));
    }
}
```

Guidelines:
- Keep tests deterministic and independent.
- Use data builders or factory methods for request payloads.
- Centralize common request/response specifications (RequestSpecBuilder / ResponseSpecBuilder).
- Use schema validation for contract checks when possible (JSON Schema).

## Test reports
This project uses Maven's test reporting (Surefire / Failsafe). Example outputs:
- target/surefire-reports (XML, plain text)
- target/site (if configured)

If you want HTML/Allure reports, add and configure the Allure plugin and generate reports:
```bash
# after tests run (if Allure is configured)
allure serve target/allure-results
```

Adjust the README to document whichever report tool you have configured (Allure, Surefire Report, etc).

## CI / GitHub Actions
A typical CI workflow will:
- Checkout code
- Set up JDK
- Run `mvn -B -DskipTests=false clean test`
- Archive artifacts (test reports)

Example (high level):
```yaml
name: ci
on: [push, pull_request]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - name: Set up JDK 11
        uses: actions/setup-java@v4
        with:
          java-version: '11'
      - name: Run tests
        run: mvn -B clean test
      - name: Upload reports
        uses: actions/upload-artifact@v4
        with:
          name: test-reports
          path: target/surefire-reports
```

Add secrets (API keys) to GitHub repository settings and reference them in workflows with `${{ secrets.MY_SECRET }}`.

## Contributing
Contributions are welcome:
- Open issues for bugs or feature requests
- Create PRs for changes; follow consistent code style
- Add tests for new features or bug fixes
- Keep secrets out of the repo

Suggested workflow:
1. Fork the repo
2. Create a feature branch
3. Run tests locally
4. Open a PR with a clear description

## License
Specify the project license here (e.g., MIT). If no license file exists yet, add one to clarify usage and contributions.

## Contact
Repository owner: [masumrazait](https://github.com/masumrazait)
