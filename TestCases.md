The table includes 8 functional test cases (TC-F01 to TC-F08) and 2 non-functional test cases (TC-NF01 and TC-NF02).

```
| Test Case ID | Requirement ID | Description | Steps | Expected Result | Actual Result | Status (Pass/Fail) |
|--------------|----------------|-------------|-------|-----------------|---------------|-------------------|
| TC-F01 | F1.1 | Student Registration with Email Verification | 1. Navigate to registration page<br>2. Enter valid details<br>3. Submit form<br>4. Check email<br>5. Click verification link | Account created and verified | | |
| TC-F02 | F2.1 | Searchable Course Catalog | 1. Log in as student<br>2. Navigate to course catalog<br>3. Enter "AWS Networking" in search bar<br>4. Click search | Relevant AWS Networking courses displayed | | |
| TC-F03 | F3.2 | Support for Various Content Types | 1. Log in as instructor<br>2. Create new course module<br>3. Upload text, video, and PDF content<br>4. Save module<br>5. View as student | All content types load and display correctly | | |
| TC-F04 | F4.2 | Timed Quiz Session | 1. Log in as student<br>2. Start a timed quiz<br>3. Answer questions<br>4. Let timer expire | Quiz auto-submits when time is up | | |
| TC-F05 | F5.1 | Course Completion Percentage | 1. Log in as student<br>2. Complete 2 out of 4 modules in a course<br>3. Check progress dashboard | Course shows 50% completion | | |
| TC-F06 | F6.2 | Discussion Forums for Each Course | 1. Log in as student<br>2. Navigate to enrolled course<br>3. Access discussion forum<br>4. Create new post<br>5. Reply to existing post | New post and reply appear in course-specific forum | | |
| TC-F07 | F3.4 | Progress Saving within Lessons | 1. Log in as student<br>2. Start a lesson<br>3. Complete half the content<br>4. Log out<br>5. Log back in and return to lesson | Lesson resumes from last viewed point | | |
| TC-F08 | F4.3 | Immediate Feedback on Quiz Submissions | 1. Log in as student<br>2. Start a quiz<br>3. Answer all questions<br>4. Submit quiz | Immediate display of score and correct/incorrect answers | | |
| TC-NF01 | NF1.1 | Page Load Time Test | 1. Identify 10 key pages<br>2. Use performance testing tool<br>3. Load each page 100 times<br>4. Calculate average load time | All pages load in < 3 seconds on average | | |
| TC-NF02 | NF3.2 | Password Security Test | 1. Create test user account<br>2. Access database directly<br>3. Locate password field for test user<br>4. Attempt to decrypt/read password | Password is hashed and salted, not readable in plain text | | |
```

