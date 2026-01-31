package fr.spacefox.perftests.quarkus.rest.endpoint848;

import fr.spacefox.perftests.quarkus.core.service848.model.Model848;
import fr.spacefox.perftests.quarkus.rest.endpoint848.schema.Schema848;

final class Mapper {
    private Mapper() {}

    public static Schema848 of(Model848 model) {
        return new Schema848(model.id(), model.value());
    }
}
