package fr.spacefox.perftests.quarkus.rest.endpoint501;

import fr.spacefox.perftests.quarkus.core.service501.model.Model501;
import fr.spacefox.perftests.quarkus.rest.endpoint501.schema.Schema501;

final class Mapper {
    private Mapper() {}

    public static Schema501 of(Model501 model) {
        return new Schema501(model.id(), model.value());
    }
}
