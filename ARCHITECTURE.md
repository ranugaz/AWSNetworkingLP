# AWS Networking Learning Platform - Architecture

## Context Diagram
This diagram shows the high-level interaction between the user and the learning platform.

```mermaid
graph TD
    U[User] -->|Uses| S[AWS Networking Learning Platform]
    S -->|Provides| C[Course Content]
    S -->|Tracks| P[Progress]
