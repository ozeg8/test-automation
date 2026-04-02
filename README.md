# 🧪 Test Automation Framework — Selenium + Cucumber

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white"/>
  <img src="https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
  <img src="https://img.shields.io/badge/TestNG-FF6C37?style=for-the-badge&logo=testng&logoColor=white"/>
</p>

<p align="center">
  A robust, maintainable end-to-end test automation framework built with Java, Selenium WebDriver, and Cucumber BDD. Designed for scalable web application testing with readable Gherkin scenarios and detailed HTML reports.
</p>

---

## ✨ Features

- ✅ **BDD with Cucumber** — Human-readable Gherkin test scenarios
- ✅ **Page Object Model (POM)** — Clean, reusable, and maintainable test structure
- ✅ **Cross-browser support** — Chrome, Firefox, Edge
- ✅ **HTML Test Reports** — Detailed reports with screenshots on failure
- ✅ **Data-Driven Testing** — Scenario Outline & Examples table support
- ✅ **CI/CD Ready** — Easily integrated with Jenkins, GitHub Actions

---

## 🛠️ Tech Stack

| Tool | Purpose |
|---|---|
| Java 11+ | Core programming language |
| Selenium WebDriver | Browser automation |
| Cucumber (BDD) | Gherkin-based test scenarios |
| TestNG | Test runner & assertions |
| Maven | Dependency management & build |
| WebDriverManager | Automatic driver management |
| ExtentReports | HTML test reporting |

---

## 📁 Project Structure

```
test-automation/
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   ├── pages/          # Page Object classes
│   │   │   ├── steps/          # Cucumber step definitions
│   │   │   ├── hooks/          # Before/After hooks
│   │   │   └── runners/        # TestNG test runners
│   │   └── resources/
│   │       └── features/       # Gherkin .feature files
├── reports/                    # Generated HTML test reports
├── pom.xml                     # Maven dependencies
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6+
- Chrome / Firefox browser installed

### Installation

```bash
# Clone the repository
git clone https://github.com/ozeg8/test-automation.git

# Navigate to project directory
cd test-automation

# Install dependencies
mvn clean install -DskipTests
```

---

## ▶️ Running Tests

```bash
# Run all tests
mvn test

# Run specific feature
mvn test -Dcucumber.features="src/test/resources/features/login.feature"

# Run with specific browser
mvn test -Dbrowser=firefox

# Run specific tag
mvn test -Dcucumber.filter.tags="@smoke"
```

---

## 📊 Test Reports

After test execution, HTML reports are generated under `/reports` directory.

Open `reports/index.html` in your browser to view:
- Test execution summary
- Pass/Fail statistics
- Step-by-step breakdown
- Screenshots on failure

---

## 📝 Sample Feature File

```gherkin
Feature: User Login

  @smoke
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be redirected to the dashboard

  @regression
  Scenario Outline: Login with multiple user roles
    Given the user is on the login page
    When the user logs in as "<role>"
    Then the user sees the "<dashboard>" view

    Examples:
      | role  | dashboard |
      | admin | Admin Panel |
      | user  | User Home   |
```

---

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/new-test`)
3. Commit your changes (`git commit -m 'Add new test scenario'`)
4. Push to the branch (`git push origin feature/new-test`)
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License.

---

<p align="center">Built with ❤️ by <a href="https://github.com/ozeg8">ozeg8</a></p>
