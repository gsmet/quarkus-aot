package fr.spacefox.perftests.quarkus.rest.endpoint152;

import fr.spacefox.perftests.quarkus.core.service152.model.Model152;
import fr.spacefox.perftests.quarkus.rest.endpoint152.schema.Schema152;

final class Mapper {
    private Mapper() {}

    public static Schema152 of(Model152 model) {
        return new Schema152(model.id(), model.value());
    }
}
