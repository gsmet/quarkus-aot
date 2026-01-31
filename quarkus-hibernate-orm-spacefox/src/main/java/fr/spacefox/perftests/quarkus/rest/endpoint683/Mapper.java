package fr.spacefox.perftests.quarkus.rest.endpoint683;

import fr.spacefox.perftests.quarkus.core.service683.model.Model683;
import fr.spacefox.perftests.quarkus.rest.endpoint683.schema.Schema683;

final class Mapper {
    private Mapper() {}

    public static Schema683 of(Model683 model) {
        return new Schema683(model.id(), model.value());
    }
}
