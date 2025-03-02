# AWS Networking Learning Platform - Architecture

## Context Diagram
This code shows the high-level interaction between the user (student) and the learning platform.

```mermaid
graph TD
    U[Student]-->|Uses| S[AWS Networking Learning Platform]
    S -->|Provides| C[Course Content]
    S -->|Tracks| P[Progress]

    U["<b>Student</b>
    (A student enrolled in the course)"]
    S["<b>AWS Networking Learning Platform</b>
    (Platform for learning AWS Networking)"]
    C["<b>Course Content</b>
    (AWS Networking courses and materials)"]
    P["<b>Progress</b>
    (Student's learning progress)"]
```

## Container Diagram
This diagram illustrates the main components of the learning platform.

```mermaid
graph TD
    U[Student]-->|Uses| WA[Web Application]
    subgraph AWS Networking Learning Platform
    WA -->|API Calls| BE[Backend Server]
    BE -->|Reads/Writes| DB[(Database)]
    end
    WA -->|Displays| C[Course Content]
    BE -->|Manages| C
    BE -->|Tracks| P[User Progress]

    U["<b>Student</b>
    (A student enrolled in the course)"]
    WA["<b>Web Application</b>
    (React-based frontend)"]
    BE["<b>Backend Server</b>
    (Node.js server with Express)"]
    DB["<b>Database</b>
    (MongoDB database)"]
    C["<b>Course Content</b>
    (AWS Networking courses and quizzes)"]
    P["<b>User Progress</b>
    (Student's course completion and quiz scores)"]
```

## Component Diagram

This diagram shows the main components within the Backend Server.

```mermaid
graph TD
    subgraph Backend Server
    API[API Layer] --> AM[Auth Manager]
    API --> CM[Course Manager]
    API --> QM[Quiz Manager]
    API --> PM[Progress Manager]
    end
    API -->|Reads/Writes| DB[(Database)]
    AM -->|Validates| DB
    CM -->|Retrieves/Updates| DB
    QM -->|Retrieves/Stores| DB
    PM -->|Updates| DB

    API["<b>API Layer</b>
    (Express.js API routes)"]
    AM["<b>Auth Manager</b>
    (Handles user authentication)"]
    CM["<b>Course Manager</b>
    (Manages course content)"]
    QM["<b>Quiz Manager</b>
    (Manages quizzes and scoring)"]
    PM["<b>Progress Manager</b>
    (Tracks user progress)"]
    DB["<b>Database</b>
    (MongoDB database)"]
```
