package fr.spacefox.perftests.quarkus.rest.endpoint492;

import fr.spacefox.perftests.quarkus.core.service492.model.Model492;
import fr.spacefox.perftests.quarkus.rest.endpoint492.schema.Schema492;

final class Mapper {
    private Mapper() {}

    public static Schema492 of(Model492 model) {
        return new Schema492(model.id(), model.value());
    }
}
