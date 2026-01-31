package fr.spacefox.perftests.quarkus.rest.endpoint944;

import fr.spacefox.perftests.quarkus.core.service944.model.Model944;
import fr.spacefox.perftests.quarkus.rest.endpoint944.schema.Schema944;

final class Mapper {
    private Mapper() {}

    public static Schema944 of(Model944 model) {
        return new Schema944(model.id(), model.value());
    }
}
