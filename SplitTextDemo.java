import java.util.ArrayList;
import java.util.List;


public class SplitTextDemo {

	public static void main(String[] args) {
		for (String string : split(",,a", ',')) {
			System.out.println(string);
		}
	}
	
	public static String[] split(String text, char separator) {
		
		List<String> strings = new ArrayList<>();
		
		int start = 0;
		boolean isFirst = true;
		final char[] chars = text.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			
			if (isFirst && chars[i] == separator) {
				String string = text.substring(start, i );
				strings.add(string);
				start = i;
				isFirst = false;
				continue;
			}
			
			if (chars[i] == separator) {
				String string = text.substring(start + 1, i );
				strings.add(string);
				start = i;
				continue;
			}
			
			boolean isLast = i + 1 == chars.length;
			if (isLast) {
				strings.add(text.substring(start + 1, i + 1));
			}
		}
		
		return strings.toArray(new String[0]);
	}

}
