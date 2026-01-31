package fr.spacefox.perftests.quarkus.rest.endpoint154;

import fr.spacefox.perftests.quarkus.core.service154.model.Model154;
import fr.spacefox.perftests.quarkus.rest.endpoint154.schema.Schema154;

final class Mapper {
    private Mapper() {}

    public static Schema154 of(Model154 model) {
        return new Schema154(model.id(), model.value());
    }
}
