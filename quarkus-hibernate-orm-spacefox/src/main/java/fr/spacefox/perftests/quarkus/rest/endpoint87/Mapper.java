package fr.spacefox.perftests.quarkus.rest.endpoint87;

import fr.spacefox.perftests.quarkus.core.service87.model.Model87;
import fr.spacefox.perftests.quarkus.rest.endpoint87.schema.Schema87;

final class Mapper {
    private Mapper() {}

    public static Schema87 of(Model87 model) {
        return new Schema87(model.id(), model.value());
    }
}
