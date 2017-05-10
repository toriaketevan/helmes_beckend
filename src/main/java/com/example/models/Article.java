package com.example.models;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Amelie on 5/10/2017.
 */
@Entity
@Data
public class Article {
    @Id
    @GeneratedValue
    Long id;

    String title;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    Date date;
    String text;
}
