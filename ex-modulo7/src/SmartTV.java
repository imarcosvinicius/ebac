/**
 * @author Marcos Vinícius
 * @version 1.0
 * @since 06/2023
 */
public class SmartTV {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public void ligarTV() {
        this.ligada = true;
    }

    public void desligarTV() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void proximoCanal() {
        this.canal++;
    }

    public void anteriorCanal() {
        this.canal--;
    }

}
