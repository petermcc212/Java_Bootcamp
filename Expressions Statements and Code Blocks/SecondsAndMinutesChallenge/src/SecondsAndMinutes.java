public class SecondsAndMinutes {


    public static String getDurationString (int minutes, int seconds){
        if ((minutes <0) || ((seconds <0) || (seconds > 59)) ){
            return "Invalid value";

        }
        // XXh YYm ZZs
        int hours = (minutes / 60);
        String hoursAsString = String.format("%02d", hours);
        minutes = (minutes % 60);
        String minutesAsString = String.format("%02d", minutes);
        String secondsAsString = String.format("%02d", seconds);
        return hoursAsString + "h " + minutesAsString + "m " + secondsAsString + "s";

    }

    public static String getDurationString (int seconds){
        if (seconds < 0){
            return "Invalid value";
        }
        int totalMinutes = (seconds / 60);
        int totalRemainingSeconds = (seconds % 60);
        return getDurationString(totalMinutes, totalRemainingSeconds);
    }

}
