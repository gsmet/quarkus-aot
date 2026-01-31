package fr.spacefox.perftests.quarkus.rest.endpoint879;

import fr.spacefox.perftests.quarkus.core.service879.model.Model879;
import fr.spacefox.perftests.quarkus.rest.endpoint879.schema.Schema879;

final class Mapper {
    private Mapper() {}

    public static Schema879 of(Model879 model) {
        return new Schema879(model.id(), model.value());
    }
}
