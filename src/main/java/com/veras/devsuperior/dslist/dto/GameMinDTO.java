package com.veras.devsuperior.dslist.dto;

import com.veras.devsuperior.dslist.entities.Game;
import com.veras.devsuperior.dslist.projections.GameMinProjection;
import jakarta.persistence.Column;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entitty){
        id = entitty.getId();
        title = entitty.getTitle();
        year = entitty.getYear();
        imgUrl = entitty.getImgUrl();
        shortDescription = entitty.getShortDescription();
    }
    //Criando um construtor para o GameMinProjection
    public GameMinDTO(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
