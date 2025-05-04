package com.awslearning.repositories;

import com.awslearning.models.Content;
import com.awslearning.enums.ContentType;
import java.util.List;

public interface ContentRepository extends Repository<Content, String> {
    // Additional content-specific methods
    List<Content> findByType(ContentType type);
    List<Content> findByCourseId(String courseId);
}