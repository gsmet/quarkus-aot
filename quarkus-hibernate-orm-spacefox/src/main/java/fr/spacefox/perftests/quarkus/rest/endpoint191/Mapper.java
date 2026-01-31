package fr.spacefox.perftests.quarkus.rest.endpoint191;

import fr.spacefox.perftests.quarkus.core.service191.model.Model191;
import fr.spacefox.perftests.quarkus.rest.endpoint191.schema.Schema191;

final class Mapper {
    private Mapper() {}

    public static Schema191 of(Model191 model) {
        return new Schema191(model.id(), model.value());
    }
}
