package design_patterns.adaptor;

public class AdaptorDemo {

    public static void main(String[] args){
           String testString = "Formatting line 1. Formatting line 2. Formatting line 3.";

           TextFormattable newLineFormatter = new NewLineFormatter();
           String resultString = newLineFormatter.formatText(testString);
           System.out.println(resultString);

           CsvFormattable csvFormattable = new CsvFormatter();
           TextFormattable csvAdapter = new CsvAdapterImpl(csvFormattable);
           String resultCsvString = csvAdapter.formatText(testString);
           System.out.println(resultCsvString);
    }

}
