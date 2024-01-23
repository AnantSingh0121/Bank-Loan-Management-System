
CREATE DATABASE IF NOT EXISTS ipcapstone_CDiv_60to69;
USE ipcapstone_CDiv_60to69;
CREATE TABLE IF NOT EXISTS users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone VARCHAR(20),
    address TEXT,
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    user_type ENUM('USER', 'OFFICER') NOT NULL
);

CREATE TABLE IF NOT EXISTS loan_applications (
    application_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    loan_amount DECIMAL(15,2) NOT NULL,
    loan_purpose VARCHAR(255) NOT NULL,
    application_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    duration_months INT NOT NULL,
    interest_rate DECIMAL(5,2),
    status ENUM('PENDING', 'APPROVED', 'REJECTED') DEFAULT 'PENDING',
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS user_financial_info (
    financial_info_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    annual_income DECIMAL(15,2) NOT NULL,
    employment_status VARCHAR(50) NOT NULL,
    employer_name VARCHAR(100),
    job_title VARCHAR(100),
    employment_duration INT, 
    credit_score INT,
    existing_debts DECIMAL(15,2),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE IF NOT EXISTS loan_decisions (
    decision_id INT AUTO_INCREMENT PRIMARY KEY,
    application_id INT NOT NULL,
    officer_id INT NOT NULL,
    decision_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status ENUM('APPROVED', 'REJECTED') NOT NULL,
    comments TEXT,
    FOREIGN KEY (application_id) REFERENCES loan_applications(application_id),
    FOREIGN KEY (officer_id) REFERENCES users(user_id)
);

INSERT INTO users (username, password, full_name, email, phone, user_type)
VALUES ('arya2012', 'arya2012@', 'Arya Tiwari', 'arya@tcet.com', '123-456-7890', 'OFFICER');
INSERT INTO users (username, password, full_name, email, phone, address, user_type)
VALUES ('anant1302', 'anant1302@', 'Anant Singh', 'anant@gmail.com', '987-654-3210', 'Malad, Mumbai', 'USER'); 