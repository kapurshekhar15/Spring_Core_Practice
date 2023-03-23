package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demp {

	@Value("#{22+33}")
	private int x;

	@Value("#{22+11+99+1+7}")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;

	@Value("#{ new java.lang.String('Shekhar') }")
	private String name;

	@Value("#{ 8>3 }") // we need to write a expression which must be return boolean value !!!
	private boolean isActive;

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Demp [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}

}
