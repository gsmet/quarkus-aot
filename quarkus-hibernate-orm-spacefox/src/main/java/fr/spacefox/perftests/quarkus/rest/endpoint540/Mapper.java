package fr.spacefox.perftests.quarkus.rest.endpoint540;

import fr.spacefox.perftests.quarkus.core.service540.model.Model540;
import fr.spacefox.perftests.quarkus.rest.endpoint540.schema.Schema540;

final class Mapper {
    private Mapper() {}

    public static Schema540 of(Model540 model) {
        return new Schema540(model.id(), model.value());
    }
}
