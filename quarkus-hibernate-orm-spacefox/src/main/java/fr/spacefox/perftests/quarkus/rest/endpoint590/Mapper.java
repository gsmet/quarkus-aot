package fr.spacefox.perftests.quarkus.rest.endpoint590;

import fr.spacefox.perftests.quarkus.core.service590.model.Model590;
import fr.spacefox.perftests.quarkus.rest.endpoint590.schema.Schema590;

final class Mapper {
    private Mapper() {}

    public static Schema590 of(Model590 model) {
        return new Schema590(model.id(), model.value());
    }
}
