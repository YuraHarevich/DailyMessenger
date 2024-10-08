package ru.Harevich.Messenger.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@NoArgsConstructor
@Getter
@Setter
public class Message {
    @Id
    private String id;
    private int chat_id;
    private String text;
    private Date timestamp;
    private int user_id;
    private boolean read;

}
