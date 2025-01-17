public class funciones3_4 {
    byte vel = 0;
    boolean respuesta = false;

    //consulta velocidad
    public byte getVel() {
        return vel;
    }

    //Aumentar velocidad
    public String aumentarVel() {
        if (respuesta == true && vel < 8 && vel >= 0) {
            vel++;
            return "Velocidad aumentada a " + vel;
        } else if (vel == 8) {
            return "Velocidad máxima alcanzada";
        } else {
            return "";
        }
    }
}
