package fr.spacefox.perftests.quarkus.rest.endpoint737;

import fr.spacefox.perftests.quarkus.core.service737.model.Model737;
import fr.spacefox.perftests.quarkus.rest.endpoint737.schema.Schema737;

final class Mapper {
    private Mapper() {}

    public static Schema737 of(Model737 model) {
        return new Schema737(model.id(), model.value());
    }
}
