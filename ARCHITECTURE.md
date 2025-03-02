# AWS Networking Learning Platform - Architecture

## Context Diagram
This diagram shows the high-level interaction between the user and the learning platform.

```mermaid
graph TD
    U[User] -->|Uses| S[AWS Networking Learning Platform]
    S -->|Provides| C[Course Content]
    S -->|Tracks| P[Progress]

    U[User] -->|Uses| WA[Web Application]
    subgraph AWS Networking Learning Platform
    WA -->|API Calls| BE[Backend Server]
    BE -->|Reads/Writes| DB[(Database)]
    end
    WA -->|Displays| C[Course Content]
    BE -->|Manages| C
    BE -->|Tracks| P[User Progress]
