package io;

/**
 * Diese Klasse enthält Methoden zur Ein- und Ausgabe im Terminal
 * @author rafael
 */
public class IO {
	
	private static IOServer server = new IOServer(System.in, System.out, System.err);
	
	/**
	 * Gibt eine Zeile aus und springt in die nächste Zeile
	 * @param obj Das auzugebene Objekt
	 */
	public static <T> void println(T obj) {
		server.output().println(obj);
	}
	
	/**
	 * Gibt eine Zeile aus
	 * @param obj Das auzugebene Objekt
	 */
	public static <T> void print(T obj) {
		server.output().print(obj);
	}
	
	/**
	 * Gibt eine Zeile in Rot aus und springt in die nächste Zeile
	 * @param obj Das auzugebene Objekt
	 */
	public static <T> void error(T obj) {
		server.error(obj);
	}
	
	/**
	 * Liest einen double (Kommazahl) ein
	 * @param message Die Nachricht die ausgegeben werden soll
	 * @return Den eingegebenen Wert
	 */
	public static double readDouble (String message) {
		server.output().print(message);
		return readDouble();
	}
	
	/**
	 * Liest einen double (Kommazahl) ein
	 * @return Den eingegebenen Wert
	 */
	public static double readDouble () {
		double ret = 0;
		boolean valid = false;
		while (!valid) {
			String s = server.readLine().replaceAll(",", ".");
			if (s.isBlank() || s.isEmpty()) {
				server.error("Bitte eine Kommazahl eingeben!");
				continue;
			}
			
			try {
				ret = Double.parseDouble(s);
				valid = true;
			} catch (NumberFormatException e) {
				server.error("Bitte eine Kommazahl eingeben!");
				continue;
			}
		}
		return ret;
	}
	
	/**
	 * Liest einen float (Kommazahl) ein
	 * @param message Die Nachricht die ausgegeben werden soll
	 * @return Den eingegebenen Wert
	 */
	public static float readFloat (String message) {
		server.output().print(message);
		return readFloat();
	}
	
	/**
	 * Liest einen float (Kommazahl) ein
	 * @return Den eingegebenen Wert
	 */
	public static float readFloat () {
		float ret = 0;
		boolean valid = false;
		while (!valid) {
			String s = server.readLine().replaceAll(",", ".");
			if (s.isBlank() || s.isEmpty()) {
				server.error("Bitte eine Kommazahl eingeben!");
				continue;
			}
			
			try {
				ret = Float.parseFloat(s);
				valid = true;
			} catch (NumberFormatException e) {
				server.error("Bitte eine Kommazahl eingeben!");
				continue;
			}
		}
		return ret;
	}
	
	/**
	 * Liest ein Byte ein -127 - 127
	 * @param message Die Nachricht die ausgegeben werden soll
	 * @return Den eingegenden Wert
	 */
	public static byte readByte (String message) {
		server.output().print(message);
		return readByte();
	}
	
	/**
	 * Liest ein Byte ein -127 - 127
	 * @return Den eingegenden Wert
	 */
	public static byte readByte () {
		byte ret = 0;
		boolean valid = false;
		while (!valid) {
			String s = server.readLine().replaceAll(",", ".");
			if (s.isBlank() || s.isEmpty()) {
				server.error("Bitte ein Byte eingeben!");
				continue;
			}
			
			try {
				ret = Byte.parseByte(s);
				valid = true;
			} catch (NumberFormatException e) {
				server.error("Bitte ein Byte eingeben!");
				continue;
			}
		}
		return ret;
	}
	
	/**
	 * Liest einen Long (-9223372036854775808 - 9223372036854775807) ein
	 * @param message Die Nachricht die ausgegeben werden soll
	 * @return Den eingegenden Wert
	 */
	public static long readLong (String message) {
		server.output().print(message);
		return readLong();
	}
	
