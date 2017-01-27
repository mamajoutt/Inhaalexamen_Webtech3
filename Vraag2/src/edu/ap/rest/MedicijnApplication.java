package edu.ap.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class MedicijnApplication extends Application{
	@Override
    public synchronized Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        Router router = new Router(getContext());

        // Defines only one route
        router.attach("/medicijnen", MedicijnenResource.class);
		router.attach("/medicijn/{medicijn_naam}", MedicijnResource.class);

        return router;
    }

}