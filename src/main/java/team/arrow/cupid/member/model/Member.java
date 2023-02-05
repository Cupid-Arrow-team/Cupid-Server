package team.arrow.cupid.member.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import team.arrow.cupid.global.common.BaseTimeEntity;
import team.arrow.cupid.member.model.repository.RoleType;

import javax.persistence.*;
@Getter
@Entity(name = "MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false , unique = true)
    private String username;

    @Column(length = 200, nullable = false)
    private String password;

    @Column(length = 12, nullable = false , unique = true)
    private String nickname;

    @Column(length = 100, nullable = false , unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    RoleType roleType;

    @Builder
    public Member(String username, String password, String nickname, String email, RoleType roleType) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.roleType = roleType;
    }

    // 비즈니스 로직
    public void changePassword(String password) {
        this.password = password;
    }

    public void changeNickname(String nickname) {
        this.nickname = nickname;
    }

    public void changeEmail(String email) {
        this.email = email;
    }

    // equals()AndHashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        return id.equals(member.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
