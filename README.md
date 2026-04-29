# 🧪 QA Automation Portfolio — Barsa Rani Sahu

> End-to-end QA automation portfolio showcasing Selenium Java framework + Postman API automation with CI/CD integration.

## 📌 Tech Stack
| Category | Tools |
|----------|-------|
| Language | Java, JavaScript |
| Web Automation | Selenium WebDriver 4, TestNG, Maven |
| Design Pattern | Page Object Model (POM) |
| API Testing | Postman, Rest Assured, Newman CLI |
| API Scripts | JavaScript (pm.expect, chained requests) |
| CI/CD | GitHub Actions |
| Reporting | ExtentReports, Newman HTML |
| Test Site | SauceDemo, ReqRes API |

## 🗂️ Project Structure
- **selenium-framework/** — Web UI automation using Selenium + Java + POM
- **postman-api-automation/** — REST API tests with JavaScript assertions + Newman

## ✅ Test Coverage
### Selenium:
- Valid/Invalid login scenarios
- Add to cart functionality
- Cross-browser ready (Chrome, Firefox)

### API (Postman + JavaScript):
- GET, POST, PUT, DELETE operations
- Response schema validation
- Negative testing (404, empty fields)
- Chained requests using environment variables

## 🚀 How to Run
### Selenium Tests:
cd selenium-framework
mvn clean test

### API Tests (Newman):
newman run postman-api-automation/collections/APITestCollection.json

## 👩‍💻 Author
**Barsa Rani Sahu** — QA Automation Engineer
📧 barsa200026@gmail.com
🔗 www.linkedin.com/in/barsa-sahu
