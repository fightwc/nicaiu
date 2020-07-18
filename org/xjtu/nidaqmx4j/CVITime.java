package org.xjtu.nidaqmx4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : NIDAQmx.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CVITime extends Structure {
	/** C type : uInt64 */
	public long lsb;
	/** C type : int64 */
	public long msb;
	public CVITime() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("lsb", "msb");
	}
	/**
	 * @param lsb C type : uInt64<br>
	 * @param msb C type : int64
	 */
	public CVITime(long lsb, long msb) {
		super();
		this.lsb = lsb;
		this.msb = msb;
	}
	public CVITime(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CVITime implements Structure.ByReference {
		
	};
	public static class ByValue extends CVITime implements Structure.ByValue {
		
	};
}
