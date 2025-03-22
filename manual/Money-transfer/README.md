### User Story

As a bank customer,
I want to transfer money to another account using the mobile banking app,
So that I can easily send funds without visiting a branch.
Acceptance Criteria:
1. Login and Security:
o The user must log in using their credentials or biometric authentication.
o The session should automatically log out after 5 minutes of inactivity.
2. Transfer Setup:
o Users can select from saved payees or add a new payee.
o Users must enter the recipient's account details (account number and
bank name) if adding a new payee.

o A one-time password (OTP) must be sent for payee addition
confirmation.
3. Transfer Details:
o Users can input the transfer amount and choose between immediate
transfer or scheduled transfer.
o The app displays the account balance and alerts if the transfer amount
exceeds the available balance.
4. Confirmation and Execution:
o A summary of the transfer details is displayed before submission
(recipient name, amount, transfer date).
o An OTP is required to confirm the transfer.
o Upon successful transfer, the user receives an in-app notification and an
email/SMS confirmation.
