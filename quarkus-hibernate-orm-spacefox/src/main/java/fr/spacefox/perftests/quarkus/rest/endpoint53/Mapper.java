package fr.spacefox.perftests.quarkus.rest.endpoint53;

import fr.spacefox.perftests.quarkus.core.service53.model.Model53;
import fr.spacefox.perftests.quarkus.rest.endpoint53.schema.Schema53;

final class Mapper {
    private Mapper() {}

    public static Schema53 of(Model53 model) {
        return new Schema53(model.id(), model.value());
    }
}
