/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.woodcutting;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Units;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Alpha;

import java.awt.Color;

@ConfigGroup("woodcutting")
public interface WoodcuttingConfig extends Config
{
	@ConfigItem(
		position = 1,
		keyName = "statTimeout",
		name = "Reset stats",
		description = "Configures the time until statistic is reset. Also configures when tree indicator is hidden"
	)
	@Units(Units.MINUTES)
	default int statTimeout()
	{
		return 5;
	}

	@ConfigItem(
		position = 2,
		keyName = "showNestNotification",
		name = "Bird nest notification",
		description = "Configures whether to notify you of a bird nest spawn"
	)
	default boolean showNestNotification()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "showWoodcuttingStats",
		name = "Show session stats",
		description = "Configures whether to display woodcutting session stats"
	)
	default boolean showWoodcuttingStats()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "showRedwoods",
		name = "Show Redwood trees",
		description = "Configures whether to show a indicator for redwood trees"
	)
	default boolean showRedwoodTrees()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "showRespawnTimers",
		name = "Show respawn timers",
		description = "Configures whether to display the respawn timer overlay"
	)
	default boolean showRespawnTimers()
	{
		return true;
	}

	@ConfigSection(
		name = "Graphics Settings",
		description = "Overlay graphics settings",
		position = 10
	)
	String visualSection = "Graphics";

	@Alpha
	@ConfigItem(
		position = 11,
		keyName = "hexColorTreeOverlay",
		name = "Overlay color",
		description = "Color of the tree overlay",
		section = visualSection
	)
	default Color getTreeOverlayColor()
	{
		return Color.YELLOW;
	}

	@Alpha
	@ConfigItem(
		position = 12,
		keyName = "hexColorTreeOverlayOutline",
		name = "Overlay outline color",
		description = "Color of the tree stump outline overlay",
		section = visualSection
	)
	default Color getTreeOverlayOutlineColor()
	{
		return Color.ORANGE;
	}

	@ConfigItem(
		position = 13,
		keyName = "getTreeOverlayDiameter",
		name = "Overlay diameter",
		description = "Adjust the size of the tree stump overlay",
		section = visualSection
	)
	default int getTreeOverlayDiameter()
	{
		return 25;
	}

}