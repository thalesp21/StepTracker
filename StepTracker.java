import java.util.ArrayList;

public class StepTracker {
    private int threshold;
    private ArrayList<Integer> list = new ArrayList<Integer>();

    public StepTracker(int considered) {
        threshold = considered;
    }

    public void addDailySteps(int stepsToday) {
        list.add(stepsToday);
    }

    public int activeDays() {
        int count = 0;
        for (int i=0;i<list.size();i++) {
            if (list.get(i)>=threshold) count++;
        }
        return count;
    }

    public double averageSteps() {
        double average = 0.0;
        if (list.size()==0) return average;
        for (int i=0;i<list.size();i++) {
            average+=list.get(i);
        }
        return average/=list.size();
    }
}