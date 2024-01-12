package com.kaiburr.kaiburrproject.model;

import com.mongodb.client.model.CollationStrength;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Collation;

import java.util.Date;

@Document(collection = "task")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    @Id
    private String id;
    private String name;
    private String assignee;
    private String project;
    private Date startTime;
    private String arunodhaiVProperty;
}
