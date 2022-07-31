package test.ForkJoin.withLog;

import java.util.concurrent.RecursiveTask;
import java.util.logging.Logger;

public class GetSum2 extends RecursiveTask<Long> {
    long from, to;

    public GetSum2(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long compute() {

        long gap = to - from;

        if (gap <= 3) {
            long tempSum = 0;
            for (long i = from; i <= to; i++) {
                tempSum += i;
            }
            System.out.println("Return !! " + from + " ~ " + to + " = " + tempSum);
            return tempSum;
        }

        long middle = (from + to) / 2;

        GetSum2 sumPre = new GetSum2(from, middle);
        System.out.println("Pre      From = " + from + "  To = " + middle);
        sumPre.fork();
        GetSum2 sumPost = new GetSum2(middle + 1, to);
        System.out.println("Post     From = " + (middle + 1) + "  To = " + to);

        return sumPost.compute() + sumPre.join();
    }
}
