package fr.spacefox.perftests.quarkus.rest.endpoint356;

import fr.spacefox.perftests.quarkus.core.service356.model.Model356;
import fr.spacefox.perftests.quarkus.rest.endpoint356.schema.Schema356;

final class Mapper {
    private Mapper() {}

    public static Schema356 of(Model356 model) {
        return new Schema356(model.id(), model.value());
    }
}
