package fr.spacefox.perftests.quarkus.rest.endpoint193;

import fr.spacefox.perftests.quarkus.core.service193.model.Model193;
import fr.spacefox.perftests.quarkus.rest.endpoint193.schema.Schema193;

final class Mapper {
    private Mapper() {}

    public static Schema193 of(Model193 model) {
        return new Schema193(model.id(), model.value());
    }
}
