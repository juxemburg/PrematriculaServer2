package com.aliance.model;

import com.aliance.util.PrematriculaUtil;

import java.io.Serializable;

public class PrematriculaKey implements Serializable {

    private String idEst;
    private String idProg;
    private String periodo;
    private String compositeKey;

    public PrematriculaKey(String idEst, String idProg, String periodo) {
        this.idEst = idEst;
        this.idProg = idProg;
        this.periodo = periodo;
        this.compositeKey = idEst+idProg+periodo;
    }

    @Override
    public boolean equals(Object o) {
        try {
            PrematriculaKey key = (PrematriculaKey) o;
            return this.compositeKey.equals(key.compositeKey);
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return compositeKey.hashCode();
    }

}
