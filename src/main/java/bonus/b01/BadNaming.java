package bonus.b01;

import java.util.ArrayList;
import java.util.List;

public class BadNaming {

    int d;

    public List<int[]> getThem(int[][] theList) {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
