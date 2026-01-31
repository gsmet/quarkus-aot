package fr.spacefox.perftests.quarkus.rest.endpoint991;

import fr.spacefox.perftests.quarkus.core.service991.model.Model991;
import fr.spacefox.perftests.quarkus.rest.endpoint991.schema.Schema991;

final class Mapper {
    private Mapper() {}

    public static Schema991 of(Model991 model) {
        return new Schema991(model.id(), model.value());
    }
}
