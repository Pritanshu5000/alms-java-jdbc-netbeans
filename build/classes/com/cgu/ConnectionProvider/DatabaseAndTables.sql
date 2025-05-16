/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  LENOVO
 * Created: May 17, 2025
 */

-- Create the database
CREATE DATABASE IF NOT EXISTS advance_lms;
USE library;

-- Create tables
CREATE TABLE IF NOT EXISTS books (
    Book_ID VARCHAR(10) NOT NULL PRIMARY KEY,
    Book_Name VARCHAR(100),
    Publisher VARCHAR(100),
    P_YEAR INT,
    Price INT,
    Section VARCHAR(60)
);

CREATE TABLE IF NOT EXISTS issue (
    Book_ID VARCHAR(10),
    S_ID VARCHAR(10),
    Issue_Date DATE,
    Due_Date DATE,
    ReturnBook VARCHAR(5)
);

CREATE TABLE IF NOT EXISTS login (
    userid VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(20) NOT NULL,
    PRIMARY KEY (password)
);

CREATE TABLE IF NOT EXISTS student_details (
    S_ID BIGINT NOT NULL PRIMARY KEY,
    S_Name VARCHAR(100),
    P_Name VARCHAR(100),
    S_Mob BIGINT UNIQUE,
    P_Mob BIGINT UNIQUE,
    Gender VARCHAR(8) NOT NULL,
    DOB DATE,
    C_Name VARCHAR(70),
    B_Name VARCHAR(70),
    Address VARCHAR(60)
);