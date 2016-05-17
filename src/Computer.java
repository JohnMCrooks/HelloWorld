/*
 * Copyright (c) 2016.
 */

/**
 * Created by johncrooks on 5/16/16.
 */
public class Computer {
    String processor;
    int monitorSize;
    int hdSize;
    boolean powerState;

    public Computer(String processor, int monitorSize, int hdSize, boolean powerState) {
        this.processor = processor;
        this.monitorSize = monitorSize;
        this.hdSize = hdSize;
        this.powerState = powerState;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(int monitorSize) {
        this.monitorSize = monitorSize;
    }

    public int gethdSize() {
        return hdSize;
    }

    public void sethdSize(int newhdSize) {
        hdSize = hdCompliance(newhdSize);
    }

    public boolean isPowerState() {
        return powerState;
    }

    public void setPowerState(boolean powerState) {
        this.powerState = powerState;
    }

    public int hdCompliance(int newhdSize){
        //Let's be real, No one has a hard drive any smaller as their primary anymore
        if (newhdSize <256){
            return 256;
        }else{
            return newhdSize;
        }
    }
}
