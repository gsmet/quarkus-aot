package fr.spacefox.perftests.quarkus.rest.endpoint126;

import fr.spacefox.perftests.quarkus.core.service126.model.Model126;
import fr.spacefox.perftests.quarkus.rest.endpoint126.schema.Schema126;

final class Mapper {
    private Mapper() {}

    public static Schema126 of(Model126 model) {
        return new Schema126(model.id(), model.value());
    }
}
