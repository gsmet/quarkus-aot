package fr.spacefox.perftests.quarkus.rest.endpoint234;

import fr.spacefox.perftests.quarkus.core.service234.model.Model234;
import fr.spacefox.perftests.quarkus.rest.endpoint234.schema.Schema234;

final class Mapper {
    private Mapper() {}

    public static Schema234 of(Model234 model) {
        return new Schema234(model.id(), model.value());
    }
}
