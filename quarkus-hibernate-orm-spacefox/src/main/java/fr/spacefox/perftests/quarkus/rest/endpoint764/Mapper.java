package fr.spacefox.perftests.quarkus.rest.endpoint764;

import fr.spacefox.perftests.quarkus.core.service764.model.Model764;
import fr.spacefox.perftests.quarkus.rest.endpoint764.schema.Schema764;

final class Mapper {
    private Mapper() {}

    public static Schema764 of(Model764 model) {
        return new Schema764(model.id(), model.value());
    }
}
