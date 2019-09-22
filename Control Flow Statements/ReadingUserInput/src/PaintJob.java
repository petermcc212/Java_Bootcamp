public class PaintJob {

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){

        if ((width <= 0) || (height <=0) || (areaPerBucket <=0) || (extraBuckets<0)){
            System.out.println("-1");
            return -1;
        }

        // calculating the area
        double area = (width * height);
        int numberOfBuckets = (int)Math.ceil(area / areaPerBucket );
        numberOfBuckets -= extraBuckets;
        System.out.println(numberOfBuckets);
        return numberOfBuckets;

    }
    public static int getBucketCount (double width, double height, double areaPerBucket){
        if((width <= 0) || (height <=0) || (areaPerBucket <=0)){
            System.out.println(("-1"));
            return -1;
        }
        double area = (width * height);
        int numberOfBuckets = (int)Math.ceil(area/ areaPerBucket);
        System.out.println(numberOfBuckets);
        return numberOfBuckets;
    }


    public static int getBucketCount(double area, double areaPerBucket){

        if((area <=0 ) || (areaPerBucket <= 0)){
            System.out.println("-1");
            return -1;
        }else{
            int numberOfBuckets = (int)Math.ceil(area/ areaPerBucket);
            System.out.println(numberOfBuckets);
            return numberOfBuckets;
        }

    }




}
