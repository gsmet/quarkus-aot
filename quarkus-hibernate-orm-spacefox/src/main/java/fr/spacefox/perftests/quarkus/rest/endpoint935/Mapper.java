package fr.spacefox.perftests.quarkus.rest.endpoint935;

import fr.spacefox.perftests.quarkus.core.service935.model.Model935;
import fr.spacefox.perftests.quarkus.rest.endpoint935.schema.Schema935;

final class Mapper {
    private Mapper() {}

    public static Schema935 of(Model935 model) {
        return new Schema935(model.id(), model.value());
    }
}
