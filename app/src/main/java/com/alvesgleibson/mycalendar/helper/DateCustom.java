package com.alvesgleibson.mycalendar.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateCustom {

    private static Calendar cal = Calendar.getInstance();

    //Informação para o Firebase
    private static SimpleDateFormat sdf = new SimpleDateFormat("MMyyyy");

    //Informação para o sistema(mostrar para o usuário)
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");

    //informação Inicial
    private static SimpleDateFormat sdf3 = new SimpleDateFormat("MM/yyyy");


    public static String dateFirebase(int in){
        if (in == 0){
            cal.add(Calendar.MONTH, -1);
        }else {
            cal.add(Calendar.MONTH, 1);
        }
        return sdf.format( cal.getTime() );
    }

    public static String dateShowUser(){
        return sdf2.format( cal.getTime() );
    }

    public static String dateNow(){
        return sdf3.format( cal.getTime() );
    }





}
