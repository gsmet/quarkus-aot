package fr.spacefox.perftests.quarkus.rest.endpoint301;

import fr.spacefox.perftests.quarkus.core.service301.model.Model301;
import fr.spacefox.perftests.quarkus.rest.endpoint301.schema.Schema301;

final class Mapper {
    private Mapper() {}

    public static Schema301 of(Model301 model) {
        return new Schema301(model.id(), model.value());
    }
}
