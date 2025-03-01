# Context Diagram:  @startuml

!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Context.puml

(student, "Student", "Learns AWS Networking")
System(learningPlatform, "AWS Networking Learning Platform", "Provides courses and assessments")
System_Ext(awsConsole, "AWS Console", "For practical exercises")
System_Ext(emailService, "Email Service", "Sends notifications")

Rel(student, learningPlatform, "Uses")
Rel(learningPlatform, awsConsole, "Links to")
Rel(learningPlatform, emailService, "Sends emails via")
@enduml 
