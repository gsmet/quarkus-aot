package fr.spacefox.perftests.quarkus.rest.endpoint799;

import fr.spacefox.perftests.quarkus.core.service799.model.Model799;
import fr.spacefox.perftests.quarkus.rest.endpoint799.schema.Schema799;

final class Mapper {
    private Mapper() {}

    public static Schema799 of(Model799 model) {
        return new Schema799(model.id(), model.value());
    }
}
