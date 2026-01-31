package fr.spacefox.perftests.quarkus.rest.endpoint120;

import fr.spacefox.perftests.quarkus.core.service120.model.Model120;
import fr.spacefox.perftests.quarkus.rest.endpoint120.schema.Schema120;

final class Mapper {
    private Mapper() {}

    public static Schema120 of(Model120 model) {
        return new Schema120(model.id(), model.value());
    }
}
