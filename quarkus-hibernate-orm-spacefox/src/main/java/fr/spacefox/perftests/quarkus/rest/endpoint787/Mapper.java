package fr.spacefox.perftests.quarkus.rest.endpoint787;

import fr.spacefox.perftests.quarkus.core.service787.model.Model787;
import fr.spacefox.perftests.quarkus.rest.endpoint787.schema.Schema787;

final class Mapper {
    private Mapper() {}

    public static Schema787 of(Model787 model) {
        return new Schema787(model.id(), model.value());
    }
}
