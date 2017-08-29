package com.example.android.pets;

import android.provider.BaseColumns;

/**
 * Created by 118168 on 7/5/2017.
 */

public class PetsContract {

public static final class pets implements BaseColumns {
    // Table name
    public static final String TABLE_NAME = "pets";

    // column names
    public static final String  _ID = BaseColumns._ID;
    public static final String PET_NAME = "name";
    public static final String PET_BREED = "breed";
    public static final String PET_GENDER = "gender";
    public static final String PET_WEIGHT = "weight";

    /**
     * Possible values for the gender of the pet.
     */
    public static final int GENDER_UNKNOWN = 0;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;

}
}

