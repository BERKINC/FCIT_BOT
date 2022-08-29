package functional;

import database.TimetableDB;
import database.Users;
import functional.command.Start;
import functional.messages.Timetable;
import org.telegram.telegrambots.meta.api.objects.Message;

public class ToCommand {
    Timetable timetable = new Timetable();
    public void commands(Message message) {
        if (message.getText().equals("/start")) {
            Start start = new Start();
            start.replyOnStart(message);
        } else if (message.getText().equals("/tomorrow")){
            timetable.tomorrow(message);
        } else if (message.getText().equals("/today")){
            timetable.today(message);
        }
    }
}
