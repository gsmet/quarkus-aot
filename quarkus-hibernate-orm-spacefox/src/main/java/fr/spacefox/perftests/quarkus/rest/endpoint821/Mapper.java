package fr.spacefox.perftests.quarkus.rest.endpoint821;

import fr.spacefox.perftests.quarkus.core.service821.model.Model821;
import fr.spacefox.perftests.quarkus.rest.endpoint821.schema.Schema821;

final class Mapper {
    private Mapper() {}

    public static Schema821 of(Model821 model) {
        return new Schema821(model.id(), model.value());
    }
}
