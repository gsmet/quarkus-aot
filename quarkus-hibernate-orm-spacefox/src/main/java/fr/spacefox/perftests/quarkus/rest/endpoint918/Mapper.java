package fr.spacefox.perftests.quarkus.rest.endpoint918;

import fr.spacefox.perftests.quarkus.core.service918.model.Model918;
import fr.spacefox.perftests.quarkus.rest.endpoint918.schema.Schema918;

final class Mapper {
    private Mapper() {}

    public static Schema918 of(Model918 model) {
        return new Schema918(model.id(), model.value());
    }
}
