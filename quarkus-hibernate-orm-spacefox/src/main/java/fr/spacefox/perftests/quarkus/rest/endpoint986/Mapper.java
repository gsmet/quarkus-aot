package fr.spacefox.perftests.quarkus.rest.endpoint986;

import fr.spacefox.perftests.quarkus.core.service986.model.Model986;
import fr.spacefox.perftests.quarkus.rest.endpoint986.schema.Schema986;

final class Mapper {
    private Mapper() {}

    public static Schema986 of(Model986 model) {
        return new Schema986(model.id(), model.value());
    }
}
