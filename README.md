# AWSNetworkingLP

# AWS Networking Services Learning Plartform

# Project Title
AWS Networking Services Learning Platform

# Project goal
This Learning Plartform is designed to provide a focused, student system for learning AWS Networking Services. The Plartform aims to offer course access, content delivery, assesments and progress tracking to enhance the learning experience for students interested in AWS Networking.

# Project Structure

To complete the project setup:

 **Assignment 3:**
    Created a new repository on GitHub named "AWSNetworkingLP".
    Initialized it with a README.md file.
    Created two additional files: SPECIFICATION.md and ARCHITECTURE.md.
    For the C4 diagrams, I've used Mermaid tool to create the diagrams and then insert the code into the ARCHITECTURE.md file.

 **Assignment 4:**

Done stakeholder analysis and define detailed functional/nonfunctional requirements for AWS Networking Learning Plartform.

Files:
- Stakeholder-Analysis-Table.md
- System-Requirements-Document.md
- Reflection (Updated)

 **Assignment 5:**
Translated stakeholder and system requirements into use case diagrams, detailed use case specifications, and test cases to validate system behavior.

Files:
- UseCaseDiagram.md
- UseCaseSpecifications.md
- TestCases.md
- Reflection (Updated)

 **Assignment 6:**
Applied Agile methodology by translating system requirements and use cases into user stories, creating a prioritized product backlog, and planning an initial sprint.

Files:

- User_Stories.md
- Product_Backlog.md
- Sprint_Plan.md
- Reflection.md (Updated)

 **Assignment 7:** GitHub Project Templates and Kanban Board Implementation Objective Analyze GitHub’s

Compared github project templates. Justified for choosing automated Kanban template. Have customized the template to add new columns.

## Kanban Board Customization

Our Kanban board has been customized to better suit the needs of the AWS Networking Services Learning Platform project:

1. **Testing Column**: Added to clearly separate tasks that are ready for or undergoing Quality Assurance. This ensures that our learning content and features meet high-quality standards before being marked as complete.

2. **Blocked Column**: Introduced to highlight tasks facing impediments or external dependencies. This helps in quickly identifying and addressing bottlenecks in our development process, crucial for maintaining the smooth progression of our learning platform development.

These customizations allow for better visualization of our workflow, ensuring that testing is a distinct phase and that any blocked items are immediately visible to the team. This supports our goal of delivering a high-quality, reliable learning experience for AWS Networking Services.

## Kanban Board

We use a GitHub Project Board to track the progress of our user stories. Our board is structured as follows:

- **Backlog**: All user stories that are not yet ready for development.
- **Ready**: User stories that are fully defined and ready to be worked on.
- **In Progress**: User stories currently being developed.
- **In Review**: User stories that are complete and awaiting code review.
- **Testing**: User stories undergoing QA.
- **Blocked**: User stories that cannot proceed due to external factors.
- **Done**: Completed user stories.

Files:

- Template_Analysis.md
- A screenshot of Kanban board, the file named "Custom Kanban board.png".
- Kanban_Board_Explanation.md
- Reflection.md (Updated)

 **Assignment 8:** Object State Modeling and Activity Workflow Modeling Objective

Files:
- State_Transition_Diagrams.md
- Activity_Diagrams.md
- Explaination_for_StateChange_&_Activity_Diagram.md
- Reflection.md (Updated)

 **Assignment 9:** Object State Modeling and Activity Workflow Modeling Objective

Files:

- domain_model_description.md
- Class_Diagram.md
- Reflection.md (Updated)

 **Assignment 10:**  From Class Diagrams to Code with All Creational Patterns

## 1. Implemented the classes in your Java language

Created all enums:
All model classes:

Each class includes:
-	Private attributes
-	Getters/setters
-	Core methods from the diagram
-	Proper relationships through composition/association

## Implementation Details, Directories and Files for Assignment 10

You can view the implementation details in two ways:
- [View Implementation Documentation](/IdeaProjects/aws-learning-plartform/Implementation.md)
- [View Complete Project Implementation](/IdeaProjects/aws-learning-plartform/)

