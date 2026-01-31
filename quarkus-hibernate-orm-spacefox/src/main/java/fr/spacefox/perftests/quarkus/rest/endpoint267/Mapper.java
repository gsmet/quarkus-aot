package fr.spacefox.perftests.quarkus.rest.endpoint267;

import fr.spacefox.perftests.quarkus.core.service267.model.Model267;
import fr.spacefox.perftests.quarkus.rest.endpoint267.schema.Schema267;

final class Mapper {
    private Mapper() {}

    public static Schema267 of(Model267 model) {
        return new Schema267(model.id(), model.value());
    }
}
