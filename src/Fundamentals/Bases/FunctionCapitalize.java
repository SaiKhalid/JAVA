package Fundamentals.Bases;

public class FunctionCapitalize {
     static String capitalizer(String name){


            String capitalized=String.valueOf(name.charAt(0)).toUpperCase();
            String[] strToArr=name.split("");
            for(int i=1;i<strToArr.length;i++){
                if(strToArr[i-1].equals(" ")){
                    capitalized +=strToArr[i].toUpperCase();
                }else{
                    capitalized +=strToArr[i];
                }
            }
        return capitalized;
    }
    static String getInitialChar (String text) {
        String capitalizedTex = capitalizer(text);
        String[] textArray = capitalizedTex.split(" ");
        String initials = "";
        for (String word : textArray) {
            initials += word.charAt(0);
            }
        return initials;
    }
    }
