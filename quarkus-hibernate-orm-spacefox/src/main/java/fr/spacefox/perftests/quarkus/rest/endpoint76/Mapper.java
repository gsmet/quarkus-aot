package fr.spacefox.perftests.quarkus.rest.endpoint76;

import fr.spacefox.perftests.quarkus.core.service76.model.Model76;
import fr.spacefox.perftests.quarkus.rest.endpoint76.schema.Schema76;

final class Mapper {
    private Mapper() {}

    public static Schema76 of(Model76 model) {
        return new Schema76(model.id(), model.value());
    }
}
