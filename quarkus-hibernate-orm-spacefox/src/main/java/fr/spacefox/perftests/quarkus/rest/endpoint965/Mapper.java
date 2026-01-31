package fr.spacefox.perftests.quarkus.rest.endpoint965;

import fr.spacefox.perftests.quarkus.core.service965.model.Model965;
import fr.spacefox.perftests.quarkus.rest.endpoint965.schema.Schema965;

final class Mapper {
    private Mapper() {}

    public static Schema965 of(Model965 model) {
        return new Schema965(model.id(), model.value());
    }
}
