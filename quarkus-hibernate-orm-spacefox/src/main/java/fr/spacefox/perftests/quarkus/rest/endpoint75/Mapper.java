package fr.spacefox.perftests.quarkus.rest.endpoint75;

import fr.spacefox.perftests.quarkus.core.service75.model.Model75;
import fr.spacefox.perftests.quarkus.rest.endpoint75.schema.Schema75;

final class Mapper {
    private Mapper() {}

    public static Schema75 of(Model75 model) {
        return new Schema75(model.id(), model.value());
    }
}
