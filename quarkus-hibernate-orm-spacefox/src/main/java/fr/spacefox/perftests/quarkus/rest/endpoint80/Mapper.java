package fr.spacefox.perftests.quarkus.rest.endpoint80;

import fr.spacefox.perftests.quarkus.core.service80.model.Model80;
import fr.spacefox.perftests.quarkus.rest.endpoint80.schema.Schema80;

final class Mapper {
    private Mapper() {}

    public static Schema80 of(Model80 model) {
        return new Schema80(model.id(), model.value());
    }
}
