package fr.spacefox.perftests.quarkus.rest.endpoint52;

import fr.spacefox.perftests.quarkus.core.service52.model.Model52;
import fr.spacefox.perftests.quarkus.rest.endpoint52.schema.Schema52;

final class Mapper {
    private Mapper() {}

    public static Schema52 of(Model52 model) {
        return new Schema52(model.id(), model.value());
    }
}
