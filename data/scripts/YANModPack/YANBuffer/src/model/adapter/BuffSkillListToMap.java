/*
 * This file is part of YANModPack: https://github.com/HorridoJoho/YANModPack
 * Copyright (C) 2015  Christian Buck
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package YANModPack.YANBuffer.src.model.adapter;

import java.util.Map;

import YANModPack.YANBuffer.src.model.entity.BuffSkill;
import YANModPack.YANBuffer.src.model.wrapper.BuffSkillListWrapper;
import YANModPack.src.model.adapter.AbstractListToMap;

/**
 * @author HorridoJoho
 */
public final class BuffSkillListToMap extends AbstractListToMap<String, BuffSkill, BuffSkillListWrapper>
{
	@Override
	public BuffSkillListWrapper marshal(Map<String, BuffSkill> v)
	{
		return new BuffSkillListWrapper(v.values().toArray(new BuffSkill[0]));
	}
}
