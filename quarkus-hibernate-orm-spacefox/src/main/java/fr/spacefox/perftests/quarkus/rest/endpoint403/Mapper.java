package fr.spacefox.perftests.quarkus.rest.endpoint403;

import fr.spacefox.perftests.quarkus.core.service403.model.Model403;
import fr.spacefox.perftests.quarkus.rest.endpoint403.schema.Schema403;

final class Mapper {
    private Mapper() {}

    public static Schema403 of(Model403 model) {
        return new Schema403(model.id(), model.value());
    }
}
