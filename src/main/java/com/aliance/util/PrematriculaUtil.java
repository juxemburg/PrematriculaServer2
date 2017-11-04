package com.aliance.util;

import java.util.Calendar;
import java.util.Date;

public class PrematriculaUtil {


    public String getPeriodo(Date fecha) {
        String periodo = "";
        Calendar cal = Calendar.getInstance();
        cal.setTime(fecha);
        periodo = cal.get(Calendar.YEAR)+"-"+
                getPeriodoAnio(cal.get(Calendar.MONTH));
        return periodo;
    }
    private int getPeriodoAnio(int mes) {
        return 1+(int)Math.floor(mes/6);
    }
}
