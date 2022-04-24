package com.mabrle.designpatterns.strategy.better;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Sorter {
    private static final long GB = 1000 * 1000 * 1000;

    private static final List<AlgRange> algs = new ArrayList<>();

    static {
        algs.add(new AlgRange(0, 6 * GB, SortAlgFactory.getSortAlg("QuickSort")));
        algs.add(new AlgRange(6 * GB, 10 * GB, SortAlgFactory.getSortAlg("ExternalSort")));
        algs.add(new AlgRange(10 * GB, 100 * GB, SortAlgFactory.getSortAlg("ConcurrentExternalSort")));
        algs.add(new AlgRange(100 * GB, Long.MAX_VALUE, SortAlgFactory.getSortAlg("MapReduceSort")));
    }

    public void sortFile(String filePath) {
        File file = new File(filePath);
        if (Files.notExists(Paths.get(filePath))) {
            throw new IllegalArgumentException("文件不存在");
        }
        long fileSize = file.length();
        ISortAlg alg = null;
        for (AlgRange algRange : algs) {
            if (algRange.inRange(fileSize)) {
                alg = algRange.getAlg();
                break;
            }
        }
        alg.sort(filePath);

    }

    private static class AlgRange {
        private long start;
        private long end;
        private ISortAlg alg;

        public AlgRange(long start, long end, ISortAlg alg) {
            this.start = start;
            this.end = end;
            this.alg = alg;
        }

        boolean inRange(long size) {
            return size >= start && size < end;

        }

        public ISortAlg getAlg() {
            return alg;
        }
    }

    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        sorter.sortFile("test");

    }
}
