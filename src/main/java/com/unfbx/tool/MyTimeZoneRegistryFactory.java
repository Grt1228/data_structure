package com.unfbx.tool;

import net.fortuna.ical4j.model.TimeZoneRegistry;
import net.fortuna.ical4j.model.TimeZoneRegistryFactory;
import net.fortuna.ical4j.model.TimeZoneRegistryImpl;

/**
 * @Description
 * @Author Grt
 * @Date 2021-09-10
 */
public class MyTimeZoneRegistryFactory extends TimeZoneRegistryFactory {
    @Override
    public TimeZoneRegistry createRegistry() {
        TimeZoneRegistryImpl timeZoneRegistry = new TimeZoneRegistryImpl();
        return timeZoneRegistry;
    }
}
