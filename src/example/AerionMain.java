package Aerion;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class AerionMain extends Mod{

    public AerionMain(){
 

        Events.on(ClientLoadEvent.class, e -> {
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("Add title text here about the mod").row();
                dialog.cont.image(Core.atlas.find("add-icon-here")).pad(20f).row();
                dialog.cont.button("Close", dialog::hide).size(100f, 50f);
                dialog.cont.button("Do not show this again.", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
    }

}
