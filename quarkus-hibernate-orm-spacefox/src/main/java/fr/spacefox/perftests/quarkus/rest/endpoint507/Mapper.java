package fr.spacefox.perftests.quarkus.rest.endpoint507;

import fr.spacefox.perftests.quarkus.core.service507.model.Model507;
import fr.spacefox.perftests.quarkus.rest.endpoint507.schema.Schema507;

final class Mapper {
    private Mapper() {}

    public static Schema507 of(Model507 model) {
        return new Schema507(model.id(), model.value());
    }
}
