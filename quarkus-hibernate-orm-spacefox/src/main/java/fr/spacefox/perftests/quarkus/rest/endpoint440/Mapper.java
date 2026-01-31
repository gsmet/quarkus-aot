package fr.spacefox.perftests.quarkus.rest.endpoint440;

import fr.spacefox.perftests.quarkus.core.service440.model.Model440;
import fr.spacefox.perftests.quarkus.rest.endpoint440.schema.Schema440;

final class Mapper {
    private Mapper() {}

    public static Schema440 of(Model440 model) {
        return new Schema440(model.id(), model.value());
    }
}
