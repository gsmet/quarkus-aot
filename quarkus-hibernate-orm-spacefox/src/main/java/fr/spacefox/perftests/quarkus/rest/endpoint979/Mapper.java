package fr.spacefox.perftests.quarkus.rest.endpoint979;

import fr.spacefox.perftests.quarkus.core.service979.model.Model979;
import fr.spacefox.perftests.quarkus.rest.endpoint979.schema.Schema979;

final class Mapper {
    private Mapper() {}

    public static Schema979 of(Model979 model) {
        return new Schema979(model.id(), model.value());
    }
}
