examen2 Ursol

crea diagrama de clase

https://lucid.app/lucidchart/5b0a89bf-d3ac-4d7e-ada9-44f014943752/edit?invitationId=inv_73e165a2-30e3-463a-bfa6-848daf832dba&page=0_0#


    public static boolean isNumeroDe_1_10(String str) {
        if (str.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') return false;
            }
            int mes = Integer.parseInt(str);
            if (mes < 1 || mes > 10) {
                return false;
            }
        }
        return true;
    }