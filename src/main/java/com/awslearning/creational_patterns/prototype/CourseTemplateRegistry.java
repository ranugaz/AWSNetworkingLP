// CourseTemplateRegistry.java
package com.awslearning.creational_patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class CourseTemplateRegistry {
    private Map<String, CourseTemplate> templates = new HashMap<>();

    public CourseTemplateRegistry() {
        loadDefaultTemplates();
    }

    private void loadDefaultTemplates() {
        templates.put("networking", new NetworkingCourseTemplate());
        // Add more templates as needed
    }

    public CourseTemplate getTemplate(String templateName) {
        CourseTemplate template = templates.get(templateName);
        return template != null ? template.clone() : null;
    }
}