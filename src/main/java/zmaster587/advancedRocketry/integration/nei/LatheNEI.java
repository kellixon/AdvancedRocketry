package zmaster587.advancedRocketry.integration.nei;

import zmaster587.advancedRocketry.client.render.util.ProgressBarImage;
import zmaster587.advancedRocketry.inventory.TextureResources;
import zmaster587.advancedRocketry.tile.multiblock.machine.TileLathe;

public class LatheNEI extends TemplateNEI {

	@Override
	public String getRecipeName() {
		return "Lathe";
	}

	@Override
	protected Class getMachine() {
		return TileLathe.class;
	}

	@Override
	protected ProgressBarImage getProgressBar() {
		return TextureResources.latheProgressBar;
	}

}
