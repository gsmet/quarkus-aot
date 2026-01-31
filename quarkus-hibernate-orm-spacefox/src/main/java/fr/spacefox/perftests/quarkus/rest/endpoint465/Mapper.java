package fr.spacefox.perftests.quarkus.rest.endpoint465;

import fr.spacefox.perftests.quarkus.core.service465.model.Model465;
import fr.spacefox.perftests.quarkus.rest.endpoint465.schema.Schema465;

final class Mapper {
    private Mapper() {}

    public static Schema465 of(Model465 model) {
        return new Schema465(model.id(), model.value());
    }
}
