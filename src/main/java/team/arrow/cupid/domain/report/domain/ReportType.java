package team.arrow.cupid.domain.report.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@Table(name = "report_type_table")
public class ReportType {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_type_id")
    private Long reportTypeId;

    @Column(name = "report_type", length = 20)
    private String reportType;

    @OneToMany(mappedBy = "reportType")
    private List<Report> report = new ArrayList<>();

    public ReportType() {
    }

    public ReportType(Long reportTypeId, String reportType) {
        this.reportTypeId = reportTypeId;
        this.reportType = reportType;
    }
}
