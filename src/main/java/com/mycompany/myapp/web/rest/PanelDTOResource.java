package com.mycompany.myapp.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.mycompany.myapp.repository.PanelDTORepository;
import com.mycompany.myapp.service.dto.LightBarDTO;
import com.mycompany.myapp.service.dto.PanelDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PanelDTOResource {
    private final Logger log = LoggerFactory.getLogger(PanelDTOResource.class);
    private final PanelDTORepository panelDTORepository;


    public PanelDTOResource(PanelDTORepository panelDTORepository) {
        this.panelDTORepository = panelDTORepository;
    }

    @GetMapping("/panel")
    @Timed
    public String getPanelDTO(@RequestBody PanelDTO panelDTO){
        List<LightBarDTO> lightBarDTOList=panelDTO.getLightBarDTOS();
        String sn=panelDTO.getSn();
        return "ok";
    }

    @PostMapping("/panel/save")
    @Timed
    public String savePanelDTO(@RequestBody PanelDTO panelDTO){
        List<LightBarDTO> lightBarDTOList=panelDTO.getLightBarDTOS();
        String sn=panelDTO.getSn();
        panelDTORepository.save(panelDTO);
        return "ok";
    }

    @GetMapping("/panel/find")
    @Timed
    public List<PanelDTO> findPanelDTO(){
        List<PanelDTO> panelDTOS=panelDTORepository.findAll();
        return panelDTOS;
    }
}
