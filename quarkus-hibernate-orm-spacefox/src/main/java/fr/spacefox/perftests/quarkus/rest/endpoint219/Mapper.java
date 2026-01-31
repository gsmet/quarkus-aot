package fr.spacefox.perftests.quarkus.rest.endpoint219;

import fr.spacefox.perftests.quarkus.core.service219.model.Model219;
import fr.spacefox.perftests.quarkus.rest.endpoint219.schema.Schema219;

final class Mapper {
    private Mapper() {}

    public static Schema219 of(Model219 model) {
        return new Schema219(model.id(), model.value());
    }
}
