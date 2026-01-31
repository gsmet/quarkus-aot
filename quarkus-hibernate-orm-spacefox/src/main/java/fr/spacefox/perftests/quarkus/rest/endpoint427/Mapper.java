package fr.spacefox.perftests.quarkus.rest.endpoint427;

import fr.spacefox.perftests.quarkus.core.service427.model.Model427;
import fr.spacefox.perftests.quarkus.rest.endpoint427.schema.Schema427;

final class Mapper {
    private Mapper() {}

    public static Schema427 of(Model427 model) {
        return new Schema427(model.id(), model.value());
    }
}
