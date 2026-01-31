package fr.spacefox.perftests.quarkus.rest.endpoint665;

import fr.spacefox.perftests.quarkus.core.service665.model.Model665;
import fr.spacefox.perftests.quarkus.rest.endpoint665.schema.Schema665;

final class Mapper {
    private Mapper() {}

    public static Schema665 of(Model665 model) {
        return new Schema665(model.id(), model.value());
    }
}
