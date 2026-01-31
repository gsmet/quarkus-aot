package fr.spacefox.perftests.quarkus.rest.endpoint606;

import fr.spacefox.perftests.quarkus.core.service606.model.Model606;
import fr.spacefox.perftests.quarkus.rest.endpoint606.schema.Schema606;

final class Mapper {
    private Mapper() {}

    public static Schema606 of(Model606 model) {
        return new Schema606(model.id(), model.value());
    }
}
