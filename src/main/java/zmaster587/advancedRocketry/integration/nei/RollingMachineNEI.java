package zmaster587.advancedRocketry.integration.nei;

import zmaster587.advancedRocketry.client.render.util.ProgressBarImage;
import zmaster587.advancedRocketry.inventory.TextureResources;
import zmaster587.advancedRocketry.tile.multiblock.machine.TileRollingMachine;

public class RollingMachineNEI extends TemplateNEI {
	
	@Override
	public String getRecipeName() {
		return "RollingMachine";
	}

	@Override
	protected Class getMachine() {
		return TileRollingMachine.class;
	}

	@Override
	protected ProgressBarImage getProgressBar() {
		return TextureResources.rollingMachineProgressBar;
	}
}
