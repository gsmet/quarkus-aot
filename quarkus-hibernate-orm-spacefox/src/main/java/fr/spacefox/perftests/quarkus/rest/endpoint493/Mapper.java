package fr.spacefox.perftests.quarkus.rest.endpoint493;

import fr.spacefox.perftests.quarkus.core.service493.model.Model493;
import fr.spacefox.perftests.quarkus.rest.endpoint493.schema.Schema493;

final class Mapper {
    private Mapper() {}

    public static Schema493 of(Model493 model) {
        return new Schema493(model.id(), model.value());
    }
}
