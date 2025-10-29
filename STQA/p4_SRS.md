# 📝 Software Requirement Specification (SRS)

## 1. Introduction

### 1.1 Purpose
The purpose of this Software Requirement Specification (SRS) document is to define the functional and non-functional requirements of a **Social Media Web Application**.  
This document will serve as a reference for developers, testers, and stakeholders to understand the system’s design, functionalities, and overall goals.

### 1.2 Scope
The Social Media Web Application allows users to:
- Create an account and log in securely.
- Post images, videos, and text updates.
- Follow and interact with other users through likes, comments, and direct messages.
- Receive notifications about interactions.
- Manage personal profiles and privacy settings.

This application aims to provide a fast, secure, and engaging social experience across web and mobile devices.

### 1.3 Definitions, Acronyms, and Abbreviations
| Term | Definition |
|------|-------------|
| UI | User Interface |
| UX | User Experience |
| API | Application Programming Interface |
| DBMS | Database Management System |
| SRS | Software Requirement Specification |

### 1.4 References
- IEEE Standard 830-1998: Recommended Practice for Software Requirements Specifications  
- HTML, CSS, JavaScript (Frontend Technologies)  
- Node.js, Express.js (Backend)  
- MongoDB (Database)

---

## 2. Overall Description

### 2.1 Product Perspective
The system will be a **web-based platform** built using a client–server architecture.  
- **Frontend:** React.js  
- **Backend:** Node.js + Express.js  
- **Database:** MongoDB  
- **Hosting:** Render / AWS  

### 2.2 Product Functions
The major functions of the system include:
1. **User Authentication:** Sign up, log in, and password recovery.
2. **Profile Management:** Edit profile, upload a profile picture, update bio.
3. **Post Management:** Create, edit, delete, like, and comment on posts.
4. **Follow System:** Follow or unfollow other users.
5. **Messaging:** Send and receive direct messages.
6. **Notifications:** Get real-time updates on likes, comments, and follows.
7. **Search:** Find users by name or username.

### 2.3 User Characteristics
- **Normal Users:** Can register, create posts, follow others, and interact with content.  
- **Admin Users:** Can manage reports, delete inappropriate content, and monitor system health.

### 2.4 Constraints
- The system must support both **desktop and mobile** browsers.  
- Must comply with data protection and privacy laws.  
- Internet connection is required for real-time updates.  
- Authentication must use secure protocols (HTTPS, JWT).

### 2.5 Assumptions and Dependencies
- Users must have valid email addresses.  
- The system depends on third-party services for email verification and image hosting.  
- A stable internet connection is required for all features.

---

## 3. Specific Requirements

### 3.1 Functional Requirements

#### FR1: User Registration
- The system shall allow new users to register using their email, username, and password.
- The system shall verify the email address before activating the account.

#### FR2: Login & Authentication
- The system shall authenticate users using valid credentials.
- The system shall prevent unauthorized access using JWT tokens.

#### FR3: Post Management
- Users shall be able to create text or media posts.
- Users shall be able to delete or edit their own posts.
- Users shall be able to like or comment on posts.

#### FR4: Profile Management
- Users shall be able to update their profile details (bio, name, picture).
- Users shall be able to view their own and others’ profiles.

#### FR5: Follow/Unfollow System
- Users shall be able to follow or unfollow other users.
- The system shall display a list of followers and following users.

#### FR6: Messaging
- Users shall be able to send and receive private messages in real time.

#### FR7: Notifications
- The system shall notify users when someone likes, comments, or follows them.

#### FR8: Search
- The system shall allow users to search for other users by username or name.

---

### 3.2 Non-Functional Requirements

#### NFR1: Performance
- The system should load within **3 seconds** under normal network conditions.

#### NFR2: Security
- Passwords must be encrypted using industry standards (e.g., bcrypt).
- Communication should occur over **HTTPS** only.

#### NFR3: Availability
- The system should be available **99%** of the time.

#### NFR4: Scalability
- The system should handle at least **10,000 concurrent users** efficiently.

#### NFR5: Usability
- The interface should be user-friendly, responsive, and intuitive.

#### NFR6: Compatibility
- Compatible with modern browsers (Chrome, Edge, Safari, Firefox).

---

## 4. System Models

### 4.1 Use Case Diagram (Text Description)

**Actors:** User, Admin  
**Use Cases:**  
- Register, Login, Manage Profile, Create Post, Like/Comment, Follow/Unfollow, Chat, Receive Notifications, Logout

**Example Flow:**  
1. User signs in →  
2. Views or creates posts →  
3. Interacts with other users →  
4. Logs out.

---

## 5. External Interface Requirements

### 5.1 User Interface
- Simple and responsive web layout.  
- Dark and light themes.  
- Clear navigation bar with Home, Profile, Messages, and Notifications icons.

### 5.2 Hardware Interface
- Runs on any standard computing device (desktop, laptop, or smartphone).

### 5.3 Software Interface
- Frontend communicates with backend via REST APIs.  
- Database: MongoDB Atlas.  
- Cloud Storage: AWS S3 (for media uploads).

### 5.4 Communication Interface
- Secure communication through HTTPS protocol.

---

## 6. Other Requirements

- Regular backups to protect user data.
- Support multilingual interface (English, Hindi).  
- Admin dashboard for monitoring activities and reports.

---

**Prepared By:** Laxmikant  
**Date:** 29-Oct-2025  
**Version:** 1.0  
**Status:** Draft
