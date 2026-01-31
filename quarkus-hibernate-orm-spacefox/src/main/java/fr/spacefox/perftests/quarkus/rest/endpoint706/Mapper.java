package fr.spacefox.perftests.quarkus.rest.endpoint706;

import fr.spacefox.perftests.quarkus.core.service706.model.Model706;
import fr.spacefox.perftests.quarkus.rest.endpoint706.schema.Schema706;

final class Mapper {
    private Mapper() {}

    public static Schema706 of(Model706 model) {
        return new Schema706(model.id(), model.value());
    }
}
