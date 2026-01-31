package fr.spacefox.perftests.quarkus.rest.endpoint919;

import fr.spacefox.perftests.quarkus.core.service919.model.Model919;
import fr.spacefox.perftests.quarkus.rest.endpoint919.schema.Schema919;

final class Mapper {
    private Mapper() {}

    public static Schema919 of(Model919 model) {
        return new Schema919(model.id(), model.value());
    }
}
