package fr.spacefox.perftests.quarkus.rest.endpoint284;

import fr.spacefox.perftests.quarkus.core.service284.model.Model284;
import fr.spacefox.perftests.quarkus.rest.endpoint284.schema.Schema284;

final class Mapper {
    private Mapper() {}

    public static Schema284 of(Model284 model) {
        return new Schema284(model.id(), model.value());
    }
}
