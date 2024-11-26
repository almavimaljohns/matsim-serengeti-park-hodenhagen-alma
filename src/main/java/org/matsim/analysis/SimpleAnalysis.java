package org.matsim.analysis;

import org.matsim.core.events.EventsUtils;

public class SimpleAnalysis {
    public static void main(String[] args) {

        var handler = new SimplePersonEventHandler();
        var manager = EventsUtils.createEventsManager();
        manager.addHandler(handler);
        EventsUtils.readEvents(manager, "D:\\TUM TS\\SEM 3\\Applied Transport Modelling using MATSim\\MatsimWebsite\\output\\output_events.xml.gz");

    }
    }