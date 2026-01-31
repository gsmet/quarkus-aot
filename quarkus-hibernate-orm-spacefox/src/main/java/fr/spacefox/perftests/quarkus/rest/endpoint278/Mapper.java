package fr.spacefox.perftests.quarkus.rest.endpoint278;

import fr.spacefox.perftests.quarkus.core.service278.model.Model278;
import fr.spacefox.perftests.quarkus.rest.endpoint278.schema.Schema278;

final class Mapper {
    private Mapper() {}

    public static Schema278 of(Model278 model) {
        return new Schema278(model.id(), model.value());
    }
}
