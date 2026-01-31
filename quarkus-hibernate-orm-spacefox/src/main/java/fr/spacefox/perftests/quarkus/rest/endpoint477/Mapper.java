package fr.spacefox.perftests.quarkus.rest.endpoint477;

import fr.spacefox.perftests.quarkus.core.service477.model.Model477;
import fr.spacefox.perftests.quarkus.rest.endpoint477.schema.Schema477;

final class Mapper {
    private Mapper() {}

    public static Schema477 of(Model477 model) {
        return new Schema477(model.id(), model.value());
    }
}
