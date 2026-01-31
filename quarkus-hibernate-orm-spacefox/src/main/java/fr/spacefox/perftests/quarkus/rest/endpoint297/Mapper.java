package fr.spacefox.perftests.quarkus.rest.endpoint297;

import fr.spacefox.perftests.quarkus.core.service297.model.Model297;
import fr.spacefox.perftests.quarkus.rest.endpoint297.schema.Schema297;

final class Mapper {
    private Mapper() {}

    public static Schema297 of(Model297 model) {
        return new Schema297(model.id(), model.value());
    }
}
