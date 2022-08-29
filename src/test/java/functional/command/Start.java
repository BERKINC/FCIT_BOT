package functional.command;

import main.Bot;
import main.Fuel;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Start extends Bot {
    SendMessage sendMessage = new SendMessage();
    Fuel fuel = new Fuel();
    public void replyOnStart(Message message) {
//        String telegramID = String.valueOf(message.getContact().getUserId());
//        boolean found = database.firstScan(telegramID);
//        if (found == false){
//            sendMessage.setChatId(message.getChatId());
//            sendMessage.setText("");
//        }
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardRowList = new ArrayList<>();

        KeyboardRow keyboardRow1 = new KeyboardRow();

        KeyboardButton keyboardButton1 = new KeyboardButton();
        KeyboardButton keyboardButton2 = new KeyboardButton();

        keyboardButton1.setText("Меню");
        keyboardButton2.setText("Підтримка");

        keyboardRow1.add(keyboardButton1);
        keyboardRow1.add(keyboardButton2);

        keyboardRowList.add(keyboardRow1);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        sendMessage.setText(fuel.getStartMessage());
        sendMessage.setChatId(message.getChatId());
        try {
            execute(sendMessage);
        }   catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


}

