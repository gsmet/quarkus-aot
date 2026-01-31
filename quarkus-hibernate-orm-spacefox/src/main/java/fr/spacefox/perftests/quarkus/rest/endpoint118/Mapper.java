package fr.spacefox.perftests.quarkus.rest.endpoint118;

import fr.spacefox.perftests.quarkus.core.service118.model.Model118;
import fr.spacefox.perftests.quarkus.rest.endpoint118.schema.Schema118;

final class Mapper {
    private Mapper() {}

    public static Schema118 of(Model118 model) {
        return new Schema118(model.id(), model.value());
    }
}
