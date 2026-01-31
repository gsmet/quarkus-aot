package fr.spacefox.perftests.quarkus.rest.endpoint269;

import fr.spacefox.perftests.quarkus.core.service269.model.Model269;
import fr.spacefox.perftests.quarkus.rest.endpoint269.schema.Schema269;

final class Mapper {
    private Mapper() {}

    public static Schema269 of(Model269 model) {
        return new Schema269(model.id(), model.value());
    }
}
