package main;

public class Fuel {
    // Повідомлення, яке дасть бот у випадку, коли користувач не зареєстрований.
    protected String nonRegistration = "Схоже Ви ще не заореєстрований користувач. \n Пропоную пройти реєстрацію прямо зараз. \n\n Ви згодні?";
    // Повідомлення, яке бот виводить під час виконання команди /start
    protected String startMessage = "Вітаю! Цей бот з радістю допоможе тобі під час навчання або викладацької діяльності. \nДавай розпочнемо?";
    //Повідомлення, при віклику месенджа "Меню"
    protected String menuMessage = "Обери функцію, що тебе цікавить. \n\n\nНагадую що бот знаходиться в бета версії, то ж наявність багів, або будь-яких недоліків є нормальним явищем, і найближчим часом це буде виправлено.";

    //Повідомлення, при виклику комапнди "/tomorrow" & "На завтра"
    protected String tomorrowMessage = "Розклад на завтра: ";
    //Повідомлення, при виклику комапнди "/today" & "Сьогодні"
    protected String today = "Розклад на сьогодні: ";

    public String getToday() {
        return today;
    }

    public String getTomorrowMessage() {
        return tomorrowMessage;
    }

    public String getMenuMessage() {
        return menuMessage;
    }

    public String getNonRegistration() {
        return nonRegistration;
    }

    public String getStartMessage() {
        return startMessage;
    }
}
