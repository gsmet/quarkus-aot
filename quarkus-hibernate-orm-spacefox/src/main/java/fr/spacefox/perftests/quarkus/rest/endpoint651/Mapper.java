package fr.spacefox.perftests.quarkus.rest.endpoint651;

import fr.spacefox.perftests.quarkus.core.service651.model.Model651;
import fr.spacefox.perftests.quarkus.rest.endpoint651.schema.Schema651;

final class Mapper {
    private Mapper() {}

    public static Schema651 of(Model651 model) {
        return new Schema651(model.id(), model.value());
    }
}
