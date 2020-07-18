package org.xjtu.nidaqmx4j;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Union;
/**
 * <i>native declaration : NIDAQmx.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CVIAbsoluteTime extends Union {
	/** C type : CVITime */
	public CVITime cviTime;
	/** C type : uInt32[4] */
	public NativeLong[] u32Data = new NativeLong[4];
	public CVIAbsoluteTime() {
		super();
	}
	/** @param cviTime C type : CVITime */
	public CVIAbsoluteTime(CVITime cviTime) {
		super();
		this.cviTime = cviTime;
		setType(CVITime.class);
	}
	/** @param u32Data C type : uInt32[4] */
	public CVIAbsoluteTime(NativeLong u32Data[]) {
		super();
		if ((u32Data.length != this.u32Data.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.u32Data = u32Data;
		setType(NativeLong[].class);
	}
	public CVIAbsoluteTime(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CVIAbsoluteTime implements com.sun.jna.Structure.ByReference {
		
	};
	public static class ByValue extends CVIAbsoluteTime implements com.sun.jna.Structure.ByValue {
		
	};
}
