package functional;

import functional.messages.Menu;
import functional.messages.Timetable;
import org.telegram.telegrambots.meta.api.objects.Message;

public class ToMessages {
    Timetable timetable = new Timetable();

    public void messages(Message message) {
        if (message.getText().equals("Меню")) {
            Menu menu = new Menu();
            menu.menu(message);
        } else if (message.getText().equals("Розклад")) {
            timetable.timetable(message);
        } else if (message.getText().equals("Завтра")) {
            timetable.tomorrow(message);
        } else if (message.getText().equals("Сьогодні")){
            timetable.today(message);
        }
    }
}
