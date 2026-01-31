package fr.spacefox.perftests.quarkus.rest.endpoint558;

import fr.spacefox.perftests.quarkus.core.service558.model.Model558;
import fr.spacefox.perftests.quarkus.rest.endpoint558.schema.Schema558;

final class Mapper {
    private Mapper() {}

    public static Schema558 of(Model558 model) {
        return new Schema558(model.id(), model.value());
    }
}
