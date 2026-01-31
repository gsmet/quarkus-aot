package fr.spacefox.perftests.quarkus.rest.endpoint904;

import fr.spacefox.perftests.quarkus.core.service904.model.Model904;
import fr.spacefox.perftests.quarkus.rest.endpoint904.schema.Schema904;

final class Mapper {
    private Mapper() {}

    public static Schema904 of(Model904 model) {
        return new Schema904(model.id(), model.value());
    }
}
