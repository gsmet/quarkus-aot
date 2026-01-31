package fr.spacefox.perftests.quarkus.rest.endpoint595;

import fr.spacefox.perftests.quarkus.core.service595.model.Model595;
import fr.spacefox.perftests.quarkus.rest.endpoint595.schema.Schema595;

final class Mapper {
    private Mapper() {}

    public static Schema595 of(Model595 model) {
        return new Schema595(model.id(), model.value());
    }
}
