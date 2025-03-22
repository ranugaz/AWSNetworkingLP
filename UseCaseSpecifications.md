
The use case specifications provides a detailed overview of key functionalities in the AWS Networking Learning Platform, covering user management, course interactions, content management, and system administration.  

1.  Register Account (UC1)

Description: Allows new users to create an account on the AWS Networking Learning Platform. Preconditions: User is not logged in and doesn't have an existing account. Postconditions: New user account is created and stored in the system. Basic Flow:

    User selects "Register" option.
    System displays registration form.
    User enters required information (name, email, password).
    System validates input.
    System creates account and sends verification email.
    User verifies email.
    System activates account. Alternative Flows:

    If email already exists, system notifies user and suggests login.
    If password doesn't meet requirements, system prompts for a new password.

 2. Authenticate User (UC2)

Description: Verifies user credentials for system access. Preconditions: User has a registered account. Postconditions: User is logged in and granted appropriate access. Basic Flow:

    User enters username/email and password.
    System validates credentials.
    System grants access and redirects to dashboard. Alternative Flows:

    If credentials are invalid, system displays error and allows retry.
    If user forgets password, system offers password reset option.

  3.  View Course Catalog (UC3)

Description: Allows students to browse available AWS networking courses. Preconditions: User is logged in as a student. Postconditions: User views list of available courses. Basic Flow:

    Student selects "Course Catalog" option.
    System retrieves list of available courses.
    System displays courses with brief descriptions.
    Student can scroll through or search the catalog. Alternative Flows:

    If no courses are available, system displays appropriate message.
    If search yields no results, system suggests broadening search criteria.

   4. Enroll in Course (UC4)

Description: Enables students to enroll in a selected AWS networking course. Preconditions: User is logged in as a student and has selected a course. Postconditions: Student is enrolled in the course. Basic Flow:

    Student selects "Enroll" for a specific course.
    System checks enrollment prerequisites.
    System confirms enrollment availability.
    Student confirms enrollment.
    System adds course to student's enrolled courses. Alternative Flows:

    If prerequisites not met, system notifies student of requirements.
    If course is full, system offers waitlist option.

  5.  Access Course Material (UC5)

Description: Provides enrolled students access to course content. Preconditions: Student is logged in and enrolled in the course. Postconditions: Student can view and interact with course materials. Basic Flow:

    Student selects an enrolled course.
    System displays course structure and available materials.
    Student selects specific content (e.g., video, text, quiz).
    System loads and displays the selected content. Alternative Flows:

    If content fails to load, system offers refresh option or reports error.
    If student hasn't completed prerequisites, system suggests required modules.

  6. Complete Assessment (UC6)

Description: Allows students to take quizzes or exams within a course. Preconditions: Student is enrolled in the course and has accessed the assessment section. Postconditions: Assessment is completed and scored. Basic Flow:

    Student initiates the assessment.
    System presents questions one by one or all at once.
    Student answers questions.
    Student submits assessment.
    System grades assessment and displays results. Alternative Flows:

    If time limit is reached, system auto-submits assessment.
    If student loses connection, system saves progress for later continuation.

7. Manage Course Content (UC9)

Description: Enables instructors to create, edit, and organize course materials. Preconditions: User is logged in as an instructor. Postconditions: Course content is updated in the system. Basic Flow:

    Instructor selects course to manage.
    System displays content management interface.
    Instructor adds/edits/removes content (text, video, quizzes).
    Instructor organizes content structure.
    Instructor saves changes.
    System updates course materials. Alternative Flows:

    If content upload fails, system retries or prompts for different format.
    If unsaved changes exist, system prompts to save before exiting.

 8.   Monitor System Performance (UC12)

Description: Allows admins to view and analyze system metrics. Preconditions: User is logged in as an admin. Postconditions: Admin has viewed current system performance data. Basic Flow:

    Admin accesses performance monitoring dashboard.
    System displays key metrics (user activity, server load, etc.).
    Admin selects specific timeframe or metric for detailed view.
    System generates and displays detailed reports. Alternative Flows:

    If data is unavailable, system displays last known good data and error message.
    If performance issues detected, system alerts admin with recommendations.
