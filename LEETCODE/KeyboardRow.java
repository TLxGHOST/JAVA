import java.util.ArrayList;
import java.util.List;

class KeyboardRow {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {

            String lowerWord = word.toLowerCase();

            String referenceRow = determineRow(row1, row2, row3, lowerWord.charAt(0));
            if (referenceRow != null) {

                boolean isValid = true;
                for (char c : lowerWord.toCharArray()) {
                    if (referenceRow.indexOf(c) == -1) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    result.add(word);
                }
            }
        }

        return result.toArray(new String[0]);
    }

    private static String determineRow(String row1, String row2, String row3, char c) {
        if (row1.indexOf(c) != -1) {
            return row1;
        } else if (row2.indexOf(c) != -1) {
            return row2;
        } else if (row3.indexOf(c) != -1) {
            return row3;
        }
        return null;
    }
}