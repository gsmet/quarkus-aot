package fr.spacefox.perftests.quarkus.rest.endpoint872;

import fr.spacefox.perftests.quarkus.core.service872.model.Model872;
import fr.spacefox.perftests.quarkus.rest.endpoint872.schema.Schema872;

final class Mapper {
    private Mapper() {}

    public static Schema872 of(Model872 model) {
        return new Schema872(model.id(), model.value());
    }
}
