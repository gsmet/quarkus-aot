package fr.spacefox.perftests.quarkus.rest.endpoint25;

import fr.spacefox.perftests.quarkus.core.service25.model.Model25;
import fr.spacefox.perftests.quarkus.rest.endpoint25.schema.Schema25;

final class Mapper {
    private Mapper() {}

    public static Schema25 of(Model25 model) {
        return new Schema25(model.id(), model.value());
    }
}
