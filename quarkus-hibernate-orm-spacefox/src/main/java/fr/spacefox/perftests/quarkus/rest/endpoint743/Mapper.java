package fr.spacefox.perftests.quarkus.rest.endpoint743;

import fr.spacefox.perftests.quarkus.core.service743.model.Model743;
import fr.spacefox.perftests.quarkus.rest.endpoint743.schema.Schema743;

final class Mapper {
    private Mapper() {}

    public static Schema743 of(Model743 model) {
        return new Schema743(model.id(), model.value());
    }
}
