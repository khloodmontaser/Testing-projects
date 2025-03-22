# User Story

As a **bank customer**, I want to **transfer money** to another account using the **mobile banking app**, so that I can **easily send funds without visiting a branch**.

---

## Acceptance Criteria

### 1. Login and Security
- Users must **log in** using their credentials or biometric authentication.
- The session should **automatically log out** after **5 minutes** of inactivity.

### 2. Transfer Setup
- Users can **select from saved payees** or **add a new payee**.
- If adding a new payee, users must enter:
  - **Recipient’s account details** (account number and bank name).
  - A **one-time password (OTP)** must be sent for **payee addition confirmation**.

### 3. Transfer Details
- Users can **input the transfer amount** and choose between:
  - **Immediate transfer**
  - **Scheduled transfer**
- The app displays the **account balance** and provides alerts if the transfer amount **exceeds the available balance**.

### 4. Confirmation and Execution
- A **summary of the transfer details** is displayed before submission, including:
  - Recipient name
  - Transfer amount
  - Transfer date
- Users must enter an **OTP to confirm** the transfer.
- Upon successful transfer, users receive:
  - **In-app notification**
  - **Email/SMS confirmation**

---


