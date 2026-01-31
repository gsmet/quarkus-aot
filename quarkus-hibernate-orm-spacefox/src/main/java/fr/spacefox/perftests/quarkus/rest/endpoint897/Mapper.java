package fr.spacefox.perftests.quarkus.rest.endpoint897;

import fr.spacefox.perftests.quarkus.core.service897.model.Model897;
import fr.spacefox.perftests.quarkus.rest.endpoint897.schema.Schema897;

final class Mapper {
    private Mapper() {}

    public static Schema897 of(Model897 model) {
        return new Schema897(model.id(), model.value());
    }
}
