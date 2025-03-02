# AWS Networking Learning Platform - Architecture

   # Context Diagram:

graph TD
    U[Student] -->|Uses| S[AWS Networking Learning Platform]
    S -->|Provides| C[Course Content]
    S -->|Tracks| P[Progress]

  #  Container Diagram:

graph TD
    U[Student] -->|Uses| WA[Web Application]
    subgraph AWS Networking Learning Platform
    WA -->|API Calls| BE[Backend Server]
    BE -->|Reads/Writes| DB[(Database)]
    end
    WA -->|Displays| C[Course Content]
    BE -->|Manages| C
    BE -->|Tracks| P[User Progress]

  #  Component Diagram (focusing on the Backend Server):

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
