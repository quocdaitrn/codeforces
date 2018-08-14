package bigo.session.one.problem;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Problem378B {
    private static class Participant {
        private int simiIndex;
        private int result;
        private boolean isPossible;

        public Participant(int simiIndex, int result, boolean isPossible) {
            this.simiIndex = simiIndex;
            this.result = result;
            this.isPossible = isPossible;
        }

        public int getSimiIndex() {
            return simiIndex;
        }

        public void setSimiIndex(int simiIndex) {
            this.simiIndex = simiIndex;
        }

        public int getResult() {
            return result;
        }

        public void setResult(int result) {
            this.result = result;
        }

        public boolean isPossible() {
            return isPossible;
        }

        public void setPossible(boolean possible) {
            isPossible = possible;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        List<Participant> participants = new ArrayList<>();

        int numOfParticipant = sc.nextInt();
        int kMax = numOfParticipant / 2;

        for (int i = 0; i < numOfParticipant; i++) {
            participants.add(new Participant(1, sc.nextInt(), false));
            participants.add(new Participant(2, sc.nextInt(), false));
        }

        Collections.sort(participants, (p1, p2) -> {
            if (p1.getResult() > p2.getResult())
                return 1;
            if (p1.getResult() < p2.getResult())
                return -1;

            return 0;
        });

        for (int i = 0; i < numOfParticipant; i++) {
            participants.get(i).setPossible(true);
        }

        AtomicInteger kFirstSimi = new AtomicInteger(0);
        AtomicInteger kSeconSimi = new AtomicInteger(0);

        participants.stream().forEach(p -> {
            if (kFirstSimi.get() < kMax && p.getSimiIndex() == 1) {
                p.setPossible(true);
                kFirstSimi.getAndIncrement();
            }

            if (kSeconSimi.get() < kMax && p.getSimiIndex() == 2) {
                p.setPossible(true);

                kSeconSimi.getAndIncrement();
            }
        });

        StringBuilder firstSimiResult = new StringBuilder("");
        StringBuilder secondSimiResult = new StringBuilder("");

        participants.stream().forEach(p -> {
            if (p.isPossible) {
                if (p.getSimiIndex() == 1) {
                    firstSimiResult.append("1");
                } else {
                    secondSimiResult.append("1");
                }
            }
        });

        while (firstSimiResult.length() < numOfParticipant) {
            firstSimiResult.append("0");
        }

        while (secondSimiResult.length() < numOfParticipant) {
            secondSimiResult.append("0");
        }

        System.out.println(firstSimiResult.toString());
        System.out.println(secondSimiResult.toString());
    }
}
