package fr.spacefox.perftests.quarkus.rest.endpoint40;

import fr.spacefox.perftests.quarkus.core.service40.model.Model40;
import fr.spacefox.perftests.quarkus.rest.endpoint40.schema.Schema40;

final class Mapper {
    private Mapper() {}

    public static Schema40 of(Model40 model) {
        return new Schema40(model.id(), model.value());
    }
}
