package com.mycompany.myapp.service.dto;

public class LightBarDTO {
    private String length;
    private String width;
    private String type;

    public LightBarDTO() {
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LightBarDTO{" +
            "length='" + length + '\'' +
            ", width='" + width + '\'' +
            ", type='" + type + '\'' +
            '}';
    }
}
