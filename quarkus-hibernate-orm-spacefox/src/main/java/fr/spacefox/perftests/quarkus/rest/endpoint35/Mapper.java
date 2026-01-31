package fr.spacefox.perftests.quarkus.rest.endpoint35;

import fr.spacefox.perftests.quarkus.core.service35.model.Model35;
import fr.spacefox.perftests.quarkus.rest.endpoint35.schema.Schema35;

final class Mapper {
    private Mapper() {}

    public static Schema35 of(Model35 model) {
        return new Schema35(model.id(), model.value());
    }
}
