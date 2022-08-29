package database;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import functional.messages.Timetable;
import main.Bot;
import main.Fuel;
import main.Placeholders;
import org.bson.Document;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Users extends Bot {

    Placeholders placeholders = new Placeholders();
    MongoClient client = new MongoClient(new MongoClientURI(placeholders.getDB_LINK()));
    MongoDatabase database = client.getDatabase(placeholders.getDB_NAME());
    MongoCollection<Document> collection = database.getCollection(placeholders.getUSER_COLLECTION());
    Document document = new Document();


    public void addToDB(String name, String surname, String dateOfBirth, String group, String username) {
        document.put("name", name);
        document.put("surname", surname);
        document.put("dateOfBirth", dateOfBirth);
        document.put("group", group);
        document.put("username", username);

        collection.insertOne(document);
        System.out.println("[i] new user added to database: " + username);
    }


    public void firstScan(Message message) {

    }
}
