# Domain Model

| Entity | Attributes | Methods | Relationships |
|--------|------------|---------|---------------|
| User | - userId: String<br>- email: String<br>- password: String<br>- name: String<br>- role: UserRole<br>- status: AccountStatus<br> | - register()<br>- login()<br>- resetPassword()<br>- updateProfile()<br>- enrollInCourse() | - Enrolls in many Courses<br>- Takes many Quizzes<br>- Creates/Views Content (for Instructor)<br>- Tracks Progress |
| Course | - courseId: String<br>- title: String<br>- description: String<br>- creationDate: Date<br>- lastUpdated: Date | - publish()<br>- addLesson()<br>- updateContent()<br>- calculateProgress() | - Contains many Lessons<br>- Has many Enrollments<br>- Created by Instructor<br>- Includes multiple Quizzes |
| Lesson | - lessonId: String<br>- title: String<br>- content: ContentType<br>- duration: Integer<br>- sequence: Integer<br>- status: LessonStatus | - view()<br>- markComplete()<br>- updateContent()<br>- trackProgress() | - Belongs to Course<br>- Contains Content Items<br>- Has Progress Tracking |
| Quiz | - quizId: String<br>- title: String<br>- timeLimit: Integer<br>- passingScore: Integer<br>- attempts: Integer<br>- questions: List<Question> | - start()<br>- submit()<br>- grade()<br>- reviewAttempt()<br>- allowRetry() | - Belongs to Lesson/Course<br>- Has many Questions<br>- Tracks Attempts |
| Progress | - progressId: String<br>- userId: String<br>- courseId: String<br>- completedLessons: List<String><br>- quizScores: Map<String, Integer><br>- lastAccessed: Date | - updateProgress()<br>- calculateCompletion()<br>- generateReport()<br>- trackQuizScore() | - Belongs to User<br>- Associated with Course<br>- Tracks Lessons and Quizzes |
| Content | - contentId: String<br>- type: ContentType<br>- data: Blob<br>- format: String<br>- duration: Integer<br>- status: ContentStatus | - upload()<br>- validate()<br>- serve()<br>- archive()<br>- update() | - Belongs to Lesson<br>- Created by Instructor<br>- Accessed by Students |

## Business Rules

1. User Management:
   - Users must verify email before accessing the platform
   - Passwords must meet minimum security requirements
   - Users can have one of three roles: Student, Instructor, or Admin

2. Course Access:
   - Students can enroll in multiple courses simultaneously
   - Course content is only accessible to enrolled students
   - Instructors can create and courses

3. Content Delivery:
   - Lessons must be completed in sequence
   - Content types include text, video, PDF

4. Assessment:
   - Quizzes have a configurable number of allowed attempts
   - Minimum passing score is customizable per quiz
   - Students must complete all lessons before final assessment

5. Progress Tracking:
   - Course completion requires finishing all lessons and passing all quizzes
   - Progress is automatically saved after each completed lesson
   - Course certificates are issued only after 100% completion

## Relationships

1. User-Course Relationship:
   - Many-to-Many through Enrollment
   - Students can enroll in multiple courses
   - Courses can have multiple enrolled students

2. Course-Lesson Relationship:
   - One-to-Many
   - Courses contain multiple lessons
   - Lessons belong to exactly one course

3. Lesson-Content Relationship:
   - One-to-Many
   - Lessons can have multiple content items
   - Content items belong to one lesson

4. User-Progress Relationship:
   - One-to-Many
   - Users have progress records for each enrolled course
   - Progress is tracked at both lesson and course levels

5. Course-Quiz Relationship:
   - One-to-Many
   - Courses can have multiple quizzes
   - Quizzes belong to one course or lesson
