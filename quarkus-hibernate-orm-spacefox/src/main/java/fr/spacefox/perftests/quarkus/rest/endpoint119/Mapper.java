package fr.spacefox.perftests.quarkus.rest.endpoint119;

import fr.spacefox.perftests.quarkus.core.service119.model.Model119;
import fr.spacefox.perftests.quarkus.rest.endpoint119.schema.Schema119;

final class Mapper {
    private Mapper() {}

    public static Schema119 of(Model119 model) {
        return new Schema119(model.id(), model.value());
    }
}
