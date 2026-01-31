package fr.spacefox.perftests.quarkus.rest.endpoint950;

import fr.spacefox.perftests.quarkus.core.service950.model.Model950;
import fr.spacefox.perftests.quarkus.rest.endpoint950.schema.Schema950;

final class Mapper {
    private Mapper() {}

    public static Schema950 of(Model950 model) {
        return new Schema950(model.id(), model.value());
    }
}
