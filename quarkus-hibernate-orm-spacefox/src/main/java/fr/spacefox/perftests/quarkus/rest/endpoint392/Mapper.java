package fr.spacefox.perftests.quarkus.rest.endpoint392;

import fr.spacefox.perftests.quarkus.core.service392.model.Model392;
import fr.spacefox.perftests.quarkus.rest.endpoint392.schema.Schema392;

final class Mapper {
    private Mapper() {}

    public static Schema392 of(Model392 model) {
        return new Schema392(model.id(), model.value());
    }
}
