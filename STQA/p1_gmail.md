# 🧪 Test Scenarios for Gmail Login Page

## ✅ 1. Functional Test Scenarios

| ID | Test Scenario | Expected Result |
|----|----------------|----------------|
| TC01 | Verify that the Gmail login page loads successfully | The page should load completely without errors |
| TC02 | Verify that user can enter a valid email ID and proceed to password step | User should be redirected to the password entry page |
| TC03 | Verify login with valid email and valid password | User should be redirected to the Gmail inbox |
| TC04 | Verify login with invalid email and valid password | Error message “Couldn’t find your Google Account” should be displayed |
| TC05 | Verify login with valid email and invalid password | Error message “Wrong password. Try again” should be displayed |
| TC06 | Verify login with empty email field | Error message “Enter an email or phone number” should appear |
| TC07 | Verify login with empty password field | Error message “Enter your password” should appear |
| TC08 | Verify that the “Next” button is disabled when email field is empty | User cannot proceed without entering email |
| TC09 | Verify that “Forgot email?” link redirects to email recovery page | User should be navigated to recovery options |
| TC10 | Verify that “Forgot password?” link redirects to password recovery page | User should be navigated to password recovery options |
| TC11 | Verify that login works with recovery email or phone number | User should be able to log in successfully |
| TC12 | Verify that login fails after multiple invalid attempts | Account should show CAPTCHA or temporary lockout message |

---

## 🎨 2. UI Test Scenarios

| ID | Test Scenario | Expected Result |
|----|----------------|----------------|
| TC13 | Verify that Gmail logo and Google branding are visible | Logo and title should appear correctly |
| TC14 | Verify that input fields and buttons are properly aligned | Layout should be responsive and aligned |
| TC15 | Verify placeholder text in the email and password fields | Correct placeholder text should be visible |
| TC16 | Verify that password input field hides characters | Password characters should appear as dots or asterisks |
| TC17 | Verify that “Show Password” icon toggles visibility | Password should become visible when icon is clicked |

---

## ⚙️ 3. Usability Test Scenarios

| ID | Test Scenario | Expected Result |
|----|----------------|----------------|
| TC18 | Verify that “Enter” key works as a submit action | Pressing Enter should work same as clicking “Next” |
| TC19 | Verify tab navigation between fields and buttons | Tab key should move focus correctly |
| TC20 | Verify responsiveness on mobile devices | Page should display properly on smaller screens |
| TC21 | Verify that language change option works properly | Selected language should update text labels |
| TC22 | Verify accessibility features like screen reader compatibility | Page elements should have proper labels and roles |

---

## 🔐 4. Security Test Scenarios

| ID | Test Scenario | Expected Result |
|----|----------------|----------------|
| TC23 | Verify that password field does not allow copy-paste | Copy/paste should be restricted for passwords |
| TC24 | Verify login with SQL injection-like inputs | Application should not crash or expose data |
| TC25 | Verify session timeout after inactivity | Session should expire and prompt for login again |
| TC26 | Verify HTTPS protocol is used | URL should start with `https://` |
| TC27 | Verify that password is not stored in browser autofill without user consent | Browser should prompt before saving credentials |
| TC28 | Verify that back button doesn’t allow returning to inbox after logout | User should be redirected to login page |

---

## 🧰 5. Performance Test Scenarios

| ID | Test Scenario | Expected Result |
|----|----------------|----------------|
| TC29 | Verify page load time under normal conditions | Page should load within 2–3 seconds |
| TC30 | Verify system behavior under high traffic | Login service should remain stable |

---

✅ **Total Scenarios:** 30  
These cover **functional**, **UI**, **usability**, **security**, and **performance** testing for Gmail login.

