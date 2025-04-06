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



