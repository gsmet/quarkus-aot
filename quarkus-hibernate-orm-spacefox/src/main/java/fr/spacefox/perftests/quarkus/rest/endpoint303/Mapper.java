package fr.spacefox.perftests.quarkus.rest.endpoint303;

import fr.spacefox.perftests.quarkus.core.service303.model.Model303;
import fr.spacefox.perftests.quarkus.rest.endpoint303.schema.Schema303;

final class Mapper {
    private Mapper() {}

    public static Schema303 of(Model303 model) {
        return new Schema303(model.id(), model.value());
    }
}
