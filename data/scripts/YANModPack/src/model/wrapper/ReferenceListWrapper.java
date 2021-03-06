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
package YANModPack.src.model.wrapper;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author HorridoJoho
 */
public final class ReferenceListWrapper
{
	@XmlElement(name = "reference")
	public final String[] refs;
	
	public ReferenceListWrapper()
	{
		refs = new String[0];
	}
	
	public ReferenceListWrapper(String[] refs)
	{
		this.refs = refs;
	}
}
