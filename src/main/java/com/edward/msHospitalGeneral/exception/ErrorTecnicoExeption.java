package com.edward.msHospitalGeneral.exception;

public class ErrorTecnicoExeption extends RuntimeException{

    private final Throwable throwable;
    private final String codigo;
    private final String mensajeDebug;

    public ErrorTecnicoExeption(String codigo, Throwable error, Throwable throwable, String codigo1, String mensajeDebug){
        super(codigo,error);
        this.throwable = throwable;
        this.codigo = codigo1;
        this.mensajeDebug = mensajeDebug;


    }
    public ErrorTecnicoExeption(String codigo, String mensajeDebug){
        this.throwable = null;
        this.codigo = codigo;
        this.mensajeDebug = mensajeDebug;
    }

    public String getCodigo() {
        return codigo;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public String getMensajeDebug() {
        return mensajeDebug;
    }
}
