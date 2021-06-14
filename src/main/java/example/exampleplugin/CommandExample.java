package example.exampleplugin;

import com.raptordev.raptor.api.util.misc.MessageBus;
import com.raptordev.raptor.client.command.Command;

@Command.Declaration(name = "Example", syntax = "example hello [message] (use _ for spaces)", alias = "example, plugin")
public class CommandExample extends Command {

    @Override
    public void onCommand(String s, String[] message) {
        String main = message[0];
        String value = message[1];
        if (main.equalsIgnoreCase("hello")) {
            MessageBus.sendCommandMessage("HelloWorld", true);
        }
        MessageBus.sendCommandMessage("this is from a example", true);
    }
}
