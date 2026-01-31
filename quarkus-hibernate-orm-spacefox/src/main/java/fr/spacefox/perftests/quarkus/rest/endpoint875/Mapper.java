package fr.spacefox.perftests.quarkus.rest.endpoint875;

import fr.spacefox.perftests.quarkus.core.service875.model.Model875;
import fr.spacefox.perftests.quarkus.rest.endpoint875.schema.Schema875;

final class Mapper {
    private Mapper() {}

    public static Schema875 of(Model875 model) {
        return new Schema875(model.id(), model.value());
    }
}
