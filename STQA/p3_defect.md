# 🧾 Defect Report

**Project Name:** Social Media Web Application  
**Module Name:** Login  
**Defect ID:** D001  
**Defect Title:** Login button not responding after entering valid credentials  
**Test Case ID:** TC01  
**Reported By:** Laxmikant  
**Assigned To:** Development Team  
**Date Reported:** 29-Oct-2025  
**Severity:** High  
**Priority:** High  
**Status:** Open  

---

## 🧠 Description
When a user enters a valid email and password and clicks on the “Login” button, the button becomes unresponsive and the user is not redirected to the homepage.  
No error message is displayed to the user.

---

## 🪜 Steps to Reproduce
1. Open the Social Media web application.  
2. Navigate to the **Login** page.  
3. Enter a **valid email ID** and **valid password**.  
4. Click on the **Login** button.  

---

## ✅ Expected Result
User should be redirected to the homepage after successful authentication.

---

## ❌ Actual Result
The “Login” button becomes inactive and nothing happens.  
The page stays the same without any error message or redirection.

---

## 💻 Environment
- **Browser:** Google Chrome (v128.0)  
- **Operating System:** Windows 10  
- **Build Version:** v1.0.2-beta  
- **Network:** Stable Wi-Fi  

---

## 📎 Attachments
- Screenshot: `login_button_not_working.png`  
- Console Log: `TypeError: cannot read properties of undefined (reading 'then')`

---

## 💬 Remarks / Comments
Possible issue in frontend API call to backend authentication service — the click handler may not be properly triggering the login request.
