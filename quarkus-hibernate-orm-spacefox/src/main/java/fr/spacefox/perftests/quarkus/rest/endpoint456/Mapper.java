package fr.spacefox.perftests.quarkus.rest.endpoint456;

import fr.spacefox.perftests.quarkus.core.service456.model.Model456;
import fr.spacefox.perftests.quarkus.rest.endpoint456.schema.Schema456;

final class Mapper {
    private Mapper() {}

    public static Schema456 of(Model456 model) {
        return new Schema456(model.id(), model.value());
    }
}
