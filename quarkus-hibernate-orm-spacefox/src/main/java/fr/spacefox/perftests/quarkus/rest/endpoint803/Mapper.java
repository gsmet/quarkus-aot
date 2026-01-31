package fr.spacefox.perftests.quarkus.rest.endpoint803;

import fr.spacefox.perftests.quarkus.core.service803.model.Model803;
import fr.spacefox.perftests.quarkus.rest.endpoint803.schema.Schema803;

final class Mapper {
    private Mapper() {}

    public static Schema803 of(Model803 model) {
        return new Schema803(model.id(), model.value());
    }
}
