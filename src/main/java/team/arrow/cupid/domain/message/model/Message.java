package team.arrow.cupid.domain.message.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import team.arrow.cupid.global.common.BaseTimeEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Message extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    Long senderId;

    @Column(nullable = false)
    Long receiverId;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    String message;

    Boolean isRead = false;

    LocalDateTime readTime = null;

    public Message(Long senderId, Long receiverId, String message) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.message = message;
    }

    public void readMessage() {
        isRead = true;
        readTime = LocalDateTime.now();
    }

}
