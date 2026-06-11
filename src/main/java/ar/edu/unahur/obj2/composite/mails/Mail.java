package ar.edu.unahur.obj2.composite.mails;

import ar.edu.unahur.obj2.composite.agrupables.Agrupable;
import ar.edu.unahur.obj2.composite.filtros.DefaultFiltroSimple;

public class Mail {
    private String from;
    private String to;
    private String asunto;
    private Integer tamanio;
    private Boolean archivosAdjuntos;
    private String cuerpo;
    
    private Agrupable filtro;

    public Mail(String from, String to, String asunto, Integer tamanio, 
        Boolean archivosAdjuntos, String cuerpo) {
        this.from = from;
        this.to = to;
        this.asunto = asunto;
        this.tamanio = tamanio;
        this.archivosAdjuntos = archivosAdjuntos;
        this.cuerpo = cuerpo;
        filtro = new DefaultFiltroSimple(this);
    }

    public Boolean filtrate(){
        return filtro.aplicar();
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAsunto() {
        return asunto;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public Boolean getAdjunto() {
        return archivosAdjuntos;
    }

    public String getCuerpo(){
        return cuerpo;
    }
    public Agrupable getFiltro() {
        return filtro;
    }

    
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setFiltro(Agrupable filtro){
        this.filtro = filtro;
    }
}
