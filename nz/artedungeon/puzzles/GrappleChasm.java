package nz.artedungeon.puzzles;

import com.rsbuddy.script.methods.Objects;
import nz.artedungeon.common.PuzzlePlugin;
import nz.artedungeon.misc.GameConstants;
import nz.artedungeon.utils.Util;

import java.awt.*;

/**
 * Created by IntelliJ IDEA.
 * User: Taylor
 * Date: 4/23/11
 * Time: 7:14 PM
 * Package: nz.artedungeon.puzzles;
 */
public class GrappleChasm extends PuzzlePlugin
{
    @Override
    public String getStatus() {
        return "Solving: Grapple Chasm";
    }

    @Override
    public boolean isValid() {
        return Objects.getNearest(GameConstants.UNGRAPPLED_CHASMS) != null &&
               Util.tileInRoom(Objects.getNearest(GameConstants.UNGRAPPLED_CHASMS).getLocation());
    }

    @Override
    public String getAuthor() {
        return "UberMouse";
    }

    @Override
    public String getName() {
        return "Grapple Chasm";
    }

    @Override
    public int loop() {
        Toolkit.getDefaultToolkit().beep();
        return 1000;
    }
}
