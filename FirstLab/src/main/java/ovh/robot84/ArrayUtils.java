package ovh.robot84;

/**
 *
 */
public class ArrayUtils {

    /**
     * @param sequence
     * @param array
     * @return
     */
    static public boolean sequenceAppearsInArray(int[] sequence, int[] array) {

        //System.out.println("seq.len "+sequence.length+" array.len "+array.length);
        for (int i = 0; i < array.length; i++) {
            int matchedNumElementsOfSequence = 0;
            //System.out.println("Checking array["+i+"]="+array[i]);
            for (int j = matchedNumElementsOfSequence; (i + j < array.length) & (j < sequence.length); j++) {
                //System.out.println("   \tChecking array["+(i+j)+"]="+array[i+j]);
                //System.out.println("   \tChecking seq["+j+"]="+sequence[j]);
                if (sequence[j] != array[i + j]) break;
                //System.out.println("\tFound match!");
                matchedNumElementsOfSequence++;
                if (matchedNumElementsOfSequence == sequence.length) return true;
            }

        }
        return false;

    }
}
