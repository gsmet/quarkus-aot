package fr.spacefox.perftests.quarkus.rest.endpoint141;

import fr.spacefox.perftests.quarkus.core.service141.model.Model141;
import fr.spacefox.perftests.quarkus.rest.endpoint141.schema.Schema141;

final class Mapper {
    private Mapper() {}

    public static Schema141 of(Model141 model) {
        return new Schema141(model.id(), model.value());
    }
}
