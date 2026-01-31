package fr.spacefox.perftests.quarkus.rest.endpoint123;

import fr.spacefox.perftests.quarkus.core.service123.model.Model123;
import fr.spacefox.perftests.quarkus.rest.endpoint123.schema.Schema123;

final class Mapper {
    private Mapper() {}

    public static Schema123 of(Model123 model) {
        return new Schema123(model.id(), model.value());
    }
}
