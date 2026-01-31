package fr.spacefox.perftests.quarkus.rest.endpoint640;

import fr.spacefox.perftests.quarkus.core.service640.model.Model640;
import fr.spacefox.perftests.quarkus.rest.endpoint640.schema.Schema640;

final class Mapper {
    private Mapper() {}

    public static Schema640 of(Model640 model) {
        return new Schema640(model.id(), model.value());
    }
}
