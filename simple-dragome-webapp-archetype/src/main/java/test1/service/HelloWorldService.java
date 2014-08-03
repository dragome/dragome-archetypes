/*******************************************************************************
 * Copyright (c) 2011-2014 Fernando Petrola
 * 
 *  This file is part of Dragome SDK.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 ******************************************************************************/
package test1.service;

import test1.service.serverside.HelloWolrdServiceImpl;

import com.dragome.annotations.ServiceImplementation;

@ServiceImplementation(HelloWolrdServiceImpl.class)
public interface HelloWorldService
{
	public abstract String getGreetingsFor(String name);
}
