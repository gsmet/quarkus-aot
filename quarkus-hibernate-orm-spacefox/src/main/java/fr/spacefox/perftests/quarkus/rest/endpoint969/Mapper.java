package fr.spacefox.perftests.quarkus.rest.endpoint969;

import fr.spacefox.perftests.quarkus.core.service969.model.Model969;
import fr.spacefox.perftests.quarkus.rest.endpoint969.schema.Schema969;

final class Mapper {
    private Mapper() {}

    public static Schema969 of(Model969 model) {
        return new Schema969(model.id(), model.value());
    }
}
