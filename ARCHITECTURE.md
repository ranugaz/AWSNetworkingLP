graph TD
    Student[Student]
    LearningPlatform[AWS Networking Learning Platform]
    AWSConsole[AWS Console]
    EmailService[Email Service]

    Student -->|Uses| LearningPlatform
    LearningPlatform -->|Links to| AWSConsole
    LearningPlatform -->|Sends emails via| EmailService
