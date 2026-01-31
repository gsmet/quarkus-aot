package fr.spacefox.perftests.quarkus.rest.endpoint275;

import fr.spacefox.perftests.quarkus.core.service275.model.Model275;
import fr.spacefox.perftests.quarkus.rest.endpoint275.schema.Schema275;

final class Mapper {
    private Mapper() {}

    public static Schema275 of(Model275 model) {
        return new Schema275(model.id(), model.value());
    }
}
