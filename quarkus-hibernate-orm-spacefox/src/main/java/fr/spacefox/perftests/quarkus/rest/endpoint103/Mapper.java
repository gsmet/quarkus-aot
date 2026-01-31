package fr.spacefox.perftests.quarkus.rest.endpoint103;

import fr.spacefox.perftests.quarkus.core.service103.model.Model103;
import fr.spacefox.perftests.quarkus.rest.endpoint103.schema.Schema103;

final class Mapper {
    private Mapper() {}

    public static Schema103 of(Model103 model) {
        return new Schema103(model.id(), model.value());
    }
}
