package example.exampleplugin;

import com.raptordev.raptor.api.util.misc.MessageBus;
import com.raptordev.raptor.client.command.Command;

@Command.Declaration(name = "Example", syntax = "plugin check/c", alias = "Example, plugin")
public class CommandExample extends Command {

    @Override
    public void onCommand(String s, String[] strings) {
        MessageBus.sendCommandMessage("this is from a example", true);
    }
}
