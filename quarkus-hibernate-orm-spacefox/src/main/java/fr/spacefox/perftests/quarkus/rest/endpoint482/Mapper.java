package fr.spacefox.perftests.quarkus.rest.endpoint482;

import fr.spacefox.perftests.quarkus.core.service482.model.Model482;
import fr.spacefox.perftests.quarkus.rest.endpoint482.schema.Schema482;

final class Mapper {
    private Mapper() {}

    public static Schema482 of(Model482 model) {
        return new Schema482(model.id(), model.value());
    }
}
