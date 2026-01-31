package fr.spacefox.perftests.quarkus.rest.endpoint237;

import fr.spacefox.perftests.quarkus.core.service237.model.Model237;
import fr.spacefox.perftests.quarkus.rest.endpoint237.schema.Schema237;

final class Mapper {
    private Mapper() {}

    public static Schema237 of(Model237 model) {
        return new Schema237(model.id(), model.value());
    }
}
