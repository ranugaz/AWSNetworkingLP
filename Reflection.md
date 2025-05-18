**Challenges faced in balancing stakeholder needs in seperate markdown**

In developing the System Requirements Document (SRD) for the AWS Networking Services Learning Platform, several challenges emerged in balancing the needs of various stakeholders. This reflection outlines key areas of difficulty and potential strategies for addressing them.

## 1. Rapid Technological Changes

**Challenge:** The fast-paced evolution of AWS services makes it difficult to keep content up-to-date, affecting multiple stakeholders including students, instructors, and employers.

**Strategy:** Develop an agile content update system and establish a direct line of communication with AWS for the latest updates. Consider implementing a version control system for course content.

## 2. Resource Allocation

**Challenge:** Limited resources (time and budget) make it challenging to fully satisfy all stakeholder requirements simultaneously.

**Strategy:** Prioritize features based on a combination of stakeholder importance and feasibility. Implement an iterative development approach, addressing critical needs first and gradually expanding.

## 3. Security vs. Usability

**Challenge:** While platform administrators prioritize robust security measures, students and instructors value ease of use and accessibility.

**Strategy:** Implement security measures that don't significantly impact user experience. Use single sign-on systems and intuitive security protocols to balance these needs.

## 4. Scalability vs. Personalization

**Challenge:** The need for a scalable platform conflicts with the desire for personalized learning experiences.

**Strategy:** Utilize AI and machine learning algorithms to provide personalized recommendations and learning paths within a scalable infrastructure.


**Assignment 5 Reflections:**

- Experienceing test cases for the AWS Networking Services Learning Platform presented several challenges. The process of translating stakeholder requirements into detailed use cases. 
- Capturing Non-Functional Requirements: While functional requirements easily translated into use cases, incorporating non-functional requirements such as performance, security, and scalability proved more challenging. 
- I find it challenging to create tables format, when trying to modify it, it breaks. 


**Assignment 6 Reflections:**

*Reflection: Challenges in Agile Planning for the AWS Networking Learning Platform*

As the sole stakeholder in planning the AWS Networking Learning Platform, I faced several internal challenges:

Prioritization Struggles: Balancing the desire for comprehensive features with the need for a focused MVP was challenging. 

Estimation Uncertainties: Without team input or past references, I constantly second-guessed my effort estimates. This was particularly evident with complex tasks like implementing the content management system.

Aligning with Agile Principles: Adapting to Agile's focus on flexibility and iterative development was uncomfortable. I resisted leaving some features undefined and had to consciously avoid over-specifying user stories and tasks.

Short-term vs. Long-term Vision: Balancing immediate sprint goals with the platform's long-term vision led to was quite challenging. Decisions about including foundational elements for future features in early sprints were particularly challenging.

**Assignment 7 Reflections:**

### Challenges in Selecting and Customizing the Template

1. Balancing Simplicity and Functionality:
   One of the main challenges was finding a template that was simple enough for quick adoption by the team, yet robust enough to handle the complexities of our AWS Networking Services Learning Platform project. The Automated Kanban template offered a good starting point, but required customization to fully meet our needs.

2. Adapting to Project-Specific Needs:
   Our project required specific columns like "In Review" and "Blocked", which weren't part of the standard templates. Adding these columns while maintaining the logical flow of tasks required careful consideration of our development process.

3. Setting Appropriate WIP Limits:
   Determining the right Work-in-Progress (WIP) limits for each column was challenging. We needed to balance between maintaining flow and allowing for the varying complexities of tasks in our learning platform development.

4. Integrating with Existing Workflows:
   Ensuring that the customized board integrated smoothly with our existing development practices, such as code reviews and QA processes, required some trial and error.

5. Team Adoption and Training:
   Getting the entire team on board with using the new system consistently was a challenge. It required clear communication and some initial training to ensure everyone understood how to use the board effectively.

