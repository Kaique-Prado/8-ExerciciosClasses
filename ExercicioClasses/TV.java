public class TV {
    private int canal, volume;

    public TV() {

    }

    public void setCanal(int numeroCanal) {
        if(numeroCanal>=100) {
            canal = 100;
            return;
        }
        else if(numeroCanal<=0) {
            canal =1;
            return;
        }
    }

    public void setVolume (int volume) {
        if(volume >= 100) {
            this.volume =100;
        }
        else if(volume < 0) {
            this.volume =0;
        }
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        TV tv = new TV();
        tv.setVolume(0);
        System.out.println("número do volume é:" + tv.getVolume());
    }

}
