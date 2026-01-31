package fr.spacefox.perftests.quarkus.rest.endpoint718;

import fr.spacefox.perftests.quarkus.core.service718.model.Model718;
import fr.spacefox.perftests.quarkus.rest.endpoint718.schema.Schema718;

final class Mapper {
    private Mapper() {}

    public static Schema718 of(Model718 model) {
        return new Schema718(model.id(), model.value());
    }
}
