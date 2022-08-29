package database;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import main.Placeholders;
import org.bson.Document;

import java.util.Arrays;

public class TimetableDB {
    Placeholders placeholders = new Placeholders();
    MongoClient client = new MongoClient(new MongoClientURI(placeholders.getDB_LINK()));
    MongoDatabase database = client.getDatabase(placeholders.getDB_NAME());
    MongoCollection<Document> collection = database.getCollection(placeholders.getTIMETABLE_COLLECTION());
    Document document = new Document();

//    public void addTimetable(String group){
//        document.put("group", group);
//        document.put("monday", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("tuesday", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("wednesday", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("thursday", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("friday", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//
//        document.put("monday_2", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("tuesday_2", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("wednesday_2", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("thursday_2", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        document.put("friday_2", Arrays.asList("Математика", "a", "sa","sa", "sad"));
//        collection.insertOne(document);
//        System.out.println("work");
//    }
}
