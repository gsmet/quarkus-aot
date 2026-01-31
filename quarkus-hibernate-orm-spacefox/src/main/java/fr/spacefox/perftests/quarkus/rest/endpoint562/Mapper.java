package fr.spacefox.perftests.quarkus.rest.endpoint562;

import fr.spacefox.perftests.quarkus.core.service562.model.Model562;
import fr.spacefox.perftests.quarkus.rest.endpoint562.schema.Schema562;

final class Mapper {
    private Mapper() {}

    public static Schema562 of(Model562 model) {
        return new Schema562(model.id(), model.value());
    }
}
