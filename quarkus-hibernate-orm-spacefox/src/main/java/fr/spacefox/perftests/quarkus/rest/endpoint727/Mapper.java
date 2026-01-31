package fr.spacefox.perftests.quarkus.rest.endpoint727;

import fr.spacefox.perftests.quarkus.core.service727.model.Model727;
import fr.spacefox.perftests.quarkus.rest.endpoint727.schema.Schema727;

final class Mapper {
    private Mapper() {}

    public static Schema727 of(Model727 model) {
        return new Schema727(model.id(), model.value());
    }
}
