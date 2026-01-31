package fr.spacefox.perftests.quarkus.rest.endpoint868;

import fr.spacefox.perftests.quarkus.core.service868.model.Model868;
import fr.spacefox.perftests.quarkus.rest.endpoint868.schema.Schema868;

final class Mapper {
    private Mapper() {}

    public static Schema868 of(Model868 model) {
        return new Schema868(model.id(), model.value());
    }
}
