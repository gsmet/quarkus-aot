package fr.spacefox.perftests.quarkus.rest.endpoint802;

import fr.spacefox.perftests.quarkus.core.service802.model.Model802;
import fr.spacefox.perftests.quarkus.rest.endpoint802.schema.Schema802;

final class Mapper {
    private Mapper() {}

    public static Schema802 of(Model802 model) {
        return new Schema802(model.id(), model.value());
    }
}
