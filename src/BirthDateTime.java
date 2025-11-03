static void main() {
    Scanner in = new Scanner(System.in);
    int birthYear = SafeInput.getRangedInt(in, "Enter your birth year ", 1950, 2015);
    int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month ", 1, 12);

    // Determine maximum days based on the month
    int maxDays;
    switch (birthMonth) {
        case 2:  // February
            maxDays = 29;  // Allowing for leap years
            break;
        case 4:   // April
        case 6:   // June
        case 9:   // September
        case 11:  // November
            maxDays = 30;
            break;
        case 1:   // January
        case 3:   // March
        case 5:   // May
        case 7:   // July
        case 8:   // August
        case 10:  // October
        case 12:  // December
            maxDays = 31;
            break;
        default:
            maxDays = 31;  // Fallback (shouldn't happen due to month validation)
            break;
    }

    int birthDay = SafeInput.getRangedInt(in, "Enter your birth day ", 1, maxDays);
    int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour ", 0, 23);
    int birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute ", 0, 59);
    System.out.println("You were born on " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);
}
