package fr.spacefox.perftests.quarkus.rest.endpoint555;

import fr.spacefox.perftests.quarkus.core.service555.model.Model555;
import fr.spacefox.perftests.quarkus.rest.endpoint555.schema.Schema555;

final class Mapper {
    private Mapper() {}

    public static Schema555 of(Model555 model) {
        return new Schema555(model.id(), model.value());
    }
}