	/**
	 * Liest einen Long (-9223372036854775808 - 9223372036854775807) ein
	 * @return Den eingegenden Wert
	 */
	public static long readLong () {
		long ret = 0;
		boolean valid = false;
		while (!valid) {
			String s = server.readLine().replaceAll(",", ".");
			if (s.isBlank() || s.isEmpty()) {
				server.error("Bitte eine Ganzzahl eingeben!");
				continue;
			}
			
			try {
				ret = Long.parseLong(s);
				valid = true;
			} catch (NumberFormatException e) {
				server.error("Bitte eine Ganzzahl eingeben!");
				continue;
			}
		}
		return ret;
	}
	
	/**
	 * Liest einen Short (-32768 - 32767) ein
	 * @param message Die Nachricht die ausgegeben werden soll
	 * @return Den eingegenden Wert
	 */
	public static short readShort (String message) {
		server.output().print(message);
		return readShort();
	}
	
	/**
	 * Liest einen Short (-32768 - 32767) ein
	 * @return Den eingegenden Wert
	 */
	public static short readShort () {
		short ret = 0;
		boolean valid = false;
		while (!valid) {
			String s = server.readLine().replaceAll(",", ".");
			if (s.isBlank() || s.isEmpty()) {
				server.error("Bitte eine Ganzzahl eingeben!");
				continue;
			}
			
			try {
				ret = Short.parseShort(s);
				valid = true;
			} catch (NumberFormatException e) {
				server.error("Bitte eine Ganzzahl eingeben!");
				continue;
			}
		}
		return ret;
	}
	
	/**
	 * Liest einen Integer (-2147483648 - 2147483647) ein
	 * @param message Die Nachricht die ausgegeben werden soll
	 * @return Den eingegenden Wert
	 */
	public static int readInt (String message) {
		server.output().print(message);
		return readInt();
	}
	
	/**
	 * Liest einen Integer (-2147483648 - 2147483647) ein
	 * @return Den eingegenden Wert
	 */
	public static int readInt () {
		int ret = 0;
		boolean valid = false;
		while (!valid) {
			String s = server.readLine();
			if (s.isBlank() || s.isEmpty()) {
				server.error("Bitte eine Ganzzahl eingeben!");
				continue;
			}
			
			try {
				ret = Integer.parseInt(s);
				valid = true;
			} catch (NumberFormatException e) {
				server.error("Bitte eine Ganzzahl eingeben!");
				continue;
			}
		}
		return ret;
	}
	
	/**
	 * Liest einen Wahrheitswert ein
	 * Unterstützte Wahrheitswerte:
	 * <ul>
	 * <li>true</li>
	 * <li>wahr</li>
	 * <li>1</li>
	 * <li>ja</li>
	 * </ul>
	 * Sowie die gegensätzlichen:
	 * <ul>
	 * <li>false</li>
	 * <li>falsch</li>
	 * <li>0</li>
	 * <li>nein</li>
	 * </ul>
	 * @param message Die Nachricht die ausgegeben werden soll
	 * @return Den eingegenden Wert
	 */
	public static boolean readBoolean (String message) {
		server.output().print(message);
		return readBoolean();
	}
	
	/**
	 * Liest einen Wahrheitswert ein
	 * Unterstützte Wahrheitswerte:
	 * <ul>
	 * <li>true</li>
	 * <li>wahr</li>
	 * <li>1</li>
	 * <li>ja</li>
	 * </ul>
	 * Sowie die gegensätzlichen:
	 * <ul>
	 * <li>false</li>
	 * <li>falsch</li>
	 * <li>0</li>
	 * <li>nein</li>
	 * </ul>
	 * @return Den eingegenden Wert
	 */
	public static boolean readBoolean () {
		boolean ret = false;
		while (!ret) {
			String s = server.readLine();
			switch (s.toLowerCase().strip()) {
			case "true":
			case "wahr":
			case "1":
			case "ja":
				ret = true;
				break;
			case "false":
			case "falsch":
			case "0":
			case "nein":
				ret = false;
				break;
			default:
				server.error("Bitte einen Wahrheitswert eingeben!");
				continue;
			}
		}
		return ret;
	}
	
	
}
