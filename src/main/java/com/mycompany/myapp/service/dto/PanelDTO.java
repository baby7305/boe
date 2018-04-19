package com.mycompany.myapp.service.dto;

import java.util.List;

public class PanelDTO {
    private String sn;
    private List<LightBarDTO> lightBarDTOS;
    private String pcbCode;
    private String wholeMachineInformation;
    private String powerPanel;

    public PanelDTO() {
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public List<LightBarDTO> getLightBarDTOS() {
        return lightBarDTOS;
    }

    public void setLightBarDTOS(List<LightBarDTO> lightBarDTOS) {
        this.lightBarDTOS = lightBarDTOS;
    }

    public String getPcbCode() {
        return pcbCode;
    }

    public void setPcbCode(String pcbCode) {
        this.pcbCode = pcbCode;
    }

    public String getWholeMachineInformation() {
        return wholeMachineInformation;
    }

    public void setWholeMachineInformation(String wholeMachineInformation) {
        this.wholeMachineInformation = wholeMachineInformation;
    }

    public String getPowerPanel() {
        return powerPanel;
    }

    public void setPowerPanel(String powerPanel) {
        this.powerPanel = powerPanel;
    }

    @Override
    public String toString() {
        return "PanelDTO{" +
            "sn='" + sn + '\'' +
            ", lightBarDTOS=" + lightBarDTOS +
            ", pcbCode='" + pcbCode + '\'' +
            ", wholeMachineInformation='" + wholeMachineInformation + '\'' +
            ", powerPanel='" + powerPanel + '\'' +
            '}';
    }
}
