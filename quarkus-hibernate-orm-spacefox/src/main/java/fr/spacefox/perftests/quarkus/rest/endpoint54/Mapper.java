package fr.spacefox.perftests.quarkus.rest.endpoint54;

import fr.spacefox.perftests.quarkus.core.service54.model.Model54;
import fr.spacefox.perftests.quarkus.rest.endpoint54.schema.Schema54;

final class Mapper {
    private Mapper() {}

    public static Schema54 of(Model54 model) {
        return new Schema54(model.id(), model.value());
    }
}
