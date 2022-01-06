package com.gsheet.gsheetsender.dto.common;

import lombok.Getter;

import static com.gsheet.gsheetsender.dto.common.ResultData.DetailMessage.*;

public interface ResultData {
    @Getter
    enum ResultCode {
        SUCCESS("2000", "성공", null),
        FAIL("4000", "실패", new DetailMessage[]{ETC_FAIL});

        private String code;
        private String message;
        private DetailMessage[] detailMessage;

        ResultCode(String code, String message, DetailMessage[] detailMessage) {
            this.code = code;
            this.message = message;
            this.detailMessage = detailMessage;
        }

        public DetailMessage getDetailMessage(int index){
            if(detailMessage.length-1 < index)
                return NONE;

            return detailMessage[index];
        }
    }

    @Getter
    enum DetailMessage{
        NONE(""),
        ETC_FAIL("기타 실패");
        private String message;

        DetailMessage(String message) {
            this.message = message;
        }
    }
}
