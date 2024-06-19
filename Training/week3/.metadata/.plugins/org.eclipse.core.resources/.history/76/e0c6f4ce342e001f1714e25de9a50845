package com.simplilearn.scope;

import java.util.*;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {

	private final Map<String, Object> scopedObjects = new HashMap<String, Object>();
	private final Map<String, Runnable> destrutionCallbacks = new HashMap<String, Runnable>();

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		return scopedObjects.computeIfAbsent(name, k -> objectFactory.getObject());
	}

	@Override
	public Object remove(String name) {
		destrutionCallbacks.remove(name);
		return scopedObjects.remove(name);
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		destrutionCallbacks.put(name, callback);

	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return "custom";
	}

}
