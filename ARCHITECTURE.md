# AWS Networking Learning Platform - Architecture

## Context Diagram
This diagram shows the high-level interaction between the user and the learning platform.

```mermaid
graph TD
    U[User] -->|Uses| S[AWS Networking Learning Platform]
    S -->|Provides| C[Course Content]
    S -->|Tracks| P[Progress]

Container Diagram

This diagram illustrates the main components of the learning platform.

graph TD
    U[User] -->|Uses| WA[Web Application]
    subgraph AWS Networking Learning Platform
    WA -->|API Calls| BE[Backend Server]
    BE -->|Reads/Writes| DB[(Database)]
    end
    WA -->|Displays| C[Course Content]
    BE -->|Manages| C
    BE -->|Tracks| P[User Progress]

Component Diagram

This diagram shows the main components within the Backend Server.

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
