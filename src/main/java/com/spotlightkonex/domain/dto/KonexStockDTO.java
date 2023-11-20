package com.spotlightkonex.domain.dto;

import lombok.*;

@Getter
@Builder
@RequiredArgsConstructor
public class KonexStockDTO {
    public final String corpCode; //기업 고유번호
    public final String corpName; //법인명
    public final String logo; //기업 로고
}