
public class SplitLengthDemo {

	public static void main(String[] args) {

	}
	
	public static String[] spritLength(String text, int length){
		
		int[] temps = toIntArray(text);
		
		int arrayIndex = 0;
		int arrayLength = temps.length / length;
		if (temps.length % length != 0) {
			arrayLength++;
		}
		
		String array[] = new String[arrayLength];
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < temps.length; i++) {
			builder.append(temps[i]);
			if (i % length == 0) {
				array[arrayIndex++] = builder.toString();
				builder = new StringBuilder();
			}
		}
		
		return array;
	}
	
	private static int[] toIntArray(String text) {
		int length = text.length();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = Character.getNumericValue(text.charAt(i));
		}
		return array;
	}

}
