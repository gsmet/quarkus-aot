package fr.spacefox.perftests.quarkus.rest.endpoint329;

import fr.spacefox.perftests.quarkus.core.service329.model.Model329;
import fr.spacefox.perftests.quarkus.rest.endpoint329.schema.Schema329;

final class Mapper {
    private Mapper() {}

    public static Schema329 of(Model329 model) {
        return new Schema329(model.id(), model.value());
    }
}
