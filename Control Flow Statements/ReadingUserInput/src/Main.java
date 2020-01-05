public class Main {

    public static void main(String[] args) {

        ReadingInput.ReadingInputFromUser();


        PaintJob pj = new PaintJob();
        pj.getBucketCount(-3.4, 2.1, 1.5, 2);
        pj.getBucketCount(3.4, 2.1, 1.5, 2);
        pj.getBucketCount(2.75, 3.25, 2.5, 1);

        pj.getBucketCount(-3.4, 2.1, 1.5);
        pj.getBucketCount(3.4, 2.1, 1.5);
        pj.getBucketCount(7.25, 4.3, 2.35);

        pj.getBucketCount(3.4, 1.5);
        pj.getBucketCount(6.26, 2.2);
        pj.getBucketCount(3.26, 0.75);



        InputcalculatorChallenge.inputThenPrintSumAndAverage();


        ReadingLargestInputNumberChallenge rl = new ReadingLargestInputNumberChallenge();
        rl.readingLargest();


//        ReadingUserInputChallenge.ReadingFromUser();




    }
}