The complete implementation includes:
- Source code
- Documentation
- Project structure
- Test cases

## 2. Creational Pattern Implementation

## Creational Patterns Implementation

### 1. Simple Factory Pattern
- **Implementation**: `ContentFactory` for creating different types of learning content
- **Justification**: Centralizes the creation of content objects (PDF, Video, Text) and encapsulates the instantiation logic
- **Benefits**:
  - Simplifies content creation process
  - Provides a single point of content object creation
  - Makes content type creation consistent across the application

### 2. Factory Method Pattern
- **Implementation**: `QuizFactory` hierarchy for creating different types of quizzes
- **Justification**: Different quiz types (Multiple Choice, Practical) require different implementation logic
- **Benefits**:
  - Allows adding new quiz types without modifying existing code
  - Each quiz type can have its own creation logic
  - Maintains single responsibility principle

### 3. Abstract Factory Pattern
- **Implementation**: `LearningResourceFactory` for creating families of related learning resources
- **Justification**: Need to create consistent sets of learning resources (Basic or Advanced) that work together
- **Benefits**:
  - Ensures compatibility between related learning resources
  - Supports complete resource level isolation (Basic vs Advanced)
  - Easy to add new resource families

### 4. Builder Pattern
- **Implementation**: `CourseBuilder` for constructing complex Course objects
- **Justification**: Course creation involves many optional parameters and complex setup
- **Benefits**:
  - Handles complex object construction step by step
  - Makes optional parameters easy to handle
  - Creates readable course construction code
  - Ensures valid course object state

### 5. Prototype Pattern
- **Implementation**: `CourseTemplate` for cloning existing course templates
- **Justification**: Creating new courses from scratch is resource-intensive, and many courses share similar structures
- **Benefits**:
  - Reduces duplicate course setup code
  - Makes course creation more efficient
  - Allows for template-based course creation
  - Supports quick course customization

### 6. Singleton Pattern
- **Implementation**: `DatabaseConnectionManager` for managing database connections
- **Justification**: Need to ensure single point of control for database operations
- **Benefits**:
  - Ensures single database connection manager instance
  - Provides global access point
  - Controls resource usage
  - Centralizes database operation coordination

## Pattern Selection Rationale
Each pattern was chosen to address specific challenges in the AWS Learning Platform:
- **Simple Factory**: For basic object creation
- **Factory Method**: For extensible object families
- **Abstract Factory**: For creating compatible resource sets
- **Builder**: For complex object construction
- **Prototype**: For efficient object cloning
- **Singleton**: For resource management

## Implementation Location
All creational design patterns implementations can be found in the [creational patterns directory](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/creational_patterns).

### Pattern-Specific Implementations:
- [Simple Factory](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/creational_patterns/simple_factory)
- [Factory Method](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/creational_patterns/factory_method)
- [Abstract Factory](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/creational_patterns/abstract_factory)
- [Builder](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/creational_patterns/builder)
- [Prototype](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/creational_patterns/prototype)
- [Singleton](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/creational_patterns/singleton)

## 3. Unit Testing

All unit tests for the creational patterns can be found in the [test directory](IdeaProjects/aws-learning-plartform/src/test/java/com/awslearning/creational_patterns).

### Running Tests
Tests can be run in multiple ways:
- Individual test methods: Click green play button next to method
- Class level: Run all tests in a specific test class
   Package level: Run all tests for a specific pattern

 **Assignment 11:** : Implementing a Persistence Repository Layer

## Repository Layer Implementation

### Repository Interface Design
The repository layer implements a generic repository pattern to provide consistent data access across different entities.

#### Base Repository Interface
- Generic interface `Repository<T, ID>` defines standard CRUD operations
- Type parameters:
  - `T`: Entity type (e.g., Course, User, Content)
  - `ID`: Identifier type (e.g., String, Long)

