package fr.spacefox.perftests.quarkus.rest.endpoint447;

import fr.spacefox.perftests.quarkus.core.service447.model.Model447;
import fr.spacefox.perftests.quarkus.rest.endpoint447.schema.Schema447;

final class Mapper {
    private Mapper() {}

    public static Schema447 of(Model447 model) {
        return new Schema447(model.id(), model.value());
    }
}
