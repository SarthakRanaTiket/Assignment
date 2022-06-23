# Assignment

## Introduction

- A SpringBoot Rest API made which connects MongoDB and MySQL.
- Eadh database has more than two entities.
- I have made a Student model in which you can GET, POST, DELETE, UPDATE details about the student.
- In MySQL database, the details like firstName, laseName, email, Course details are stored
- In MongoDB database, the course details are stored.

## Technologies

- MongoDB v5.0.5
- mySQL v8.0.29
- SpringBoot v2.7.0
- java v8 

## Rest APIs

| Method | Url | Description | Valid Request Body |
| ------ | --- | ----------- | ------------------ |
| POST   | /createresources | Creates a user | JSON | 
| GET   | /readresources | Gets all users and their data |  | 
| DELETE   | /deleteresource | Delete a user |  | 
| PUT   | /updateresource | Creates a user | JSON | 
