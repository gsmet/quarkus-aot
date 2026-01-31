package fr.spacefox.perftests.quarkus.rest.endpoint559;

import fr.spacefox.perftests.quarkus.core.service559.model.Model559;
import fr.spacefox.perftests.quarkus.rest.endpoint559.schema.Schema559;

final class Mapper {
    private Mapper() {}

    public static Schema559 of(Model559 model) {
        return new Schema559(model.id(), model.value());
    }
}
