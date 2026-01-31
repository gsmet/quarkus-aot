package fr.spacefox.perftests.quarkus.rest.endpoint600;

import fr.spacefox.perftests.quarkus.core.service600.model.Model600;
import fr.spacefox.perftests.quarkus.rest.endpoint600.schema.Schema600;

final class Mapper {
    private Mapper() {}

    public static Schema600 of(Model600 model) {
        return new Schema600(model.id(), model.value());
    }
}
