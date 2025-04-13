```mermaid
classDiagram
    class User {
        -userId: String
        -email: String
        -password: String
        -name: String
        -role: UserRole
        -status: AccountStatus
        -lastLoginDate: Date
        +register()
        +login()
        +resetPassword()
        +updateProfile()
        +enrollInCourse()
    }

    class Course {
        -courseId: String
        -title: String
        -description: String
        -level: DifficultyLevel
        -status: CourseStatus
        -creationDate: Date
        -lastUpdated: Date
        +publish()
        +unpublish()
        +addLesson()
        +updateContent()
        +calculateProgress()
    }

    class Lesson {
        -lessonId: String
        -title: String
        -content: ContentType
        -duration: Integer
        -sequence: Integer
        -status: LessonStatus
        +view()
        +markComplete()
        +updateContent()
        +trackProgress()
    }

    class Quiz {
        -quizId: String
        -title: String
        -timeLimit: Integer
        -passingScore: Integer
        -attempts: Integer
        -questions: List~Question~
        +start()
        +submit()
        +grade()
        +reviewAttempt()
        +allowRetry()
    }

    class Progress {
        -progressId: String
        -userId: String
        -courseId: String
        -completedLessons: List~String~
        -quizScores: Map~String,Integer~
        -lastAccessed: Date
        +updateProgress()
        +calculateCompletion()
        +generateReport()
        +trackQuizScore()
    }

    class Content {
        -contentId: String
        -type: ContentType
        -data: Blob
        -format: String
        -duration: Integer
        -status: ContentStatus
        +upload()
        +validate()
        +serve()
        +archive()
        +update()
    }

    class Enrollment {
        -enrollmentId: String
        -enrollDate: Date
        -status: EnrollmentStatus
        +enroll()
        +unenroll()
        +updateStatus()
    }

    class Question {
        -questionId: String
        -text: String
        -type: QuestionType
        -options: List~String~
        -correctAnswer: String
        +validate()
        +grade()
    }

    %% Enums
    class UserRole {
        <<enumeration>>
        STUDENT
        INSTRUCTOR
        ADMIN
    }

    class ContentType {
        <<enumeration>>
        TEXT
        VIDEO
        PDF
        INTERACTIVE
    }

    %% Relationships
    User "1" -- "*" Enrollment : has
    User "1" -- "*" Progress : tracks
    Course "1" -- "*" Enrollment : contains
    Course "1" -- "*" Lesson : contains
    Course "1" -- "*" Quiz : includes
    Lesson "1" -- "*" Content : contains
    Quiz "1" -- "*" Question : consists of
    User "*" -- "1" UserRole : has
    Content "*" -- "1" ContentType : is of
    Progress "1" -- "1" Course : tracks
```

## Design Decisions Explanation:

This class diagram represents a structure of AWS Networking Services Learning Platform, showing all major classes and their relationships. It supports the functional requirements and use cases from previous assignments while maintaining clean object-oriented design principles.

    Class Structure:
        User class is central, connecting to Enrollment and Progress
        Course class manages educational content through Lessons and Quizzes
        Content class is separate from Lesson to allow reusability
        Progress class tracks both course and quiz completion

    Relationships:
        User-Course: Many-to-many through Enrollment class
        Course-Lesson: One-to-many composition
        Lesson-Content: One-to-many aggregation
        Quiz-Question: One-to-many composition

    Multiplicity:
        Users can enroll in multiple courses (1 to *)
        Courses can have multiple lessons (1 to *)
        Quizzes can have multiple questions (1 to *)

    Design Patterns:
        Composition used for course structure
        Aggregation for content management
        Separation of concerns between content and presentation

