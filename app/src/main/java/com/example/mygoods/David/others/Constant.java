package com.example.mygoods.David.others;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constant {

    public static String recentViewTable    = "RECENTVIEW";
    public static String recentSearchTable  = "RECENTSEARCH";


    public static String itemCollection     = "items";
    public static String userCollection     = "users";
    public static final String additionalInfoCollection = "additionInfo";
    public static String recentSearchCollection = "recentSearch";

    public static String usernameField      = "username";
    public static String subCategoryField   = "subCategory";
    public static String mainCategoryField  = "mainCategory";
    public static String viewField          = "views";
    public static String viewerField        = "viewer";
    public static String dateField          = "date";
    public static String priceField         = "price";
    public static String ownerField         = "owner";
    public static String itemNameField      = "name";

    //Intent
    public static String intentFromTrending = "Trending";
    public static String intentFromRecommendation = "Recommendation";
    public static String titleIntentFromHome      = "titleFromHomeActivity";
    public static String dataIntentFromHome = "dataFromHomeActivity";
    public static String intentFromSubCat   = "moveFromSubCat";
    public static String intentFromMainCat  = "moveFromMainCat";
    public static String mainCatTitle       = "mainCatTitle";
    public static String userIDFromHomeActivity = "userIDFromHomeActivity";

    public static String capitalizeFirstWord(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String capitalize(String str){
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;

        for(int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if(Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if(foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }

            else {
                // if the new character is not character
                foundSpace = true;
            }
        }
        // convert the char array to the string
        str = String.valueOf(charArray);
        return str;
    }

    public static String calculateDate(Date itemDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.format(itemDate);


        Date currentDate = new Date();
        String timeEnd = " minute(s) ";

        double date = (currentDate.getTime() - itemDate.getTime()) / 60000;

        if (date > 0) {
            if (date >= 60) {
                date = date / 60;
                timeEnd = " hour(s) ";

                if (date >= 24) {
                    date = date/24;
                    date = Math.round(date);
                    timeEnd = " day(s) ";

                }
            }
        }


        return ((int) date) + timeEnd;
    }
}
