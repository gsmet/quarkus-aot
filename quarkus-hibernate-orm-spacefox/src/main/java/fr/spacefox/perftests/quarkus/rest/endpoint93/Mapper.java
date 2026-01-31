package fr.spacefox.perftests.quarkus.rest.endpoint93;

import fr.spacefox.perftests.quarkus.core.service93.model.Model93;
import fr.spacefox.perftests.quarkus.rest.endpoint93.schema.Schema93;

final class Mapper {
    private Mapper() {}

    public static Schema93 of(Model93 model) {
        return new Schema93(model.id(), model.value());
    }
}
