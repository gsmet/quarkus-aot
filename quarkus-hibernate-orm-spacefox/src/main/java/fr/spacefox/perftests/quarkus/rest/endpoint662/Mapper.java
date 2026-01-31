package fr.spacefox.perftests.quarkus.rest.endpoint662;

import fr.spacefox.perftests.quarkus.core.service662.model.Model662;
import fr.spacefox.perftests.quarkus.rest.endpoint662.schema.Schema662;

final class Mapper {
    private Mapper() {}

    public static Schema662 of(Model662 model) {
        return new Schema662(model.id(), model.value());
    }
}
