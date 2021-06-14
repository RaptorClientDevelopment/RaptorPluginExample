package example.exampleplugin;

import com.raptordev.raptor.api.event.events.RenderEvent;
import com.raptordev.raptor.api.util.misc.MessageBus;
import com.raptordev.raptor.client.module.Category;
import com.raptordev.raptor.client.module.Module;

// we are declaring  the module description is not needed but you can add
@Module.Declaration(name = "example", category = Category.CLIENT, Description = "None")
public class ModuleExample extends Module {
    /* Here we are saying if this module is enabled what will happen in every tick
    * OnUpdate runs every single update
     */
    public void onUpdate() {}

    // here we are saying what will happen after module is active but only one time
    protected void onEnable() {
        // we are sending the iconic Programing message hello world to server (everyone) on Enable
        MessageBus.sendServerMessage("Hello World");
        // we are sending the iconic Programing message hello world to only the player but as name of RaptorClient (prefix) on Enable
        MessageBus.sendClientPrefixMessage("Hellow world from RaptorClient");
    }

    // opposite on onEnable this will run one time when module is disabled after enabling
    protected void onDisable() {
    }

    // if module is active what will happen onRender
    public void onRender() {

    }

    // same like onRender but better this is better for esp type modules
    public void onWorldRender(RenderEvent event) {

    }
}
