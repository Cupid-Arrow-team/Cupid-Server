package team.arrow.cupid.domain.report.domain;


import lombok.*;
import team.arrow.cupid.global.common.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@Table(name = "report_table")
public class Report extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long reportId;

    @Column(name = "report_title", length = 30)
    private String reportTitle;

    @Column(name = "report_body")
    private String reportBody;

    @Column(name = "report_user_id")
    private Long reportUserId;

    //회원 테이블

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "report_type_id")
    private ReportType reportType;

    public Report() {

    }

    public Report(String reportTitle, String reportBody, Long reportUserId, ReportType reportType) {
        this.reportTitle = reportTitle;
        this.reportBody = reportBody;
        this.reportUserId = reportUserId;
        this.reportType = reportType;
    }

    public Report createReport(
            final String reportTitle, final String reportBody, final Long reportUserId, final ReportType reportType
    ) {
        return new Report(reportTitle, reportBody, reportUserId, reportType);
    }

    public void updateReport(final Report updateReport) { // updateReport => updateReportDto 로 만든 Report 객체
        changeTitle(updateReport.getReportTitle());
        changeBody(updateReport.getReportBody());
        changeReportUserId(updateReport.getReportUserId());
        changeType(updateReport.getReportType());
    }


    private void changeTitle(final String title) { this.reportTitle = title; }

    private void changeBody(final String body) { this.reportBody = body; }

    private void changeReportUserId(final Long userId) { this.reportUserId = userId; }

    private void changeType(final ReportType type) { this.reportType = type; }
}
