public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean isParameterInRange = ((year >= 1) && (year <= 9999)) ? true : false;
        if(!isParameterInRange) {
            return false;
        } else {
            if((year % 4) == 0) {
                if((year % 100) == 0) {
                    if((year % 400) == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
