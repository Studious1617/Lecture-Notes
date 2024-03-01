package Week3;

public class AlignText {
    public static void main(String[] args) {

        int[] classCodes = {2545, 2505, 2560};
        String[] classNames = {"Java", "C#", "Web"};
        double[] averageClassSizes = {22.34233, 17.42323, 14.234234};

        String templateString = "%-10s%-10s%-10s\n";
        System.out.printf(templateString, "Code", "Name", "Average Size");

        String tableTemplateString = "%-10d%-10s%-10.2f\n";
        for (int c = 0; c < classCodes.length; c++){
            int code = classCodes[c];
            String name = classNames[c];
            double averageClassSize = averageClassSizes[c];
            System.out.printf(tableTemplateString, code, name, averageClassSize);
        }
    }
}
