package team.arrow.cupid.domain.report.domain;


import lombok.*;
import team.arrow.cupid.global.common.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Report extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id", updatable = false)
    private Long id;

    @Column(name = "title", length = 30, unique = true)
    private String title;

    @Column(name = "content", length = 300)
    private String content;

    @Column(name = "targetUserId")
    private Long targetUserId;

    //회원 테이블

    @Enumerated(EnumType.STRING)
    @Column(name = "report_type")
    private ReportType reportType;

    @Builder
    public Report(String title, String content, Long targetUserId, ReportType reportType) {
        this.title = title;
        this.content = content;
        this.targetUserId = targetUserId;
        this.reportType = reportType;
    }

    public void updateReport(final Report updateReport) { // updateReport => updateReportDto 로 만든 Report 객체
        this.title = updateReport.getTitle();
        this.content = updateReport.getContent();
        this.targetUserId = updateReport.getTargetUserId();
        this.reportType = updateReport.getReportType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // 자기 자신의 참조 값과 o 동일성 비교

        if (id == null || !(o instanceof Report)) return false;
        // id가 null이 아니고 o가 Report에 속하지 않을 때

        final Report report = (Report) o;

        return id.equals(report.getId());
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    } // id 존재 여부로 해시키 리턴
}
