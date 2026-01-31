package fr.spacefox.perftests.quarkus.rest.endpoint100;

import fr.spacefox.perftests.quarkus.core.service100.model.Model100;
import fr.spacefox.perftests.quarkus.rest.endpoint100.schema.Schema100;

final class Mapper {
    private Mapper() {}

    public static Schema100 of(Model100 model) {
        return new Schema100(model.id(), model.value());
    }
}
