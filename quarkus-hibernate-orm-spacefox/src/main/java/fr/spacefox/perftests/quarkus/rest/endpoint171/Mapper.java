package fr.spacefox.perftests.quarkus.rest.endpoint171;

import fr.spacefox.perftests.quarkus.core.service171.model.Model171;
import fr.spacefox.perftests.quarkus.rest.endpoint171.schema.Schema171;

final class Mapper {
    private Mapper() {}

    public static Schema171 of(Model171 model) {
        return new Schema171(model.id(), model.value());
    }
}
