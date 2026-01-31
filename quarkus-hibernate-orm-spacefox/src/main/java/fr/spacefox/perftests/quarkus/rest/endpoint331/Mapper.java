package fr.spacefox.perftests.quarkus.rest.endpoint331;

import fr.spacefox.perftests.quarkus.core.service331.model.Model331;
import fr.spacefox.perftests.quarkus.rest.endpoint331.schema.Schema331;

final class Mapper {
    private Mapper() {}

    public static Schema331 of(Model331 model) {
        return new Schema331(model.id(), model.value());
    }
}
