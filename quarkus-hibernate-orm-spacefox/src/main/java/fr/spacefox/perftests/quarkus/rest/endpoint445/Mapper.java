package fr.spacefox.perftests.quarkus.rest.endpoint445;

import fr.spacefox.perftests.quarkus.core.service445.model.Model445;
import fr.spacefox.perftests.quarkus.rest.endpoint445.schema.Schema445;

final class Mapper {
    private Mapper() {}

    public static Schema445 of(Model445 model) {
        return new Schema445(model.id(), model.value());
    }
}
