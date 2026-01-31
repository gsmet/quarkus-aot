package fr.spacefox.perftests.quarkus.rest.endpoint261;

import fr.spacefox.perftests.quarkus.core.service261.model.Model261;
import fr.spacefox.perftests.quarkus.rest.endpoint261.schema.Schema261;

final class Mapper {
    private Mapper() {}

    public static Schema261 of(Model261 model) {
        return new Schema261(model.id(), model.value());
    }
}
