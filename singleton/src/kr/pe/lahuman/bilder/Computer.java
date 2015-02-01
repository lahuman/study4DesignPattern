package kr.pe.lahuman.bilder;

/**
 * Created by lahuman on 2015. 1. 31..
 */
public class Computer {
    // required parameters
    private String hdd;
    private String ram;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
    }

    private Computer(ComputerBuilder builder){
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    @Override
    public String toString(){
        return "RAM= "+this.getRam()+", HDD="+this.getHdd()+", graphicsCard="+this.isGraphicsCardEnabled()+", bluetooth="+this.isBluetoothEnabled();
    }

    public static class ComputerBuilder {
        // required parameters
        private String hdd;
        private String ram;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


}
