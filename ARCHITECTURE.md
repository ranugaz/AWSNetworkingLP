```markdown
# AWS Networking Services Learning Platform - Architecture

## 1. Context Diagram

This diagram shows the high-level interactions of the AWS Networking Learning Platform with external entities.

```mermaid
graph TD
    Student[Student]
    LearningPlatform[AWS Networking Learning Platform]
    AWSConsole[AWS Console]
    EmailService[Email Service]
    Student -->|Uses| LearningPlatform
    LearningPlatform -->|Links to| AWSConsole
    LearningPlatform -->|Sends emails via| EmailService
