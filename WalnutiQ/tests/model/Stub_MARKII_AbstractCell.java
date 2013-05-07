package model;

import java.io.Serializable;

public abstract class Stub_MARKII_AbstractCell implements Serializable {
    protected boolean isActive;
    private int x;
    private int y;

    public Stub_MARKII_AbstractCell() {
	this.isActive = false;
    }

    public boolean getActiveState() {
	return this.isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getX() {
	return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
	return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (isActive ? 1231 : 1237);
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	MARKII_AbstractCell other = (MARKII_AbstractCell) obj;
	if (isActive != other.isActive)
	    return false;
	return true;
    }
}