### Comparison with Other Tools

1. GitHub vs. Trello:
   - Advantages of GitHub:
     * Tighter integration with code repositories
     * Built-in issue tracking and pull request features
     * Better suited for software development projects
   - Advantages of Trello:
     * More visually customizable
     * Easier to use for non-technical team members
     * Better for general project management beyond coding

2. GitHub vs. Jira:
   - Advantages of GitHub:
     * Simpler setup and learning curve
     * Free for public repositories
     * Excellent for open-source projects
   - Advantages of Jira:
     * More robust reporting and analytics
     * Greater customization for complex workflows
     * Better suited for large-scale enterprise projects

3. Overall Comparison:
   - GitHub Projects offers a good balance between simplicity and functionality, making it well-suited for our medium-sized development project.
   - While Trello might offer more visual customization, GitHub's integration with our codebase makes it more efficient for our development workflow.
   - Jira would provide more advanced features, but its complexity might be overkill for our current project size and could slow down our agile processes.

While each tool has its strengths, GitHub Projects provides the right mix of features, integration, and ease of use for our AWS Networking Services Learning Platform project. Its direct connection to our code repository and familiar interface for developers made it the most suitable choice, despite some limitations in advanced customization compared to specialized project management tools.

**Assignment 8 Reflections:**

In developing the state transition and activity diagrams for the AWS Networking Services Learning Platform, I encountered several challenges. Balancing the level of detail with overall readability was crucial, requiring careful consideration of which states and actions to include without overwhelming the diagrams. Aligning these diagrams with Agile user stories presented its own difficulties, as I needed to bridge the gap between high-level user requirements and detailed system behaviors. Despite the challenges, creating these diagrams significantly improved my understanding of the system's architecture and helped ensure that my  design aligned closely with both functional requirements and user needs.

## Balancing Detail vs. Readability: ##

    Challenge: Determining the right level of detail to include in both state and activity diagrams without overwhelming the viewer or losing critical information.
    Example: In the Course Progress Tracking workflow, I could have broken down "Student Engages with Content" into multiple sub-actions for each content type, but this might have made the diagram too complex. However, I tried to keep the main flow simple.

    Challenge: Some objects, like User Accounts, have multiple attributes that could be considered states (e.g., verified, logged in, role).
    Example: In the User Account state diagram, I focused on primary states like "Active" and "Suspended" rather than creating separate states for every possible combination of attributes.

## Comparison of State Diagrams vs. Activity Diagrams: ##

    State Diagrams: Focus on the lifecycle of a single object or entity (e.g., User Account, Course).
    Activity Diagrams: Represent the flow of actions in a process or use case (e.g., User Registration Workflow).

    State Diagrams: Object-centric, showing how an object's state changes in response to events.
    Activity Diagrams: Process-centric, showing the sequence of activities and decisions in a workflow.

    State Diagrams: Useful for modeling complex objects like User Accounts, Courses, and Content Items, which have distinct states and transitions throughout their lifecycle in the learning platform.
    Activity Diagrams: Ideal for modeling workflows like Course Enrollment, Quiz Taking, and Content Creation, which involve multiple steps, decisions, and potentially multiple actors.

In the context of  AWS Networking Services Learning Platform, both types of diagrams complement each other. State diagrams help in understanding the behavior of key entities in the system, while activity diagrams are crucial for mapping out the complex processes that make up the core functionality of the learning platform. 

**Assignment 9 Reflections:**

Challenges Faced:

One of the challenges I faced was determining the right level of abstraction for the classes. Initially, I found myself getting so much information with the User class, including every possible attribute. I had to step back and stick to a goal of creating a clear, maintainable design, not document every piece of data. For example, I struggled with whether to create separate classes for different types of content (video, PDF, text) before realizing that a single Content class with a type attribute would be asy to maintain.

 I spent considerable time tryiing to discver the relationships between classes. Deciding how to model the connection between Users, Courses, and Progress was challenging. At first, I tried using direct associations, but this created a complicated interlinks that started to confuse myself. After several iterations, I realized that introducing the Enrollment class as an intermediary would create a simple design.

