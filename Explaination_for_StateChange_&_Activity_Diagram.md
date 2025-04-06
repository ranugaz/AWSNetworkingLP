#  State Transition Diagrams Explaination #

# User Account #

    Key States: Unverified, Active, Suspended, Inactive
    Key Transitions:
        Registration triggers Unverified state
        Email verification activates the account
        Admin can suspend and reactivate accounts
        Inactivity leads to Inactive state
     Mapping to Functional Requirements:
        Addresses FR 1.1 (Student registration with email verification)
        Supports FR 1.2 (Secure login/logout functionality)
        Aligns with FR 1.5 (Role-based access control)

## Course ##

    Key States: Draft, UnderReview, Published, Archived
    Key Transitions:
        Course creation starts in Draft
        Review process before publishing
        Published courses can be archived or updated

    Mapping to Functional Requirements:
        Supports FR 2.1 (Searchable course catalog)
        Aligns with FR 2.2 (Course details page)
        Addresses aspects of FR 3.1 (Modular course structure)

## Enrollment ##

    Key States: Pending, Active, Completed, Dropped
    Key Transitions:
        Enrollment starts as Pending
        Becomes Active after payment
        Can be Completed or Dropped
    Mapping to Functional Requirements:
        Directly addresses FR 2.3 (Course enrollment and unenrollment functionality)
        Supports FR 2.4 (Access control for enrolled courses)
        Relates to FR 5.1 (Course completion percentage)

## Lesson ##

    Key States: InPreparation, ReadyForReview, Published, Deprecated
    Key Transitions:
        Lessons are prepared, reviewed, and published
        Can be deprecated and updated
    Mapping to Functional Requirements:
        Supports FR 3.1 (Modular course structure)
        Aligns with FR 3.2 (Various content types)
        Relates to FR 3.3 (Progress saving within lessons)

## Quiz ##

    Key States: Draft, Active, InProgress, Completed, Graded, Abandoned
    Key Transitions:
        Quizzes are drafted and activated
        Students progress through InProgress to Completed
        Quizzes are auto-graded
    Mapping to Functional Requirements:
        Directly addresses FR 4.1 (Multiple choice quiz creation and management)
        Supports FR 4.2 (Quiz sessions)
        Aligns with FR 4.3 (Immediate feedback on quiz submissions)

## Content Item ##

    Key States: Uploaded, Processing, Available, InUse, Archived
    Key Transitions:
        Content goes through processing before becoming available
        Can be used in lessons or archived
    Mapping to Functional Requirements:
        Supports FR 3.2 (Various content types)
        Relates to FR 3.1 (Modular course structure)
        Indirectly supports FR 2.2 (Course details page)

## Certificate ##

    Key States: Pending, Generated, Issued, Verified, Expired
    Key Transitions:
        Certificates are generated upon course completion
        Can be verified by employers
        Expire after a set time
    Mapping to Functional Requirements:
        While not explicitly mentioned in the function requirememts, this supports the overall goal of the learning platform by providing recognition for completed courses
        Indirectly relates to FR 5.1 and 5.2 (Progress tracking)


# Activity Diagrams Explaination #

## User Registration Workflow ##

This workflow addresses the student stakeholder's need for a smooth registration process and the platform administrator's requirement for verified user accounts. The email verification step ensures data accuracy and reduces the risk of fake accounts, addressing security concerns. The timeout mechanism helps maintain a clean user database, which is beneficial for system performance and data management.

## Course Enrollment Workflow ##

This workflow addresses the needs of both students and instructors. For students, it provides a clear path to enrollment, including prerequisite checks and payment processing. For instructors, it ensures that only qualified students can enroll, maintaining course integrity. The automatic updating of student records and confirmation emails improves administrative efficiency, addressing the platform administrators' needs for streamlined operations.

## Content Creation and Publishing Workflow ##

This workflow addresses the instructor's need for a comprehensive content creation process and the administrator's requirement for quality control. The iterative review process ensures high-quality content, meeting both student expectations and platform standards. The automatic notification to subscribed students upon publication helps in course promotion and student engagement, addressing the platform's need for active user participation.

## Quiz Taking and Grading Workflow ##

This workflow addresses the student's need for immediate feedback and the instructor's requirement for automated assessment. The auto-grading feature ensures consistency and saves time for instructors. The retry option with suggested review material supports the learning process, addressing the educational goals of the platform. Storing results allows for progress tracking, meeting both student and instructor needs for performance monitoring.

## Course Progress Tracking Workflow ##

This workflow addresses the student's need for clear progress tracking and the instructor's requirement for monitoring student engagement. The real-time progress updates provide immediate feedback to students, encouraging continued participation. The automated certificate issuance upon completion streamlines administrative tasks.

## Content Update and Version Control Workflow ##

This workflow addresses the need for keeping course content up-to-date, a crucial concern for instructors and students in the rapidly evolving field of AWS networking. The version control system ensures that updates are managed systematically, preserving the integrity of the course structure. The review process maintains quality standards, while the notification system keeps students informed of changes. Archiving old versions allows for reference if needed, addressing potential concerns about content consistency. This process supports the platform's goal of providing current, high-quality educational content.

## Peer Review and Discussion Workflow ##

This workflow addresses the need for collaborative learning and in-depth understanding, key concerns for both students and instructors. The peer review process encourages critical thinking and knowledge sharing among students. The instructor's final assessment ensures quality control and provides authoritative feedback. The discussion thread allows for further exploration of topics, promoting a deeper understanding of AWS networking concepts. This process supports the platform's educational goals by fostering an interactive and engaging learning environment. It also addresses the stakeholder interest in developing practical skills, as students learn to give and receive constructive feedback, a valuable skill in the professional world of AWS networking.

