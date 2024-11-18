package com.veras.devsuperior.dslist.projections;

public interface GameMinProjection {
    //para cada atributo que visualizar na consulta usar metódos get
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
