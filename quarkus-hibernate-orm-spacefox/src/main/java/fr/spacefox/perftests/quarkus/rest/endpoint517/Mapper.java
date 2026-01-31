package fr.spacefox.perftests.quarkus.rest.endpoint517;

import fr.spacefox.perftests.quarkus.core.service517.model.Model517;
import fr.spacefox.perftests.quarkus.rest.endpoint517.schema.Schema517;

final class Mapper {
    private Mapper() {}

    public static Schema517 of(Model517 model) {
        return new Schema517(model.id(), model.value());
    }
}
