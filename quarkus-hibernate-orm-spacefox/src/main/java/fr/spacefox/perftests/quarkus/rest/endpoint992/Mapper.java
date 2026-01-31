package fr.spacefox.perftests.quarkus.rest.endpoint992;

import fr.spacefox.perftests.quarkus.core.service992.model.Model992;
import fr.spacefox.perftests.quarkus.rest.endpoint992.schema.Schema992;

final class Mapper {
    private Mapper() {}

    public static Schema992 of(Model992 model) {
        return new Schema992(model.id(), model.value());
    }
}
