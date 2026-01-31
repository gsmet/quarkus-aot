package fr.spacefox.perftests.quarkus.rest.endpoint689;

import fr.spacefox.perftests.quarkus.core.service689.model.Model689;
import fr.spacefox.perftests.quarkus.rest.endpoint689.schema.Schema689;

final class Mapper {
    private Mapper() {}

    public static Schema689 of(Model689 model) {
        return new Schema689(model.id(), model.value());
    }
}
