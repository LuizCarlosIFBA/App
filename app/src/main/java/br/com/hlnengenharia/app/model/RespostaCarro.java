package br.com.hlnengenharia.app.model;

import java.io.Serializable;

public class RespostaCarro implements Serializable {
    private Long id;
    private Long idCarro;
    private Long idPergunta;
    private Long idHora;
    private String resposta;
    private String obs;

    public Long getIdHora() {
        return idHora;
    }

    public void setIdHora(Long idHora) {
        this.idHora = idHora;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(Long idCarro) {
        this.idCarro = idCarro;
    }

    public Long getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(Long idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

}
