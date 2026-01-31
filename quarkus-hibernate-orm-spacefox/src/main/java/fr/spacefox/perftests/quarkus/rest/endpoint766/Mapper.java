package fr.spacefox.perftests.quarkus.rest.endpoint766;

import fr.spacefox.perftests.quarkus.core.service766.model.Model766;
import fr.spacefox.perftests.quarkus.rest.endpoint766.schema.Schema766;

final class Mapper {
    private Mapper() {}

    public static Schema766 of(Model766 model) {
        return new Schema766(model.id(), model.value());
    }
}
