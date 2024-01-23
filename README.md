# Bank Loan Management System

A Java Swing application for managing loan applications, approvals and user accounts.

## Features

- Two separate login interfaces for users and loan officers
- Users can apply for loans and view application status
- Loan officers can view all loan applications and approve/reject them
- MySQL database for persistent storage

## Prerequisites

- JDK 8 or higher
- MySQL Server (8.0 recommended)
- VS Code with Java extensions

## Database Setup

1. Make sure MySQL Server is running
2. The database script has been already executed
3. Database name: `ipcapstone_CDiv_60to69`
4. Default credentials: 
   - Username: `root` 
   - Password: ``

## Running in VS Code

1. Open the project folder in VS Code
2. Make sure the Java Extension Pack is installed
3. Open the Run and Debug view (Ctrl+Shift+D)
4. Select "Run Bank Loan Management System" from the dropdown
5. Click the Play button or press F5

## Default Login Credentials

### Loan Officer:
- Username: `arya2012`
- Password: `arya2012@`

### Customer:
- Username: `anant1302`
- Password: `anant1302@`

## Project Structure

- `src/main/java/ipcapstone` - Source code
  - `controller` - Business logic
  - `dao` - Data access objects
  - `model` - Data models
  - `ui` - User interface components
- `out` - Compiled classes
- `database.sql` - Database setup script 