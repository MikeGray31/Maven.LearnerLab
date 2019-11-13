package io.zipcoder.interfaces.enums;

import io.zipcoder.interfaces.classes.Instructor;

public enum Educator {
    JACK {
        private final Instructor instructor = new Instructor(100, "Jack");
    },
    DANIELS {
        private final Instructor instructor = new Instructor(200, "Daniels");
    },
    WHISKEY {
        private final Instructor instructor = new Instructor(300, "Whiskey");
    }
}
