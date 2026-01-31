package fr.spacefox.perftests.quarkus.rest.endpoint72;

import fr.spacefox.perftests.quarkus.core.service72.model.Model72;
import fr.spacefox.perftests.quarkus.rest.endpoint72.schema.Schema72;

final class Mapper {
    private Mapper() {}

    public static Schema72 of(Model72 model) {
        return new Schema72(model.id(), model.value());
    }
}