Alignment with Previous Work:

Considering earlier assignments, I'm pleased to see how well the class diagram aligns with the requirements and use cases I defined. For instance, the Quiz class methods directly support the quiz-taking use case I detailed in Assignment 5, including features like attempt tracking and immediate feedback. The state diagrams from Assignment 8 helped me identify important methods for the Course class, such as publish() and unpublish(), which I might have overlooked otherwise.

Design Trade-offs:

One of the trade-off was choosing between inheritance and composition for content management.However, I chose a flecible composition approach with a single Content class and a ContentType enumeration. While this might mean writing more conditional logic in the content handling code, I believe it will be easy to maintain. 

Lessons Learned:

This exercise has taught me several valuable lessons about object-oriented design:

    I learned that it is better to start with a simpler design and add complexity only when necessary. My first attempts were overly complicated, but I tried to narrow it down.

    Initially, I focused too much on attributes and not enough on behaviors. When I shifted to thinking about what each class needs to do rather than what it needs to store, I was a able to approach the design.

    This experience has definitely improved my approach to system design, and I will carry these lessons forward into future projects. Most importantly, I've learned that good design is an iterative process - it's okay to revise and refine as understanding of the system grows.

**Assignment 14 Reflections:**

*How I Improved My Repository Based on Peer Feedback*

Receiving feedback from my classmates really helped me improve the repository. At first, the documentation wasn’t as clear as it could be. Some of my peers mentioned that it wasn’t easy to get started with the project because there weren’t enough details on how to set it up or contribute. Based on that, I updated the README file to provide a more thorough explanation of the project’s purpose, as well as a clear guide on how to set up the development environment and run the application. This made it easier for anyone who wanted to contribute to understand the project quickly.

Another suggestion from my peers was to improve the code structure and make it more modular. There were parts of the code that were difficult to follow, so I spent time refactoring those areas. This made the code cleaner and more maintainable, not just for me but for anyone who might work on the project in the future.

*Challenges in Onboarding Contributors*

Since this is a school project and we are all in the same class, onboarding contributors wasn’t as complicated as it would be for an open-source project with people from all over the world. However, one challenge I faced was making sure that everyone understood how to contribute and where they could help. Some classmates were unsure about where to start, so I made sure to label tasks as “good first issues” and organized the project better so that new contributors could easily find ways to get involved.

*⁠Lessons Learned About Open-Source Collaboration*

One of the biggest lessons I learned about open-source collaboration was how important communication and organization are. Although this project was for school, the principles are the same. Having clear documentation and a structured workflow was essential for making sure everyone knew what to do and how to do it. I also realized how valuable it is to make newcomers feel welcome, even if they’re just classmates. Providing them with tasks that align with their skill levels helps build confidence and keeps the project moving forward.

Another lesson I learned was the importance of giving and receiving feedback. As a project maintainer, I had to make sure that I communicated what changes were needed without discouraging contributors. It’s important to be specific and offer suggestions for improvement rather than just pointing out issues. On the flip side, I also had to learn to take constructive criticism without feeling defensive. We all want the project to be the best it can be, and learning to collaborate effectively makes it a smoother process.

## Conclusion

Balancing diverse stakeholder needs in the AWS Networking Services Learning Platform has been challenging. However, by adopting flexible strategies, prioritizing effectively, I can create a platform that addresses core needs while remaining adaptable to future changes and requirements.

In the end, I learned that open-source collaboration is not just about coding but about creating a community. Even in a small, class-based project like ours, the same principles apply. Clear communication, well-defined goals, and mutual respect make the collaboration more enjoyable and productive for everyone involved.

Overall, despite the challenges, it was quite a great learning experience about using agile.
