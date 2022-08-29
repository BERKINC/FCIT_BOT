package main;

public class Placeholders {


    //Bot data
    private final String BOT_TOKEN = "5229492814:AAGIR08wdl-kPn0B8bAdOvpz8cXY0cfjlqU";
    private final String BOT_NAME = "@studehlpbot";
    //\\


    //Database
    private final String DB_LINK = "mongodb+srv://berkinc:pUdD1HgR4yGPeEuC@fcit.blrhb2k.mongodb.net/?retryWrites=true&w=majority";
    private final String DB_NAME = "fcit";
    private final String USER_COLLECTION = "users";
    private final String TIMETABLE_COLLECTION = "timetable";

    //\\


    public String getTIMETABLE_COLLECTION() {
        return TIMETABLE_COLLECTION;
    }

    public String getDB_NAME() {
        return DB_NAME;
    }

    public String getUSER_COLLECTION() {
        return USER_COLLECTION;
    }

    public String getBOT_TOKEN() {
        return BOT_TOKEN;
    }

    public String getBOT_NAME() {
        return BOT_NAME;
    }

    public String getDB_LINK() {
        return DB_LINK;
    }
}
