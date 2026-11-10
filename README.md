# Onboarding Tracker

Spring Boot 3.5 (Java 25) REST API with embedded H2. No UI.

## Run
```
./gradlew bootRun   (Windows: gradlew.bat bootRun)
```
Server: http://localhost:8080 — H2 console: http://localhost:8080/h2-console
(JDBC URL `jdbc:h2:file:./data/onboardingdb`, user `sa`, empty password)

## APIs

### POST /api/employees — capture employee
```json
{ "name": "Asha Rao", "role": "Engineer", "onboardingDate": "2026-11-10" }
```
Returns `201` with the saved record (including generated `id`). Missing fields or a bad date return `400`.

### GET /api/employees — fetch all employees
Returns `200` with a JSON array of employees.
