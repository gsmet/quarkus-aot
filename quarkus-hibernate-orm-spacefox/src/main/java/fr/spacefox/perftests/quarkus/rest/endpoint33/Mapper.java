package fr.spacefox.perftests.quarkus.rest.endpoint33;

import fr.spacefox.perftests.quarkus.core.service33.model.Model33;
import fr.spacefox.perftests.quarkus.rest.endpoint33.schema.Schema33;

final class Mapper {
    private Mapper() {}

    public static Schema33 of(Model33 model) {
        return new Schema33(model.id(), model.value());
    }
}
