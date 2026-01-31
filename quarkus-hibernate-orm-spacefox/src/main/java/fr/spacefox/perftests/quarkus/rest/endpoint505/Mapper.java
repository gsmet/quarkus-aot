package fr.spacefox.perftests.quarkus.rest.endpoint505;

import fr.spacefox.perftests.quarkus.core.service505.model.Model505;
import fr.spacefox.perftests.quarkus.rest.endpoint505.schema.Schema505;

final class Mapper {
    private Mapper() {}

    public static Schema505 of(Model505 model) {
        return new Schema505(model.id(), model.value());
    }
}
