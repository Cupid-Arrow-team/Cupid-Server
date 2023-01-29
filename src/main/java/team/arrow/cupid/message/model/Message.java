package team.arrow.cupid.message.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import team.arrow.cupid.global.common.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Message extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    private Long senderId;

    private Long receiverId;

    private String message;

    private LocalDateTime readTime;

    public Message(Long senderId, Long receiverId, String message) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.message = message;
    }

    public void readMessage() {
        this.readTime = LocalDateTime.now();
    }

}
