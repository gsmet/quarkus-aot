package fr.spacefox.perftests.quarkus.rest.endpoint143;

import fr.spacefox.perftests.quarkus.core.service143.model.Model143;
import fr.spacefox.perftests.quarkus.rest.endpoint143.schema.Schema143;

final class Mapper {
    private Mapper() {}

    public static Schema143 of(Model143 model) {
        return new Schema143(model.id(), model.value());
    }
}
