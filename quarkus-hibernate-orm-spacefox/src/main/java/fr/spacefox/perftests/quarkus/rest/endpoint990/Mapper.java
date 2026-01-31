package fr.spacefox.perftests.quarkus.rest.endpoint990;

import fr.spacefox.perftests.quarkus.core.service990.model.Model990;
import fr.spacefox.perftests.quarkus.rest.endpoint990.schema.Schema990;

final class Mapper {
    private Mapper() {}

    public static Schema990 of(Model990 model) {
        return new Schema990(model.id(), model.value());
    }
}
