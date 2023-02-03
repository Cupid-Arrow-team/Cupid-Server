package team.arrow.cupid.domain.report.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public enum ReportType {
    REVENGE_PORNO("음란물 유포"),
    FRAUD_AND_BLACKMAIL("사기 및 협박");

    private String reason;

    /**
     * enum class는 상수들의 집합으로 컴파일 시, 이미 모든 값을 알아야하고
     * 외부에서 호출 될 수가 없기 때문에 생성자를 private으로 선언 해야 함.
     */
    private ReportType(String reason) {
        this.reason = reason;
    }
}
