package fr.spacefox.perftests.quarkus.rest.endpoint352;

import fr.spacefox.perftests.quarkus.core.service352.model.Model352;
import fr.spacefox.perftests.quarkus.rest.endpoint352.schema.Schema352;

final class Mapper {
    private Mapper() {}

    public static Schema352 of(Model352 model) {
        return new Schema352(model.id(), model.value());
    }
}
