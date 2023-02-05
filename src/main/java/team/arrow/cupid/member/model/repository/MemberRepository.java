package team.arrow.cupid.member.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.arrow.cupid.member.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
