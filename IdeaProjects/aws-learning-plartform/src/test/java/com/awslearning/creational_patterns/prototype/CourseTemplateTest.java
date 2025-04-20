package com.awslearning.creational_patterns.prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTemplateTest {

    @Test
    public void testCloneTemplate() {
        CourseTemplateRegistry registry = new CourseTemplateRegistry();

        CourseTemplate original = registry.getTemplate("networking");
        assertNotNull(original);

        CourseTemplate clone = original.clone();
        assertNotNull(clone);
        assertNotSame(original, clone); // Ensures they are different objects
    }

    @Test
    public void testCustomizeClonedTemplate() {
        CourseTemplateRegistry registry = new CourseTemplateRegistry();

        CourseTemplate template1 = registry.getTemplate("networking");
        template1.customize("NET101", "John Doe");

        CourseTemplate template2 = registry.getTemplate("networking");
        template2.customize("NET102", "Jane Smith");

        // Ensure customization doesn't affect other instances
        assertNotEquals(template1.toString(), template2.toString());
    }

    @Test
    public void testNonExistentTemplate() {
        CourseTemplateRegistry registry = new CourseTemplateRegistry();
        CourseTemplate template = registry.getTemplate("nonexistent");
        assertNull(template);
    }
}