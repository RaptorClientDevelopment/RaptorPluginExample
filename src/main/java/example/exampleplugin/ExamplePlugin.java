package example.exampleplugin;

import com.raptordev.raptor.client.RaptorClient;
import com.raptordev.raptor.client.command.CommandManager;
import com.raptordev.raptor.client.module.ModuleManager;
import com.raptordev.raptor.client.plugin.IPlugin;
import com.raptordev.raptor.client.plugin.Plugin;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// you need to make this a mod too for RaptorClient to detect
@Mod(modid = "example",
        name = "RaptorExample",
        version = "1.0"
)
// this is declaring the plugin this is not needed but you should add
@Plugin(name = "Example", Description = "null", Version = 1.0, authors = {"RitomG"})
public class ExamplePlugin extends IPlugin {

    // dont do anything here do everything in onLoad
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        onLoad();
    }

    // what will happen when RaptorClient detects this plugin
    @Override
    public void onLoad() {
        ModuleManager.addMod(new ModuleExample());
        RaptorClient.EVENT_BUS.subscribe(this);
        RaptorClient.LOGGER.info("Module");
        CommandManager.addCommand(new CommandExample());
        RaptorClient.LOGGER.info("Command");
    }
}
