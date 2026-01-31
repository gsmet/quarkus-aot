package fr.spacefox.perftests.quarkus.rest.endpoint479;

import fr.spacefox.perftests.quarkus.core.service479.model.Model479;
import fr.spacefox.perftests.quarkus.rest.endpoint479.schema.Schema479;

final class Mapper {
    private Mapper() {}

    public static Schema479 of(Model479 model) {
        return new Schema479(model.id(), model.value());
    }
}
