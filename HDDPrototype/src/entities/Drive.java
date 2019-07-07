/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Alriosa
 */
public abstract class Drive {
    private String size;
    private String brand;
    private String transferSpeed;
    private boolean external=false;
    private String connectionType;

    public Drive() {
    }

    public Drive(String size, String brand, String transferSpeed, String connectionType) {
        this.size = size;
        this.brand = brand;
        this.transferSpeed = transferSpeed;
        this.connectionType = connectionType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTransferSpeed() {
        return transferSpeed;
    }

    public void setTransferSpeed(String transferSpeed) {
        this.transferSpeed = transferSpeed;
    }

    public boolean isExternal() {
        return external;
    }

    public void setExternal(boolean external) {
        this.external = external;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Drive{" + "size=" + size + ", brand=" + brand + ", transferSpeed=" + transferSpeed + ", external=" + external + ", connectionType=" + connectionType + '}';
    }
    
    
    
}
