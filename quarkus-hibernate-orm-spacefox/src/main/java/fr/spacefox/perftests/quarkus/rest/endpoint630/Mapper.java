package fr.spacefox.perftests.quarkus.rest.endpoint630;

import fr.spacefox.perftests.quarkus.core.service630.model.Model630;
import fr.spacefox.perftests.quarkus.rest.endpoint630.schema.Schema630;

final class Mapper {
    private Mapper() {}

    public static Schema630 of(Model630 model) {
        return new Schema630(model.id(), model.value());
    }
}
