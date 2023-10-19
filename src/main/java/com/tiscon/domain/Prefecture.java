package com.tiscon.domain;

import java.io.Serializable;

public class Prefecture implements Serializable {

    private String prefectureId;

    private String prefectureName;

    public String getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(String prefectureId) {
        this.prefectureId = prefectureId;
    }

    public String getPrefectureName() {
        return prefectureName;
    }

    public void setPrefectureName(String prefectureName) {
        this.prefectureName = prefectureName;
    }
}
