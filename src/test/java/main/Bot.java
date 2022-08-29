package main;

import functional.ToCommand;
import functional.ToMessages;
import functional.command.Start;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Bot extends TelegramLongPollingBot {
    Placeholders placeholders = new Placeholders();
    Message message = new Message();

    @Override
    public String getBotUsername() {
        return placeholders.getBOT_NAME();
    }

    @Override
    public String getBotToken() {
        return placeholders.getBOT_TOKEN();
    }

    @Override
    public void onUpdateReceived(Update update) {
        message = update.getMessage();
        String text = message.getText();
        if (update.hasMessage()){
            if (text.contains("/")){
                ToCommand toCommand = new ToCommand();
                toCommand.commands(message);
            } else {
                ToMessages toMessages = new ToMessages();
                toMessages.messages(message);
            }
        }
    }


    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
