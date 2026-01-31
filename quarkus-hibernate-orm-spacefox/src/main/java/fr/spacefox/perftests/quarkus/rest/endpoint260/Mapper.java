package fr.spacefox.perftests.quarkus.rest.endpoint260;

import fr.spacefox.perftests.quarkus.core.service260.model.Model260;
import fr.spacefox.perftests.quarkus.rest.endpoint260.schema.Schema260;

final class Mapper {
    private Mapper() {}

    public static Schema260 of(Model260 model) {
        return new Schema260(model.id(), model.value());
    }
}
