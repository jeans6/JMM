package com.wassup.jmm.common.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class BaseResponseBody {
	String result;
	Object data;
	
	public static BaseResponseBody of(String result) {
        return BaseResponseBody.builder()
                .result(result)
                .build();
    }
	
	public static BaseResponseBody of(String result, Object data) {
        return BaseResponseBody.builder()
                .result(result)
                .data(data)
                .build();
    }
}
