package fr.spacefox.perftests.quarkus.rest.endpoint530;

import fr.spacefox.perftests.quarkus.core.service530.model.Model530;
import fr.spacefox.perftests.quarkus.rest.endpoint530.schema.Schema530;

final class Mapper {
    private Mapper() {}

    public static Schema530 of(Model530 model) {
        return new Schema530(model.id(), model.value());
    }
}
