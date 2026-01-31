package fr.spacefox.perftests.quarkus.rest.endpoint50;

import fr.spacefox.perftests.quarkus.core.service50.model.Model50;
import fr.spacefox.perftests.quarkus.rest.endpoint50.schema.Schema50;

final class Mapper {
    private Mapper() {}

    public static Schema50 of(Model50 model) {
        return new Schema50(model.id(), model.value());
    }
}
