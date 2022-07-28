package ComplimentaryDNA;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String makeComplement(String dna) {
        Map<String, String> complimentaryDNA = new HashMap();
        complimentaryDNA.put("A", "T");
        complimentaryDNA.put("T", "A");
        complimentaryDNA.put("C", "G");
        complimentaryDNA.put("G", "C");

        StringBuilder compliment = new StringBuilder();

        for (char c : dna.toCharArray()) {
            compliment.append(complimentaryDNA.get(String.valueOf(c)));
        }

        return compliment.toString();

    }

}
