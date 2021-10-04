package S191098026;

public class Geezer {

    private static Geezer theGeezer;

    public static Geezer getTheGeezer() {
        if (theGeezer == null) {
            theGeezer = new Geezer();
        }
        return theGeezer;
    }

    private Geezer() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step, line);
            System.out.println(line.toString());
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step, Line line) {
        String[] couple = step.split("<->");
        if (couple.length == 2)
        {
            Gourd.getGourdByRank(Integer.parseInt(couple[0]))
                .swapPosition(Gourd.getGourdByRank(Integer.parseInt(couple[1])));
        }
        else
        {
            int left = Integer.parseInt(couple[0]), right = Integer.parseInt(couple[1]);
            Linable[] linables = new Linable[right + 1];
            for (int i = left; i <= right; ++i)
                linables[i] = line.get(i);
            for (int i = 2; i < couple.length; ++i)
                line.put(linables[Integer.parseInt(couple[i])], left + i - 2);
        }
    }

}
