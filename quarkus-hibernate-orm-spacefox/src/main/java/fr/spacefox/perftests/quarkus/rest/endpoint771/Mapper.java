package fr.spacefox.perftests.quarkus.rest.endpoint771;

import fr.spacefox.perftests.quarkus.core.service771.model.Model771;
import fr.spacefox.perftests.quarkus.rest.endpoint771.schema.Schema771;

final class Mapper {
    private Mapper() {}

    public static Schema771 of(Model771 model) {
        return new Schema771(model.id(), model.value());
    }
}