#### Entity-Specific Repositories
1. **CourseRepository**
   - Extends base repository for Course entities
   - Additional methods for course-specific queries
   - Supports searching by instructor and difficulty level

2. **UserRepository**
   - Manages user data persistence
   - Includes email-based lookup
   - Supports filtering by user role

3. **ContentRepository**
   - Handles learning content storage
   - Supports content type filtering
   - Course-specific content retrieval

### Design Decisions
1. **Generic Repository Pattern**
   - Reduces code duplication
   - Ensures consistent CRUD operations
   - Enables type-safe operations

2. **Optional Return Types**
   - Uses Java's Optional for null-safety
   - Clearer API contract for existence checks
   - Better exception handling

3. **Extended Interfaces**
   - Entity-specific repositories add custom methods
   - Maintains single responsibility principle
   - Allows for specialized queries

### Implementation Location
Repository interfaces can be found in the [repositories directory](IdeaProjects/aws-learning-plartform/src/main/java/com/awslearning/repositories).

## Storage Abstraction Mechanism

### Factory Pattern Implementation
The project uses the Factory Pattern for repository creation and storage abstraction for the following reasons:

#### Why Factory Pattern over Dependency Injection?
1. **Simplified Configuration**: Factory pattern provides centralized object creation without requiring a DI container
2. **Runtime Flexibility**: Allows switching storage implementations at runtime
3. **Encapsulated Creation Logic**: Storage-specific details are hidden from client code
4. **Future Extensibility**: Easy to add new storage types without modifying existing code

#### Implementation Details
- `RepositoryFactory` provides static methods for creating repositories
- Supports multiple storage types:
  - In-Memory (current implementation)
  - Database (future implementation)
- Factory methods for each repository type:
  - `getCourseRepository()`
  - `getUserRepository()`
  - `getContentRepository()`

#### Usage Example
```java
// Get in-memory repository
CourseRepository courseRepo = RepositoryFactory.getCourseRepository("MEMORY");

// Future database implementation
CourseRepository dbRepo = RepositoryFactory.getCourseRepository("DATABASE");
```

## Future Storage Implementations

### Database Storage
The system is designed to support future database storage implementation through:
- Stub classes in the `repositories.database` package
- Planned support for:
  - MySQL/PostgreSQL for relational data
  - MongoDB for document storage
  - Redis for caching

### Implementation Strategy
1. **Database Repositories**
   - Implement connection management
   - Add transaction support
   - Implement SQL/NoSQL queries
   - Add connection pooling

2. **Migration Path**
   - Create database schemas
   - Implement data migration tools
   - Add database configuration
   - Implement connection pooling

3. **Future Features**
   - Caching layer
   - Read/Write splitting
   - Sharding support
   - Backup/Recovery mechanisms

 **Assignment 12:** : Service Layer and REST API Implementation

### Added
- REST API implementation with Spring Boot
- Course management endpoints
- User management endpoints
- Swagger API documentation
- Integration tests for API endpoints

### Technical Details
- Added Spring Boot dependencies
- Implemented REST controllers
- Added Swagger configuration
- Created API documentation

### API Documentation
Swagger UI is available at: http://localhost:8080/swagger-ui/


 **Assignment 13: Implementing CI/CD with GitHub Actions** 

## CI/CD Pipeline Documentation

### CI/CD Pipeline Workflow
Our pipeline implements the following workflow:

1. **Continuous Integration (CI)**
   - Triggers on every push and pull request
   - Builds the project using Maven
   - Runs all unit tests
   - Blocks PR merging if tests fail

2. **Continuous Deployment (CD)**
   - Activates only on main branch
   - Creates a new release with version number
   - Builds and uploads JAR artifact
   - Generates release documentation

3. **Branch Protection**
   - Main branch is protected
   - Requires pull request reviews
   - Requires CI checks to pass
   - Prevents direct pushes to main

### Pull Request Process
1. Create a new branch for your feature
2. Make your changes and commit
3. Create a pull request to main
4. Wait for CI checks to complete
5. Address any review comments
6. Merge once approved and all checks pass
