package com.aouth2.demo.utils;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

public final class ValidationUtils {

    /**
     * Controle is null or empty for collections
     *
     * @param maybeNullOrEmpty
     * @return true, if is null or empty
     */
    public static boolean isNullOrEmpty(final Collection<?> maybeNullOrEmpty) {
        return maybeNullOrEmpty == null || maybeNullOrEmpty.isEmpty();
    }


    /**
     * Controle is null or empty for map
     *
     * @param maybeNullOrEmpty
     * @return true, if is null or empty
     */
    public static boolean isNullOrEmpty(final Map<?, ?> maybeNullOrEmpty) {
        return maybeNullOrEmpty == null || maybeNullOrEmpty.isEmpty();

    }

    /**
     * Controle is null or empty for String
     *
     * @param maybeNullOrEmpty
     * @return true, if is null or empty
     */
    public static boolean isNullOrEmpty(final String maybeNullOrEmpty) {
        return maybeNullOrEmpty == null || maybeNullOrEmpty.isEmpty();

    }

    /**
     * Controle is null or empty for Object[]
     *
     * @param maybeNullOrEmpty
     * @return true, if is null or equal to zero
     */
    public static boolean isNullOrEmpty(final Object[] maybeNullOrEmpty) {
        return maybeNullOrEmpty == null || maybeNullOrEmpty.length == 0;

    }

    /**
     * Controle is null or empty for Date
     *
     * @param maybeNullOrEmpty
     * @return true, if is null
     */
    public static boolean isNullOrEmpty(Date maybeNullOrEmpty) {
        return maybeNullOrEmpty == null;

    }

    /**
     * Controle is null or empty for Object
     *
     * @param maybeNullOrEmpty
     * @return true, if is null
     */
    public static boolean isNullOrEmpty(final Object maybeNullOrEmpty) {
        return maybeNullOrEmpty == null;

    }

    /**
     * Controle is null or empty for List
     *
     * @param maybeNullOrEmpty
     * @return true, if is null or empty
     */
    public static boolean isNullOrEmpty(final List<?> maybeNullOrEmpty) {
        return maybeNullOrEmpty == null || maybeNullOrEmpty.isEmpty();

    }

    /**
     * Check if is integer.
     *
     * @param string
     * @return true, if is integer
     */
    public static boolean isNumeric(String string) {
        return string.chars().allMatch(Character::isDigit);

    }
}


